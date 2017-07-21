package com.poo;

import java.util.HashSet;
import java.util.Set;


public class DBAdmin implements AdminServices {

	@Override
	public Admin findAdmin(int id) {
		
		HashSet<Admin> lista = MockAdmin.listaAdmins();
		Admin admin = null;
		
		for (Admin a : lista){
			
			if (a.getId()== id)
			
				admin = a;
				
			
		}
		
		return admin;
		
		
	}

	@Override
	public HashSet<Admin> findAllAdmin() {
		
		HashSet<Admin> lista = MockAdmin.listaAdmins();
		
		
		return lista;
	}
	

}
