package com.zw.web.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

public class StringToListConverter implements Converter<String, List> {
    ObjectMapper objectMapper=new ObjectMapper();
    @Override
    public List convert(String s) {
        List list=null;
        try {
            list=objectMapper.readValue(s, new TypeReference<List>() {
            });

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return list;
    }

}
