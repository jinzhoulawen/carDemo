package com.zw.web.blog.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 身份
     */
    private Integer identity;

    /**
     * 车辆的浏览记录
     */
    private Long userCarHistoryId;

    /**
     * 车辆的收藏记录
     */
    private Long userCarCollectionId;

    /**
     * 是否已经被封号
     */
    private String ban;


}
