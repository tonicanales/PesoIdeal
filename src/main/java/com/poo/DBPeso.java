package com.poo;


public class DBPeso implements PesoServices {

	@Override
	public float PesoIdeal(float altura, String sexo) {
		float pesoideal = 0;
		
		if(sexo.equals("Masculino")){
			
			pesoideal = (float) (50 + 1.06 * (altura-152.4));
		} else {
			
			pesoideal = (float) (50 + 0.866 * (altura-152.4));
		}
		
		return pesoideal;
	}

	
	

}
