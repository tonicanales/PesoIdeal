package com.poo;

import java.util.HashSet;

public class MockAdmin {
	
	public static HashSet<Admin> listaAdmins() {
		
	
	
	HashSet<Admin> admins = new HashSet<Admin>();
	
	Admin admin1 = new Admin();
	Admin admin2 = new Admin();
	Admin admin3 = new Admin();
	
	admin1.setId(1);
	admin1.setName("Pepe");
	
	admin2.setId(2);
	admin2.setName("Maria");
	
	admin3.setId(3);
	admin3.setName("Luis");
	
	admins.add(admin1);
	admins.add(admin2);
	admins.add(admin3);
	
	return admins;
	}
	

}
