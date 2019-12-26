package com.zhao;

import com.zhao.service.CityService;
import com.zhao.service.CityServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
		CityService cityService = (CityService) ac.getBean(CityServiceImpl.class);
		cityService.query();
    }
}
