package com.companyname.telefono.models;

import com.companiname.base.Phone;
import com.companyname.interfaces.Ringable;

public class Iphone extends Phone implements Ringable {
	
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String ring() {
		return this.getClass().getSimpleName()+" "+this.getVersionNumber()+" Says "+this.getRingTone();
		
	}@Override
	public String unlock() {
		return  "Unlocking via facial recognition";	
	}
	@Override
	public void displayInfo() {
		System.out.println(this.getClass().getSimpleName()+this.getVersionNumber()+ " from "+ this.getCarrier());
		
	}
	
}
