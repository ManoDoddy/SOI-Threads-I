package controller;

public class ThreadVetor extends Thread{
	private int[] vetor;
	private int num;
	private long tempoInicial;
	private long tempoFinal;
	
	public ThreadVetor(int[] vetor, int num) {
		this.vetor = vetor;
		this.num = num;
	}
	
	@Override
	public void run() {
		time();
	}

	private void time() {
		if(num%2==0) {
			tempoInicial = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
				//
			}
			tempoFinal = System.nanoTime();
			double result = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("Time Par ==> " +result+" s.");
		}else {
			long tempoInicial = System.nanoTime();
			for (int i : vetor) {
				//
			}
			long tempoFinal = System.nanoTime();
			double result = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("Time Impar ==> " +result+" s.");
		}
	}
}
