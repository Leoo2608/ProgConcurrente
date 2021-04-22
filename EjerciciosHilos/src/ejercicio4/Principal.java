package ejercicio4;

import ejercicio4.Hilo1;

public class Principal {
	public static void main(String[] args) {
		String[] nombres = {"Leopardo 1","Leopardo 2","Leopardo 3","Leopardo 4"};

		for(String nom: nombres) {
			Hilo1 h1 = new Hilo1(nom);
			Thread th = new Thread(h1);
			th.start();
			
		}
		
	}
	
}
