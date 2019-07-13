package com.RezaAk.meritamerica.phone;

public class PhoneTester {

	

	public static void main(String[] args) {
		
		//instantiation 
		//we can not instantiate from an interface class like Ringable
		Galaxy Model_S9 = new Galaxy("SamSung Glaxy S9", 15, "T-Mobile", "Samsung Ring");
		IPhone Model_8 = new IPhone("Iphone 8", 100, "T-Mobile", "Iphone Ring");
		
		
		
		
		
		Model_S9.displayInfo(); 
		System.out.println(Model_S9.ring());
		System.out.println(Model_S9.unlock());
		
		Model_8.displayInfo();
		System.out.println(Model_8.ring());
		System.out.println(Model_8.unlock());
		
//		Galaxy.ListGalaxy();
		
	}

}