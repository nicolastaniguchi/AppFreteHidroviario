package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;

public class BalsaGraneleiraTest {
	public static void main(String[] args) {
		
		BalsaGraneleira bg1 = new BalsaGraneleira("001", "Yamato01", 1000);
		bg1.setCapacidade(2.5);
		bg1.setLimpeza(false);
		bg1.setModelo("box");
		System.out.println(bg1);
		
		BalsaGraneleira bg2 = new BalsaGraneleira("002", "Yamato02", 2000);
		bg2.setCapacidade(1.5);
		bg2.setLimpeza(true);
		bg2.setModelo("racked");
		System.out.println(bg2);
		
		BalsaGraneleira bg3 = new BalsaGraneleira("003", "Yamato03", 3000);
		bg3.setCapacidade(1);
		bg3.setLimpeza(true);
		bg3.setModelo("box");
		System.out.println(bg3);		
		
	}

}
