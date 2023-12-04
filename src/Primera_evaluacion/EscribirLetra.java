package Primera_evaluacion;

public class EscribirLetra extends Thread{
	
	public char letra;
	public int numero;
	
	EscribirLetra(char letra, int numero){
		this.letra = letra;
		this.numero = numero;
	}
	@Override
	public void run() {
		while(true) {
			for(int i=0;i<numero;i++) {
				System.out.println(letra);
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
