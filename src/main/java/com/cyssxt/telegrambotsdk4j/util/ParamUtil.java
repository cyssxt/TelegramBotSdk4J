package com.cyssxt.telegrambotsdk4j.util;

import com.alibaba.fastjson.annotation.JSONField;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ParamUtil {
    public static Map<String,Object> parse(Object param){
        Class<?> clazz = param.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        Map<String,Object> paramMap = new HashMap<>();
        for (Field declaredField : declaredFields) {
            String fieldName = declaredField.getName();
            Object value = null;
            try {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName,clazz);
                Method readMethod = propertyDescriptor.getReadMethod();
                value = readMethod.invoke(param);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            JSONField declaredAnnotation = declaredField.getDeclaredAnnotation(JSONField.class);
            if(declaredAnnotation!=null){
                fieldName = declaredAnnotation.name();
            }
            paramMap.put(fieldName,value);
        }
        return paramMap;
    }
}
