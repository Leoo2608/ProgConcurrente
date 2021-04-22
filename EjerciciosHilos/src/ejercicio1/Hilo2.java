package ejercicio1;

public class Hilo2 extends Thread{
	@Override
	public void run() {
		for (int i = 10; i>=1; i--) {
			System.out.println("Hilo 2 : "+i);
		}
	}
	

}
