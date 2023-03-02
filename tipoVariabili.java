public static void main(String[] args) {
		
		/*
		 * per poter usare una variabile occorre prima dichiararla
		 * e per fare questo serve scrivere il tipo di variabile che si vuole usare
		 * seguito dal nome che vogliamo darle
		 * 
		 * il nome di una variabile non può iniziare con una lettera maiuscola, nè con un numero
		 * per convenzione si usa la scrittura camelCase
		 */

		
		/*
		 *  se usiamo una variabile di tipo primitivo è sufficiente dichiararla
		 *  e poi inizializzarla scrivendo alla destra dell'uguale il suo valore
		 */
		
		//esempio di dichiarazione e inizializzazione di variabili primitive 
		
		//- in due passaggi
		int intero;
		intero = 5;
		
		//- in un passaggio
		double decimale = 4.5; 
		
		
		/*
		 * se usiamo una variabile non primitiva (oggetto) è necessario
		 * crearla usando il costruttore e la formula generale prevede che si scriva
		 * 
		 * TipoDiVariabile nomeVariabile = new TipoDiVariabile(eventualiParametri);
		 * 
		 * il tipo di variabile sarà sempre scritto con la lettera maiuscola
		 */
		
		//esempio di dichiarazione di una variabile di tipo non primitivo (Scanner)
		
		//questo tipo di variabile cattura dei dati dall'esterno del codice (tastiera, file..) e ha bisogno di essere chiusa
		Scanner key = new Scanner(System.in);

		//dichiaro le variabili che conterranno i valori presi da tastiera grazie all'uso dello Scanner
		int numero1 , numero2 , numero3 , somma;
		
		//stampo in console un messaggio per chiedere all'utente di inserire dei dati (in questo caso numeri interi)
		System.out.println("Inserisci tre numeri interi");
		
		/*
		 * i valori inseriti dall'utente vengono assegnati rispettivamdente
		 * alle tre variabili primitive create precedentemente
		 * per poter catturare concretamente un dato da tastiera è necessario invocare un metodo appartenente a Scanner
		 * si tratta di '.next()'
		 * 
		 * ci sono più metodi in realtà e si richiama uno piuttosto che l'altro
		 * in base al tipo di daato che si vuole immagazzinare
		 * 
		 * se si tratta di un intero -> .nextInt()
		 * se si tratta di una parola -> .next()  --?-- frase ->.nextLine()
		 * se si tratta di un double -> .nextDouble()
		 * ..
		 */
		//assegno il valore del primo intero inserito da tastiera
		numero1 = key.nextInt();
		//assegno il valore del secondo intero inserito da tastiera
		numero2 = key.nextInt();
		//assegno il valore del terzo intero inserito da tastiera
		numero3 = key.nextInt();
		
		
		somma = numero1 + numero2 + numero3;
		
		System.out.println("La somma vale " + somma);
		
		//chiusura della variabile di tipo Scanner
		key.close();
	}
