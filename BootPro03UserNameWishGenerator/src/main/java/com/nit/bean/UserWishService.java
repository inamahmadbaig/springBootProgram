package com.nit.bean;

import org.springframework.stereotype.Component;

@Component
public class UserWishService {
	public String  wishUser(String name) {
		return "Hello "+name+","+" Welcome!";
	}
}
