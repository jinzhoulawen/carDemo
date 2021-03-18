package com.zw.web.model.dto;

import java.io.Serializable;

public class PubFileDto implements Serializable {
    private String name;

    private String originalName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }
}
