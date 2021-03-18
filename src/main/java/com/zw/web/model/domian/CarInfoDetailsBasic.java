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
public class CarInfoDetailsBasic implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    /**
     * 厂商
     */
    private String carVendor;

    /**
     * 级别
     */
    private String carLevel;

    /**
     * 发动机
     */
    private String carEngine;

    /**
     * 变速箱
     */
    private String carTransmission;

    /**
     * 车身结构
     */
    private String carStructure;

    /**
     * 长/宽/高(mm)
     */
    private String carSize;

    /**
     * 轴距(mm)
     */
    private String carWheelbase;

    /**
     * 行李箱容积(L)
     */
    private String carVolume;

    /**
     * 关联car_id
     */
    private Long cid;


}
