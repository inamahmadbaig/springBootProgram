package com.nit;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.bean.WishMsgGeneratoTimeBased;

@SpringBootApplication
public class BootPro02WishGeneratoTimeBasedApplication {
	@Bean
	public LocalTime getTime() {
		return LocalTime.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(BootPro02WishGeneratoTimeBasedApplication.class, args);
		
		WishMsgGeneratoTimeBased timeBased = ct.getBean(WishMsgGeneratoTimeBased.class);
		System.out.println(timeBased.getWishMessage());
		
		((ConfigurableApplicationContext)ct).close();
	}

}
