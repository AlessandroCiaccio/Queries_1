package com.exercise.interceptor.configurations;

import com.exercise.interceptor.interceptors.APILoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(apiLoggingInterceptor);
    }
}
