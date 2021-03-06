package com.techelevator;

import java.io.File;
import java.util.Map;

import org.junit.*;

public class InventoryTest { 

	
	@Test
	public void createMapFromFile() {
		File testFile = new File("./mapTestFile.txt");
		Inventory testInventory = new Inventory();
		Map<String, Item> objectUnderTest = testInventory.stockVendingMachine(testFile);
		
		Assert.assertEquals("{A1=Potato Crisps 3.05 5, A2=Stackers 1.45 5, A3=Grain Waves 2.75 5}", objectUnderTest.toString());
		
	}

	@Test
	public void penniesTest() {
		Inventory pennyTest = new Inventory();
		double balance = 5;
		double actual = pennyTest.depositCashAsPennies(balance);
		Assert.assertEquals(500.0, actual, 0);
	}
	
	@Test
	public void coinChangeTest() {
		Inventory coinTest = new Inventory();
		double balance = 25;
		String actual = coinTest.makeCoinChange(balance);
		Assert.assertEquals("Here are your coins: 1.0 Quarters.", actual);
	}
	
	@Test
	public void oddNumTest() {
		Inventory oddNum = new Inventory();
		double balance = 65;
		String actual = oddNum.makeCoinChange(balance);
		Assert.assertEquals("Here are your coins: 2 Quarter(s), 1 Dime(s), and 1 Nickel(s).", actual);
	}
	
	@Test
	public void doesProductExist() {
		Inventory inventory = new Inventory();
		String selection = "D5";
		boolean actual = inventory.purchaseItem(selection);
		Assert.assertFalse(actual);
	}
	
	@Test
	public void feedMoneyReturnsTrue() {
		Inventory obj = new Inventory();
		String userSelection = "5";
		boolean actual = obj.feedMoney(userSelection);
		
		Assert.assertEquals(true, actual);
		
	}
	
//	@Test
//	public void feedMoneyReturnsFalse() {
//		Inventory obj = new Inventory();
//		String userSelection = "3";
//		boolean actual = obj.feedMoney(userSelection);
//		
//		Assert.assertFalse(actual);
//		
//	}
	
	@Test
	public void createLogReturnsTrue() {
		Inventory obj = new Inventory();
		
		boolean actual = obj.createNewLogEntry("TEST", 1.0, 5.0);
		
		Assert.assertEquals(true, actual);
	}
}
	