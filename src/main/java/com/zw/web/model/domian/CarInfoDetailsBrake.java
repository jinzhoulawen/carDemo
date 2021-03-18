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
public class CarInfoDetailsBrake implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 驱动方式
     */
    private String carDriveWay;

    /**
     * 助力类型
     */
    private String carPowerType;

    /**
     * 前悬挂类型
     */
    private String carFrontSuspension;

    /**
     * 后悬挂类型
     */
    private String carAfterSuspension;

    /**
     * 前制动类型
     */
    private String carFrontBrake;

    /**
     * 后制动类型
     */
    private String carAfterBrake;

    /**
     * 驱车制动类型
     */
    private String carDriveBrake;

    /**
     * 前轮胎规格
     */
    private String carFrontTires;

    /**
     * 后轮胎规格
     */
    private String carAfterTires;

    /**
     * 关联car_id
     */
    private Long cid;


}
