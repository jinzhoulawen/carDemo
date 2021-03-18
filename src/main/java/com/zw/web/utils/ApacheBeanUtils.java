package com.zw.web.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.IntegerConverter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ApacheBeanUtils {
    static {
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
    }

    public static void populate(Object bean, Map<String, ? extends Object> properties) throws IllegalAccessException, InvocationTargetException {
        BeanUtils.populate(bean, properties);
    }
}
