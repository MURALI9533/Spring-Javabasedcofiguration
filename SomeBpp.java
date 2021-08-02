package com.adi.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SomeBpp implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization From SomeBpp");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization from SomeBpp");
		return bean;
	}

}


