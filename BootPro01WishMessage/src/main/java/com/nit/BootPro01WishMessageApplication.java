package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.bean.WishMessageService;

@SpringBootApplication
public class BootPro01WishMessageApplication {

	public static void main(String[] args) {
		 ApplicationContext ct  = SpringApplication.run(BootPro01WishMessageApplication.class, args);
		 
		 WishMessageService messageService = ct.getBean(WishMessageService.class);
		 messageService.generateWish();
		 ((ConfigurableApplicationContext)ct).close();
	}

}
