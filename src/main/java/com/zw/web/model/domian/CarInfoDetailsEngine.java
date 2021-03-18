package com.zw.web.model.domian;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CarInfoDetailsEngine implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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

    /**
     * 关联car_id
     */
    private Long cid;


}
