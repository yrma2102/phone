package com.companyname.telefono.main;

import com.companyname.telefono.models.Galaxy;
import com.companyname.telefono.models.Iphone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99,"Verizon", "Ring Ring Ring!");
		Iphone iphoneTen = new Iphone("X", 100,"AT&T", "Ziiing!");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());

	}

}
