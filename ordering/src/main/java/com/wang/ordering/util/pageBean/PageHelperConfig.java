package com.wang.ordering.util.pageBean;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper createPaeHelper(){
        return new PageHelper();
    }

}
