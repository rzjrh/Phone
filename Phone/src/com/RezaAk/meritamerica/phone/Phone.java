
/*
 Pokemon Assignment
 Author: Reza Akhlaqi
 Date: 7-13-2019
*/



package com.RezaAk.meritamerica.phone;


// an abstract class is template 
public abstract class Phone {
	
	
	
	
	// declare the member variables 
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public static int count;

    
    
    
    //the constructor 
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
        count++;
    }
    
    
    
    
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    
    
    
    
    // getters and setters removed for brevity. Please implement them yourself
    
    
    //getters
    public String getVersionNumber() {
		return versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public String getRingTone() {
		return ringTone;
	}
	public static int getCount() {
		return count;
	}
	
	
	
	//Setters
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	public static void setCount(int count) {
		Phone.count = count;
	}
    
    
    
}
