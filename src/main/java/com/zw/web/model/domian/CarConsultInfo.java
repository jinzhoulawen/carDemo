package com.zw.web.model.domian;

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
public class CarConsultInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID,创建人
     */
    private Long uid;

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
