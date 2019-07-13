package com.RezaAk.meritamerica.phone;



// what is "@Override"? go to this link for explanation: https://www.geeksforgeeks.org/overriding-in-java/
// another source to explain the "@Override" : https://beginnersbook.com/2014/07/override-annotation-in-java/



public class IPhone extends Phone implements Ringable {
	
	
// the super keyword. used to refer immediate parent class instance variable. super can be used to invoke immediate parent class method.
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    
    
    //explained @Override in top
    
    
    @Override
    public String ring() {
    	String ringer = getRingTone();
//    	if (getBatteryPercentage=100) {
//    		System.out.println("Full");
//    	}
		return "Riiiiiiing!  "+ringer;
    }
    
    
    
    
    
    
    @Override
    public String unlock() {
    	return "Iphone Unlocked ";
    }
    
    
    
    
    @Override
    public void displayInfo() {
    System.out.println(("\n*****Iphone Phone information:*****\n"+"Model:") + getVersionNumber() + " \nCarrier: " + getCarrier() + " \nBattery Charge: " + getBatteryPercentage() + "%");    
    }
}
