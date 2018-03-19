/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
public class Main {
    
    public static int potegowanie(int p, int w) {
        if (w == 0)
            return 1;
        return p * potegowanie(p, --w);
    }
    
    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci(n-2) + Fibonacci(n-1);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
<<<<<<< HEAD
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz zadanie");
        menu = scanner.nextInt();
        switch(menu) {
            
            case 1:
                System.out.println("Zastosowanie operatorow przesuniec bitowych");
                System.out.println("Podaj liczbe");
                int liczba = scanner.nextInt();
                System.out.println(Integer.toString(liczba,2)); // binarnie
                System.out.println("Podaj o ile bitow chcesz przesunac");
                int przesuniecie = scanner.nextInt();
                System.out.println("Wykonuje operacje '<<'");
                int liczbaOp1 = liczba << przesuniecie;
                System.out.println(Integer.toString(liczbaOp1,2)); // binarnie
                System.out.println(Integer.toString(liczbaOp1,10)); // diesietnie
                System.out.println("Wykonuje operacje '>>'");
                int liczbaOp2 = liczba >> przesuniecie;
                System.out.println(Integer.toString(liczbaOp2,2)); // binarnie
                System.out.println(Integer.toString(liczbaOp2,10)); // dziesietnie
                System.out.println("Wykonuje operacje '>>>'");
                int liczbaOp3 = liczba >>> przesuniecie;
                System.out.println(Integer.toString(liczbaOp3,2)); // binarnie
                System.out.println(Integer.toString(liczbaOp3,10)); // dziesietnie

                break;
            
            case 2:
                System.out.println("Bramki logiczne NOT i XOR (jako operator bitowe)");
                //negacja - NOT - zapis liczb w kodzie uzupelnieniowym
                int wejJeden = 60;
                int negWejJeden = wejJeden;
                System.out.println(Integer.toString(wejJeden,2));
                System.out.println(Integer.toString(negWejJeden,2));
                System.out.println(negWejJeden);
               
                int wejDwa = 32;
                int xorJedenDwa = wejJeden ^ wejDwa;
                System.out.println("Dzialanie wejJeden ^ wejDwa: " +xorJedenDwa );
                System.out.println(Integer.toString(wejJeden,2));
                System.out.println(Integer.toString(wejDwa,2));
                System.out.println(Integer.toString(xorJedenDwa,2)); // 1 tam, gdzie sa roznowartosciowe bity
                
                System.out.println("NOT jako operator logiczny - !");
                boolean prawda = true;
                System.out.println("Operacja ! na zmiennej boolean o wartosci 'true'");
                System.out.println(!prawda);
               break;
            
            case 3:
                String slowo = new String("Ala ma kota");
                String slowo2 = new String("Ala nie ma kota");
                String slowo3 = new String("ala ma Kota");
                String slowo4 = new String("    ala ma kota    ");
                        
                System.out.println(slowo.toCharArray()); //string zamieniany jest na tablice znakow
                System.out.println(slowo.getBytes()); //
                System.out.println(slowo.equals(slowo2)); //porownanie 2 stringow
                System.out.println(slowo.equalsIgnoreCase(slowo3)); //porownanie 2 stringow bez wzgledu na wielkosc liter
                System.out.println(slowo.compareTo(slowo2)); //
                System.out.println(slowo.compareToIgnoreCase(slowo2));
                System.out.println(slowo.indexOf('m')); //index podanego chara - pierwsze wystapienie
                System.out.println(slowo.lastIndexOf('a')); //ostatnie wystapienie danego chara w stringu
                System.out.println(slowo.substring(6)); //podzial stringu na substring zaczynajac od podanego indexu
                System.out.println(slowo.substring(0,6)); //podzial stringu na substring od podanego do podanego indexu
                System.out.println(slowo.replace('a','u')); //zamiana litery w stringu
                System.out.println(slowo4.trim()); //przyciecie stringu o nadmiarowe poprzedzajace i nadmiarowe whitespace'y
                System.out.println(slowo.toLowerCase()); //zamiana liter na male 
                System.out.println(slowo.toUpperCase()); // zamiana liter na wielkie
                String[] slowoPodzial = slowo.split("ma"); // podzial stringu na czesci - 1 czesc przed podanym argumentem i 2 czesc po argumencie
                String czesc1 = slowoPodzial[0];
                String czesc2 = slowoPodzial[1];
                System.out.println(czesc1);
                System.out.println(czesc2);
                
                break;
            
            case 4:
                
                int podstawa, wykladnik;
                System.out.println("Potegowanie rekurencyjnie");
                System.out.println("Podaj podstawe potegi");
                podstawa = scanner.nextInt();
                System.out.println("Podaj wykladnik potegi");
                wykladnik = scanner.nextInt();
                
                System.out.println(podstawa + "^" + wykladnik + " = " + potegowanie(podstawa,wykladnik));
            
            
                break;
            
            case 5:
                
                int podstawa2, wykladnik2, wynik2 = 1;
                System.out.println("Potegowanie iteracyjnie");
                System.out.println("Podaj podstawe potegi");
                podstawa2 = scanner.nextInt();
                System.out.println("Podaj wykladnik potegi");
                wykladnik2 = scanner.nextInt();
                

                
                for ( int i = 0; i < wykladnik2; i++) {
                    wynik2 *= podstawa2;
                }
                System.out.printf("%d do potegi %d wynosi: %d" ,podstawa2, wykladnik2, wynik2);
                
                break;
                
            case 6:
                int wyraz;
                System.out.println("Ciag Fibonacciego");
                System.out.println("Podaj, ktory wyraz ciagu chcesz poznac");
                wyraz = scanner.nextInt();
                System.out.println(Fibonacci(wyraz));
                break;
                
            
        }
    }
}

=======
        
    }
>>>>>>> parent of 5d719fd... Merge origin/master
    
}
