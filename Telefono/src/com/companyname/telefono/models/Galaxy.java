package com.companyname.telefono.models;

import com.companiname.base.Phone;
import com.companyname.interfaces.Ringable;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println(this.getClass().getSimpleName()+this.getVersionNumber()+ " from "+ this.getCarrier());
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" "+this.getVersionNumber()+" Says "+this.getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via finger print";
	}

}
