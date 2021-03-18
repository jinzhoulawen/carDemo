package com.zw.web.mapper;

import com.zw.web.model.dto.PubFileDto;
import com.zw.web.service.PubFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/pub/file")
public class PubFileController {

    @Autowired
    private PubFileService fileService;

    @PostMapping(value = "/upload")
    @ResponseBody
    public PubFileDto upload(@RequestParam("file") MultipartFile file) {
        return this.fileService.upload(file);
    }
}
