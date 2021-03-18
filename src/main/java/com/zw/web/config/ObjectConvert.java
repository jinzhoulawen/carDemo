package com.zw.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zw.web.model.domian.Car;
import org.springframework.core.convert.converter.Converter;

public class ObjectConvert implements Converter<String, Car> {
    @Override
    public Car convert(String s) {
        ObjectMapper objectMapper=new ObjectMapper();
        if (s!=null&&!"".equals(s)){
            try{
                Car car = objectMapper.readValue(s,Car.class);
                return car;
            }catch (Exception e){e.printStackTrace();}
        }
        return null;
    }
}
