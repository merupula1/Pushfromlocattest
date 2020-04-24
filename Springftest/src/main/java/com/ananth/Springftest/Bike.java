package com.ananth.Springftest;

import org.springframework.stereotype.Component;

@Component
public class Bike  implements Vehicle
{
	
	public void drive() {
		
		System.out.println("its running ");
		
	}

}
