
public class Main {

	public static void main(String[] args) {
		//un Array è una variabile che serve a contenere il valore di più variabili
		//inizializzo l'array con String[] e gli asseno i valori
		String[] sonoArray = {"sono il primo valore", "sono il secondo valore", "sono il tezo valore"};
		//l'array parte da 0 e per prendere il valore dobbiamo prendere l'array e inserire il numero dell'indice
		//del valore che stiamo cercando di ottenere
		//ciclo sulla lunghezza dell'array e stampo tutti i valori
		for(int i=0; i<sonoArray.length;i++) {
			System.out.println(sonoArray[i]);
		}
		//inizializziamo la stringa int
		int[] numeri= {1,2,5,3,8};
		for(int i=0;i<numeri.length;i++) {
			System.out.println(numeri[i]);
		}
		//abbiamo anche un altro modo per inizializzare un array
		//indico il tipo del contenuto dell'array 
		double[] decimali = new double[3]; //indico la lunghezza dell'array tra le []
		//assegno i valori 
		decimali[0]= 0.23;
		decimali[2]= 0.54;
		
		for(int i=0;i<decimali.length;i++) {
			System.out.println(decimali[i]);
		}
	}

}
