package com.zw.web.model.domian;

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
public class CarInfoPicture implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    /**
     * 关联到pub_file主键
     */
    private Long pictureId;

    /**
     * 关联到car_info主键
     */
    private Long cid;


}
