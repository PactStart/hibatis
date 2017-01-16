/*
 * Copyright 2015-2016 Yaoa & Co., Ltd.
 */
package com.yaoa.hibatis.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 表定义
 *
 * @author kingsy.lin
 * @version 1.0 , 2016年7月15日
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE})
@Documented
public @interface Table {

	String name();
}
