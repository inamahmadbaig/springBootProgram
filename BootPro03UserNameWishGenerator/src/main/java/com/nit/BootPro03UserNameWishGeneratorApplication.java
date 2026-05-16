package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.bean.UserWishService;

@SpringBootApplication
public class BootPro03UserNameWishGeneratorApplication {

	public static void main(String[] args) {
		ApplicationContext ct =  SpringApplication.run(BootPro03UserNameWishGeneratorApplication.class, args);
		UserWishService service = ct.getBean(UserWishService.class);
		String msg =service.wishUser("inam");
		System.out.println(msg);
	}

}
