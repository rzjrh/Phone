package com.RezaAk.meritamerica.phone;

public interface Ringable {
	
	

	//ring(): This method returns a String
	//default keyword? 
	public default String ring() {
		return "---Buzz---";
	}




	
	
	
	//unlock(): This method returns a String
	public default String unlock() {
		return "Phone Unlocked";
	}
	

}
