package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.mapper.PubFileMapper;
import com.zw.web.model.domian.PubFile;
import com.zw.web.model.dto.PubFileDto;
import com.zw.web.service.PubFileService;
import com.zw.web.utils.MD5Coder;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class PubFileServiceImpl extends ServiceImpl<PubFileMapper, PubFile> implements PubFileService {

    @Value("${file.storage.path}")
    private String fileStoragePath;

    @Override
    public PubFileDto upload(MultipartFile file) {
        PubFile fileEntity = new PubFile();
        fileEntity.setOriginalName(file.getOriginalFilename());
        String suffix = null;
        if (file.getOriginalFilename().contains(".")) {
            // 获取文件后缀，带.号
            suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            // 获取文件名去掉后缀，带.号
            //noSuffix = file.getOriginalFilename().substring(0,file.getOriginalFilename().lastIndexOf("."));
        }
        //加密
        fileEntity.setName(MD5Coder.MD5(UUID.randomUUID().toString().replace("-", "").toUpperCase() + RandomUtils.nextInt(100, 900)) + suffix);

        fileEntity.setSuffix(suffix);

        fileEntity.setStoragePath(this.fileStoragePath+ fileEntity.getName());
        System.out.println(fileEntity.getStoragePath());
        File newFile = new File(fileEntity.getStoragePath());

        try {
            file.transferTo(newFile.getAbsoluteFile());
            try {
                this.save(fileEntity);

            }catch (Exception e){e.printStackTrace();}
            PubFileDto ret = new PubFileDto();
            ret.setOriginalName(fileEntity.getOriginalName());
            ret.setName(fileEntity.getName());
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<PubFile> batchGetIdEntityListByNames(List<String> names) {
        Map<String, PubFile> retMap = new HashMap<>();
        if (CollectionUtils.isNotEmpty(names)) {
            List<String> formatNames = names.stream().filter(v -> v != null).collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(formatNames)) {
                List<PubFile> fileList = this.list(Wrappers.<PubFile>lambdaQuery().in(PubFile::getName, formatNames));
//                if (CollectionUtils.isNotEmpty(fileList)) {
//                    retMap.putAll(fileList.stream().collect(Collectors.toMap(PubFile::getName, v -> v)));
//                }
                return fileList;
            }
        }
        return null;
    }

    public void getImage(String name, HttpServletResponse rsp){

        PubFile pubFile = this.getOne(Wrappers.<PubFile>lambdaQuery().eq(PubFile::getName,name));

        File imageFile = new File(pubFile.getStoragePath());
        if (imageFile.exists()) {
            FileInputStream fis = null;
            OutputStream os = null;
            try {
                fis = new FileInputStream(imageFile);
                os = rsp.getOutputStream();
                int count = 0;
                byte[] buffer = new byte[1024 * 8];
                while ((count = fis.read(buffer)) != -1) {
                    os.write(buffer, 0, count);
                    os.flush();
                }
            } catch (Exception e) {
                System.out.println("显示图片报错"+ e);
            } finally {
                try {
                    fis.close();
                    os.close();
                } catch (IOException e) {
                    System.out.println("显示图片关闭流失败"+e);

                }
            }

        }else {
            System.out.println("图片地址错误");

        }
    }
}
