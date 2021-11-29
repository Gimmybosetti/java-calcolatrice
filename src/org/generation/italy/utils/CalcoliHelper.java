package org.generation.italy.utils;

public class CalcoliHelper {
	
	//variabile costante che potrebbe servire su una calcolatrice
	static final double PI_GRECO = 3.141592653589793;
	
	//costruttore vuoto per evitare che si possa instanziare un oggetto di tipo CalcoliHelper
	private CalcoliHelper() {
		return;
	}
	
	//metodi somma
	public static int sumTwoInt  (int a, int b) {
		return a + b;
	}
	public static double sumTwoDouble  (double a, double b) {  //overload del metodo, passando argomenti diversi, posso
		return a + b;										//scegliere di usare uno dei due a seconda dei dati che gli passo
	}
	
	//metodi sottrazione
	public static int substractTwoInt  (int a, int b) {
		return a - b;
	}
	public static double substractTwoDouble  (double a, double b) { 
		return a - b;
	}
	
	//metodi moltiplicazione
	public static int multiplyTwoInt  (int a, int b) {
		return a * b;
	}
	public static double multiplyTwoDouble  (double a, double b) { 
		return a * b;
	}
	
	//metodi valore assoluto
	public static int absoluteValueInt  (int a) {
		if(a > 0) {
			return a;
		}else {
			return a*(-1);
		}
	}
	public static double absoluteValueDouble  (double a) { 
		if(a > 0) {
			return a;
		}else {
			return a*(-1);
		}
	}
	
	//metodi moltiplicazione
	public static int minBetweenInt  (int a, int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	public static double minBetweenDouble  (double a, double b) { 
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	//metodi moltiplicazione
		public static int maxBetweenInt  (int a, int b) {
			if(a > b) {
				return a;
			}else {
				return b;
			}
		}
		public static double maxBetweenDouble  (double a, double b) { 
			if(a > b) {
				return a;
			}else {
				return b;
			}
		}
}
