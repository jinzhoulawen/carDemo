package com.zw.web.model.domian;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName(value = "car_info")
@Data
public class Car {
    private Long id;

    private String carModelName;

    private String carBrand;

    private String carBrandName;

    private String carYears;

    private String carDisplacement;

    private String carRegistrationTime;

    private String carMileage;

    private String carTransmission;

    private String carPrice;

    private String carChangeTimes;

    private Long carCollectionNumbers;

    private Long carHistoryNumbers;

    private String carHeat;

    private String carCreateDate;


}
