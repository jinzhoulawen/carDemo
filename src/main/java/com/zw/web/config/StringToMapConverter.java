package com.zw.web.config;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zw.web.model.dto.PageQuery;
import org.beetl.ext.simulate.JsonUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class StringToMapConverter implements Converter<String, Map> {
    @Override
    public Map convert(String s) {
        ObjectMapper objectMapper=new ObjectMapper();
        if (s!=null&&!"".equals(s)){
            try{
               Map map  = objectMapper.readValue(s,Map.class);
                return map;
            }catch (Exception e){e.printStackTrace();}
        }
        return null;
    }
}
