package pl.edu.ur.main;
import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nowatablica[] = new double[10];
        
        
        int i = 0, menu = 0, wyborIf = 0;
        nowaTablica tablica = new nowaTablica(nowatablica, i);
        
        do {
            System.out.println("============================================================");
            System.out.println("Wybierz czynnosc:");
            System.out.println("1.Wprowadzenie danych do tablicy");
            System.out.println("2.Operacje na danych umieszczonych w tablicy");
            System.out.println("3.Nieskonczona petla liczb całkowitych");
            System.out.println("4.Sortowanie babelkowe");
            System.out.println("0.Wyjscie z programu");
            System.out.println("============================================================");
            menu = scan.nextInt();
            switch(menu) {
                case 1:
                    System.out.println("Uzupełnij tablicę. Następnie wybierz co chcesz zrobić:");
                    
                    tablica.uzupelnijTablice();
                    
                break;
                case 2:
                do {                
                    System.out.println("============================================================");
                    System.out.println("1. Wyświetl elementy tablicy od pierwszego do ostatniego ");
                    System.out.println("2. Wyświetl elementy tablicy od ostatniego do pierwszego ");
                    System.out.println("3. Wyświetl elementy tablicy o parzystej liczbie indeksu ");
                    System.out.println("4. Wyświetl elementy tablicy o nieparzystej licznie indeksu ");
                    System.out.println("5. Wyświetl sumę elementow tablicy ");
                    System.out.println("6. Wyświetl iloczyn elementow tablicy ");
                    System.out.println("7. Wyświetl srednia wartosc elementow tablicy ");
                    System.out.println("8. Wyświetl najmniejszy element tablicy");
                    System.out.println("9. Wyświetl najwiekszy element tablicy");                    
                    System.out.println("0. Wyjscie do nadrzednego menu");
                    
                    System.out.println("============================================================");
                    wyborIf = scan.nextInt();

                    if ( wyborIf == 1) {
                        tablica.wyswietlOdPrzodu();
                    } else if (wyborIf == 2) {
                        tablica.wyswietlOdTylu();
                    } else if (wyborIf == 3) {
                        tablica.wyswietlParzysteIndx();
                    } else if (wyborIf == 4) {
                        tablica.wyswietlNieparzysteIndx();
                    } else if (wyborIf == 5) {
                        tablica.sumujElementy();
                    } else if (wyborIf == 6) {
                        tablica.mnozElementy();
                    } else if (wyborIf == 7) {
                        tablica.liczSrednia();
                    } else if (wyborIf == 8) {
                        tablica.wyznaczMin();
                    } else if (wyborIf == 9) {
                        tablica.wyznaczMax();
                    } 
                } while (wyborIf != 0);
               break;
                case 3:
                    System.out.println("3.Nieskonczona petla liczb całkowitych");
                    while (true) {
                        int liczba = 0;
                        System.out.println("Podaj liczbe całkowita wieksza od zera:");
                        liczba = scan.nextInt();
                        if (liczba < 0) {
                            System.out.println("Zakonczono dzialanie petli");
                            break;
                            }
                        }
                break;
                
                case 4:
                    int n = 0, temp = 0, j = 0;
                    System.out.println("Ile liczb chcesz podać i posortować?");
                    n = scan.nextInt();
                    int[] tablicaBabelkowa = new int[n];
                    for (i = 0; i < n; i++) {
                        System.out.println(i+1 + " element: ");
                        tablicaBabelkowa[i] = scan.nextInt();                        
                    }
                    for(i = 0; i < n; i++){  
                        for(j = 1; j < (n-i); j++){  
                          if(tablicaBabelkowa[j-1] > tablicaBabelkowa[j]){  
                                 
                                 temp = tablicaBabelkowa[j-1];  
                                 tablicaBabelkowa[j-1] = tablicaBabelkowa[j];  
                                 tablicaBabelkowa[j] = temp;  
                         }  
                          
                 }  
         }  
                    for ( j = 0; j < n; j++) {
                        System.out.println(j + " element tablicy:" + tablicaBabelkowa[j]);
                    }
                break;
                
                default:
                    System.out.println("Nieobsługiwany wybór. Patrz na menu!");
                break;
            }
        } while (menu != 0);

    }
}
