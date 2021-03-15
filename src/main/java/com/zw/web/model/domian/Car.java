package com.zw.web.model.domian;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName(value = "car_info")
@Data
public class Car {
    private Integer id;

    private String modelName;

    private String brand;

    private String brandName;

    private String years;

    private String displacement;

    private String registrationTime;

    private String mileage;

    private String transmission;

    private String price;

    private String changeTimes;

    private String collectionNumbers;
    private String historyNumbers;



}
