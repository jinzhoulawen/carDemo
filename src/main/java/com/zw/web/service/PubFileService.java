package com.zw.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zw.web.model.domian.PubFile;
import com.zw.web.model.dto.PubFileDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface PubFileService extends IService<PubFile> {

    PubFileDto upload(MultipartFile file);
    List< PubFile> batchGetIdEntityListByNames(List<String> names);
}
