package com.zw.web.model.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class CarConsultInfoDto implements Serializable {

    private Long id;

    /**
     * 关联用户ID,创建人
     */
    private Long uid;

    /**
    *发帖人名字
    */
    private String userName;
    /**
     * 帖子标题
     */

    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 帖子创建时间
     */
    private Long createDate;
}
