package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item {

	public Candy(String name, double price) {
		super(name, price);
		
	}
	
	@Override
	public String getNoise() {
		return "Munch Munch, Yum!";
	}

	
}