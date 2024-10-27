
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
		
	}

}
