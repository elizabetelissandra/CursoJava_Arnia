package app;

import service.SmartRefrigerador;
import service.SmartTV;

public class Controle {

	public static void main(String[] args) {
		
		String nome1 = "OLED C3";
		String fabricante1 =  "LG";
		
		SmartTV dispositivo1 = new SmartTV(nome1,fabricante1);
		
		String nome2 = "Family Hub Bespoke";
		String fabricante2 = "Samsung";
		
		SmartRefrigerador dispositivo2 = new SmartRefrigerador(nome2, fabricante2);
		
		//Dispositivo 1
		
		System.out.println(dispositivo1.exibirInformacoes());
		dispositivo1.ligar();
		dispositivo1.desligar();
		dispositivo1.realizarDiagnostico();
		System.out.println("--------------------------------------------------");
		
		//Dispositivo 2
		
		System.out.println(dispositivo2.exibirInformacoes());
		dispositivo2.exibirInformacoes();
		dispositivo2.ligar();
		dispositivo2.desligar();
		dispositivo2.realizarDiagnostico();
	}

}
