package org.generation.italy.utils;

public class CalcoliHelper {
	
	//variabile costante che potrebbe servire su una calcolatrice
	static final double PI_GRECO = 3.141592653589793;
	
	//costruttore vuoto per evitare che si possa instanziare un oggetto di tipo CalcoliHelper
	private CalcoliHelper() {
		return;
	}
	
	//metodi somma
	public static int sumTwo (int a, int b) {
		return a + b;
	}
	public static double sumTwo (double a, double b) {  //overload del metodo, passando argomenti diversi, posso
		return a + b;										//scegliere di usare uno dei due a seconda dei dati che gli passo
	}
	
	//metodi sottrazione
	public static int substractTwo (int a, int b) {
		return a - b;
	}
	public static double substractTwo (double a, double b) { 
		return a - b;
	}
	
	//metodi moltiplicazione
	public static int multiplyTwo (int a, int b) {
		return a * b;
	}
	public static double multiplyTwo (double a, double b) { 
		return a * b;
	}
	
	//metodi valore assoluto
	public static int absoluteValue (int a) {
		if(a >= 0) {
			return a;
		}else {
			return a*(-1);
		}
	}
	public static double absoluteValue (double a) { 
		if(a >= 0) {
			return a;
		}else {
			return a*(-1);
		}
	}
	
	//metodi moltiplicazione
	public static int minBetween (int a, int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	public static double minBetween (double a, double b) { 
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	//metodi moltiplicazione
		public static int maxBetween (int a, int b) {
			if(a > b) {
				return a;
			}else {
				return b;
			}
		}
		public static double maxBetween (double a, double b) { 
			if(a > b) {
				return a;
			}else {
				return b;
			}
		}
		
		//metodi potenza
		public static int Pow (int a, int esp) {
			if (esp > 0 && (a > 0 || a < 0)) {
				int tmp = a;
				while(esp > 1) {
					a = a*tmp;
					esp--;
				}
				return a;
			}else if (esp < 0) {
				PowDouble(a, esp);
			}else if (esp == 0) {
				return 1;
			}else if (a == 0) {
				return 0;
			}
		return a;
		}
		
		public static double PowDouble(int a, int esp) {
			double ad = Double.valueOf(a);
			double espd = Double.valueOf(esp);
			
				while (espd < 0.0) {
					ad = a*ad;
					espd++;
				}
				return 1/ad;
		}
		
}
