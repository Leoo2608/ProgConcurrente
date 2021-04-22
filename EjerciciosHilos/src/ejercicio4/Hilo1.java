package ejercicio4;

public class Hilo1 extends Thread{
	
	private String cadena;
	public Hilo1(String cadena) {
		this.cadena = cadena;
	}
	
	/*public int Terminar(int entrada) {
		if(entrada == 3) {
			return 1;
		}else {
			return 0;
		}
		
	}*/
	
	@Override
	public void run(){
		for(int i=1; i<=3;i++) {
			System.out.println(cadena+" esta corriendo");	
		}
		System.out.println("\n**** "+cadena+" terminó la carrera. ****\n");
		
	}
	
}
