package com.zw.web.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CarInfoPictureDto implements Serializable {

        private Long id;

        private Long cid;

        private Long pictureId;

        private List name;

        private List originalName;
}
