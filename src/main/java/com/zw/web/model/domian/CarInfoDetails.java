package com.zw.web.model.domian;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2021-04-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CarInfoDetails implements Serializable {

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

    private String carDisplacement;

    /**
     * 进气形式
     */
    private String carAir;

    /**
     * 气缸数
     */
    private String carCylinders;

    /**
     * 最大马力(Ps)
     */
    @TableField("car_horsepowerMax")
    private String carHorsepowermax;

    /**
     * 最大扭矩(N*m)
     */
    @TableField("car_torqueMax")
    private String carTorquemax;

    /**
     * 燃料类型
     */
    @TableField("car_fuelType")
    private String carFueltype;

    /**
     * 燃油标号
     */
    @TableField("car_fuelLabel")
    private String carFuellabel;

    /**
     * 供油方式
     */
    @TableField("car_supplyWay")
    private String carSupplyway;


}
