package ejercicio1;

public class Hilo1 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i<=10; i++) {
			System.out.println("Hilo 1 : "+i);
		}
	}
	

}
