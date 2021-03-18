package com.zw.web.model.domian;

import lombok.Data;

@Data
public class PubFile {

    private Long id;
    //文件名，包含后缀。重命名后的文件
    private String name;

    //文件名，包含后缀。重命名后的文件
    private String originalName;

    //文件后缀（带有'.'符号）
    private String suffix;

    //文件存储路径（文件夹绝对路径）
    private String storagePath;
}
