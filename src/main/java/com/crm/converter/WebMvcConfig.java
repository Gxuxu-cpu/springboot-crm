package com.crm.converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
* Created by IntelliJ IDEA.
 *
 * @Auther: ShaoHsiung
* @Date: 2018/8/29 15:41
 * @Title:
 * @Description:
 */
 @Configuration
 public class WebMvcConfig extends WebMvcConfigurerAdapter {
     @Override
     public void addFormatters(FormatterRegistry registry) {
         registry.addConverter(new DateConverter());
     }
  }