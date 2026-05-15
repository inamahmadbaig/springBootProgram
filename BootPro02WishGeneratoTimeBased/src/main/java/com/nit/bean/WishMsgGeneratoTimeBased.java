package com.nit.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class WishMsgGeneratoTimeBased {
	@Autowired
	private LocalTime localTime;
	
	public String getWishMessage() {
		int time = localTime.getHour();
		System.out.println(localTime);
		if(time < 12) {
			return"GooD Morning";
		}else if(time < 16) {
			return "Good AfterNoon";
		}else if(time<20) {
			return "good Evening";
		}else {
			return "Good Night";
		}
	}
}
