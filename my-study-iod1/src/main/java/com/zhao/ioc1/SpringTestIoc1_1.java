package com.zhao.ioc1;

import com.zhao.ioc1.service.CityService;
import com.zhao.ioc1.service.CityServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTestIoc1_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
		CityService cityService = (CityService) ac.getBean(CityServiceImpl.class);
		cityService.query();
    }
}
