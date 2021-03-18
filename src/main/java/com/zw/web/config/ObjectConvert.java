package com.zw.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.model.dto.PageQuery;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ObjectConvert implements Converter<String, PageQuery> {
    @Override
    public PageQuery convert(String s) {
        ObjectMapper objectMapper=new ObjectMapper();
        if (s!=null&&!"".equals(s)){
            try{
                PageQuery pageQuery = objectMapper.readValue(s,PageQuery.class);
                return pageQuery;
            }catch (Exception e){e.printStackTrace();}
        }
        return null;
    }

}
