/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;
import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class nowaTablica {
    public double[] tablica;
    public int index;
    
    
    public nowaTablica(double[] tablica, int index) {
        this.tablica = tablica;
        
    }
    
    void uzupelnijTablice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uzupełnij tablicę:");
        for (int index = 0; index < 10; index++) {
            System.out.println("Podaj " + (index+1) + " liczbę");
            tablica[index] = scan.nextDouble();            
        }
    }
    
    void wyswietlOdPrzodu() {
        System.out.println("Od przodu: ");
        ;
        for (index = 0; index < tablica.length; index++ ) {
            System.out.println("Element " + index + " tablicy to: " + tablica[index]);
        }
    }
    
    void wyswietlOdTylu() {
        System.out.println("Od tylu: ");
        for (index = tablica.length - 1; index >= 0; index-- ) {
            System.out.println("Element " + index + " tablicy to: " + tablica[index]);
        }
    }
    
    void wyswietlParzysteIndx() {
        System.out.println("Parzyste indeksy:");
        for (index = 0; index < tablica.length; index++ ) {
            if ( index %2 == 0) {
                System.out.println("Element " + index + " tablicy to: " + tablica[index]);
            } else {
                continue;
            }
        }
    }
    
    void wyswietlNieparzysteIndx() {
        System.out.println("Nieparzyste indeksy:");
        for (index = 0; index < tablica.length; index++ ) {
            if ( index %2 != 0) {
                System.out.println("Element " + index + " tablicy to: " + tablica[index]);
            } else {
                continue;
            }
        }
    }
    
    void sumujElementy() {
        double suma = 0;
        for (index = 0; index < tablica.length; index++) {
            suma += tablica[index];           
        }
        System.out.println("Suma elementów tablicy wynosi:" + suma);
    }
    
    void mnozElementy() {
        double iloczyn = 1;
        for (index = 0; index < tablica.length; index++) {
            iloczyn *= tablica[index];           
        }
        System.out.println("Iloczyn elementów tablicy wynosi:" + iloczyn);
    }
    
    void liczSrednia() {
        double suma = 0, srednia = 0;
        for (index = 0; index < tablica.length; index++) {
            suma += tablica[index];            
        }
        srednia = suma/tablica.length;
        System.out.println("Srednia wartosc elementów tablicy wynosi:" + srednia);
    }
    
    void wyznaczMin() {
        double minimum = tablica[0];
        for (index = 0; index < tablica.length; index ++) {
            if (minimum >= tablica[index]) {
                minimum = tablica[index];
            } else {
                continue;
            }
        }
        System.out.println("Najmniejszym elementem tablicy jest:" + minimum);
    }
    
    void wyznaczMax() {
        double maximum = tablica[0];
        for (index = 0; index < tablica.length; index ++) {
            if (maximum <= tablica[index]) {
                maximum = tablica[index];
            } else {
                continue;
            }
        }
        System.out.println("Najwiekszym elementem tablicy jest:" + maximum);        
    }
}
        

