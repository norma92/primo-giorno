public class EsercizioGit01 {

	public static void main(String[] args) {

/*
 * CONSEGNA:
 * creare un programma che crea due variabili di tipo intero e assegnate voi dei valori,
 * stampare a video le due variabili e la somma delle due variabili
 */
		
		//creo due variabili di tipo int dichiarandole e inizializzandole
		int primoNumero = 16, secondoNumero = 14;
		
		//stampo a video le due variabili
		System.out.println(	"Il primo numero vale: "	+ primoNumero 	+
							"\nIl secondo numero vale: "	+ secondoNumero	);
		
		//creo una variabile che contenga il valore della somma delle variabili
		int somma = primoNumero + secondoNumero;
		
		//stampo a video la somma delle due variabili
		System.out.println("----------\nIl valore della somma delle due variabili vale: " + somma);		
	}

}
