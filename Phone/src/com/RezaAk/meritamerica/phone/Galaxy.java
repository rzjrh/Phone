package com.RezaAk.meritamerica.phone;


public class Galaxy extends Phone implements Ringable {
	

	
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    
    
    @Override
    public String ring() {
    	String ringer = getRingTone();
		return "Buzzzzzzz!  " + ringer;
    
    }
    
    
    
    
    @Override
    public String unlock() {
    	return "Galaxy Unlocked ";
    }
    
    
    
    
    @Override
    public void displayInfo() {
    	System.out.println(("\n*****Samsung Phone information:*****\n"+"Model:") + getVersionNumber() + " \nCarrier: " + getCarrier() + " \nBattery Charge: " + getBatteryPercentage() + "%");    
    }
    
    
    
//test
// 	public void ListGalaxy() {
// 		this.SamsungPhone = Phone.count;
// 		System.out.println("Number of Phones: " + SamsungPhone);
// 		
// 	}

    
    
    
}
