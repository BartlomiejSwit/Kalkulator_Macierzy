import java.util.Scanner;

public class Macierze {

	public static void main(String[] args) {
		obslugaMenu();

	}
	static void obslugaMenu(){
		int opcja = 0;
		while(opcja !=6){
			menu();
			opcja = getInt();
			if(opcja == 1){
				transponowanie();
				
				}else if(opcja == 2){
					wyznacznik();

					}else if(opcja == 3){
							dodawanie();
							
						}else if(opcja == 4){
								odejmowanie();
								
							}else if(opcja == 5){
									mnozenie();
									
								}else if(opcja == 6){
									koniec();
										
			}else{
				System.out.println("Proszê wybrac opcje z listy.");
			}
		}		
	}
	static void menu(){
		//dzia³a
		System.out.println("1. Transponowanie");
		System.out.println("2. Wyznacznik Macierzy");
		System.out.println("3. Dodawanie");
		System.out.println("4. Odejmowanie");
		System.out.println("5. Mnozenie");
		System.out.println("6. Koniec");		
	}
	static void transponowanie(){
		System.out.println("To jest transponowanie.");

		System.out.println("Podaj ilosc wierszy.");
		int wiersze = getInt();
		System.out.println("Podaj ilosc kolumn.");
		int kolumny = getInt();
		
		int[][] tablica = new int[wiersze][kolumny];
		
		System.out.println("Wprowadz wartosci macierzy.");
		
		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
			tablica[i][j] = getInt();
			}
		}
		
		System.out.println("Twoja macierz.");

		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
				if (tablica[i][j] < 0){
					System.out.print("" + tablica[i][j] + " ");
				}else{
					System.out.print(" " + tablica[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		int[][] transponownaTablica = new int[kolumny][wiersze];  
//		int[][] transponownaTablica = new int[3][3];  
		
		//rvers		
		//tablica.sort

//		for (int i = 0; i < tablica.length; i++){
//			transponownaTablica[i] = tablica[tablica.length -1 -i];
//			for(int j = 0; j < tablica[i].length; j++){
//				transponownaTablica[i][j] = tablica[i][tablica[i].length -1 -j];
//			}
//		}
		
		for (int i = 0; i < tablica.length; i++){
			for(int j = 0; j < tablica[i].length; j++){
			transponownaTablica[j][i] = tablica[i][j];
			}
		}		

//		for (int i = 0; i < tablica.length; i++){
//			for(int j = 0; j < tablica.length; j++){			
//				transponownaTablica[i][j] = tablica[tablica.length -1 -i][tablica[i].length -1 -j];
////			transponownaTablica[i][j] = tablica[j][i];
//			
//			}
//		}	
		
		System.out.println("Transponowana Macierz.");

		for (int i = 0; i < transponownaTablica.length; i++){
			for (int j = 0; j < transponownaTablica[i].length; j++){
				if (transponownaTablica[i][j] < 0){
					System.out.print("" + transponownaTablica[i][j] + " ");
				}else{
					System.out.print(" " + transponownaTablica[i][j] + " ");
				}
			}
		System.out.println();
		}		
		
		
	}
	static void wyznacznik(){
		//nie dia³a
		//wzor rekurencyjny
		System.out.println("To jest wyznacznik macierzy.");
		System.out.println("Podaj ilosc wierszy.");
		int wiersze = getInt();
		System.out.println("Podaj ilosc kolumn.");
		int kolumny = getInt();
		
		int[][] tablica = new int[wiersze][kolumny];
		
		System.out.println("Wprowadz wartosci macierzy.");
		
		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
			tablica[i][j] = getInt();
			}
		}
		/*
		tablica[0][0] = 1;
		tablica[0][1] = 2;
		tablica[0][2] = 3;		
		tablica[1][0] = 4;
		tablica[1][1] = 5;
		tablica[1][2] = 6;		
		tablica[2][0] = 7;		
		tablica[2][1] = 8;		
		tablica[2][2] = 9;			
		*/
		for (int i = 0; i < tablica.length; i++){
			for (int j = 0; j < tablica[i].length; j++){
			System.out.print(tablica[i][j] + " ");
			}
		System.out.println();
		}		
		
	}
	static void dodawanie(){
		System.out.println("To jest dodawanie.");
		
		System.out.println("Podaj ilosc wierszy.");
		int wiersze = getInt();
		System.out.println("Podaj ilosc kolumn.");
		int kolumny = getInt();
		
		System.out.println("Wprowadz wartosci macierzy A.");
		int[][] macierzA = new int[wiersze][kolumny];		
		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				macierzA[i][j] = getInt();
			}
		}
		
		System.out.println("Wprowadz wartosci macierzy B.");
		int[][] macierzB = new int[wiersze][kolumny];		
		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){				
				macierzB[i][j] = getInt();
			}			
		}
		
		int[][] macierzC = new int[wiersze][kolumny];
		
		for (int i = 0; i < macierzC.length; i++){
			for (int j = 0; j < macierzC[i].length; j++){
				macierzC[i][j] = macierzA[i][j] + macierzB[i][j];
			}
		}		
		
		System.out.println("Twoja macierz A.");

		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				if (macierzA[i][j] < 0){
					System.out.print("" + macierzA[i][j] + " ");
				}else{
					System.out.print(" " + macierzA[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		System.out.println("Twoja macierz B.");

		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){
				if (macierzB[i][j] < 0){
					System.out.print("" + macierzB[i][j] + " ");
				}else{
					System.out.print(" " + macierzB[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		System.out.println("Wynik sumy macierzy A + B.");

		for (int i = 0; i < macierzC.length; i++){
			for (int j = 0; j < macierzC[i].length; j++){
				if (macierzC[i][j] < 0){
					System.out.print("" + macierzC[i][j] + " ");
				}else{
					System.out.print(" " + macierzC[i][j] + " ");
				}
			}
		System.out.println();
		}		
		
	}
	static void odejmowanie(){
		System.out.println("To jest odejmowanie.");
		
		System.out.println("Podaj ilosc wierszy.");
		int wiersze = getInt();
		System.out.println("Podaj ilosc kolumn.");
		int kolumny = getInt();
		
		System.out.println("Wprowadz wartosci macierzy A.");
		int[][] macierzA = new int[wiersze][kolumny];		
		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				macierzA[i][j] = getInt();
			}
		}
		
		System.out.println("Wprowadz wartosci macierzy B.");
		int[][] macierzB = new int[wiersze][kolumny];		
		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){				
				macierzB[i][j] = getInt();
			}			
		}
		
		int[][] macierzC = new int[wiersze][kolumny];
		
		for (int i = 0; i < macierzC.length; i++){
			for (int j = 0; j < macierzC[i].length; j++){
				macierzC[i][j] = macierzA[i][j] - macierzB[i][j];
			}
		}		
		
		System.out.println("Twoja macierz A.");

		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				if (macierzA[i][j] < 0){
					System.out.print("" + macierzA[i][j] + " ");
				}else{
					System.out.print(" " + macierzA[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		System.out.println("Twoja macierz B.");

		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){
				if (macierzB[i][j] < 0){
					System.out.print("" + macierzB[i][j] + " ");
				}else{
					System.out.print(" " + macierzB[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		System.out.println("Wynik odejmowania macierzy A - B.");

		for (int i = 0; i < macierzC.length; i++){
			for (int j = 0; j < macierzC[i].length; j++){
				if (macierzC[i][j] < 0){
					System.out.print("" + macierzC[i][j] + " ");
				}else{
					System.out.print(" " + macierzC[i][j] + " ");
				}
			}
		System.out.println();
		}	
	}
	static void mnozenie(){
		System.out.println("To jest mnozenie.");
		
		System.out.println("Podaj ilosc wierszy macierzy A.");
		int wierszeA = getInt();
		System.out.println("Podaj ilosc kolumn macierzy A.");
		int kolumnyA = getInt();
		
		System.out.println("Wprowadz wartosci macierzy A.");
		int[][] macierzA = new int[wierszeA][kolumnyA];		
		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				macierzA[i][j] = getInt();
			}
		}
		
		System.out.println("Podaj ilosc wierszy macierzy B.");
		int wierszeB = getInt();
		System.out.println("Podaj ilosc kolumn macierzy B.");
		int kolumnyB = getInt();
		
		System.out.println("Wprowadz wartosci macierzy B.");
		int[][] macierzB = new int[wierszeB][kolumnyB];		
		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){				
				macierzB[i][j] = getInt();
			}			
		}
		
		System.out.println("Twoja macierz A.");

		for (int i = 0; i < macierzA.length; i++){
			for (int j = 0; j < macierzA[i].length; j++){
				if (macierzA[i][j] < 0){
					System.out.print("" + macierzA[i][j] + " ");
				}else{
					System.out.print(" " + macierzA[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		System.out.println("Twoja macierz B.");

		for (int i = 0; i < macierzB.length; i++){
			for (int j = 0; j < macierzB[i].length; j++){
				if (macierzB[i][j] < 0){
					System.out.print("" + macierzB[i][j] + " ");
				}else{
					System.out.print(" " + macierzB[i][j] + " ");
				}
			}
		System.out.println();
		}
		
		if(kolumnyA == wierszeB) {
			int wierszeC = wierszeA;
			int kolumnyC = kolumnyB;
			
			int[][] macierzC = new int[wierszeC][kolumnyC];
			
			for (int i = 0; i < macierzC.length; i++){
				for (int j = 0; j < macierzC[i].length; j++){
//					macierzC[i][j] = macierzA[i][j] * macierzB[j][i];
					for (int k = 0; k < macierzA[0].length; k++) {
						macierzC[i][j] += macierzA[i][k] * macierzB[k][j];
					}
				}
			}
			
			System.out.println("Wynik mnozenia macierzy A * B.");

			for (int i = 0; i < macierzC.length; i++){
				for (int j = 0; j < macierzC[i].length; j++){
					if (macierzC[i][j] < 0){
						System.out.print("" + macierzC[i][j] + " ");
					}else{
						System.out.print(" " + macierzC[i][j] + " ");
					}
				}
			System.out.println();
			}	
		}else {
			System.out.println("Mnozenie nie jest mozliwe, ilosc wierszy nie zgadza sie z iloscia kolumn.");
		}

	}
	static void koniec(){
		System.out.println("Program zakonczyl dzialanie.");
	}
	public static int getInt(){
		return new Scanner(System.in).nextInt();	
	}

}