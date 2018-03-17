# ObjectiveProgrammingLab3
Operatory, rekurencja, typ łańcuchowy

[1 Operatory](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#1-operatory-%C5%82a%C5%84cuchowe)

[2 Typ łańcuchowy](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#2-typ-%C5%82a%C5%84cuchowy)

[3 Rekursja](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#3-rekursja-rekurencja)


# 1 Operatory

## Zadania 
### 1.1 Co zwróci poniższy program. Uzasadnij odpowiedź.

```java
public static void main(String[] arg){
	double a=12.12;

	System.out.println(a--);
	System.out.println(a++);
	System.out.println(--a);
	System.out.println(++a);
  }
} 
```

### 1.2 Napisz program demonstrujący działanie operatorów logicznych koniunkcji `&&` i alternatywy `||`. Użyj w tym celu konstrukcji warunkowej `if`.

### 1.3 Czym różnią się operatory:

*	`&&` od `&`
*	`||` od `|`

Napisz programy pokazujące różnice w ich działaniu.

### 1.4 Przestudiuj następujący artykuł: http://jlaskowski.blogspot.com/2012/01/o-operatorach-przesuniec-w-javieprawie.html. Następnie napisz programy demonstrujące działanie operatorów:

* w lewo ze znakiem `<<`
* w prawo ze znakiem `>>` 
* w prawo bez znaku `>>>` 

(http://java.oeiizk.waw.pl/info/operator.html)


### 1.5 Dany jest fragment kodu:

```java
int a = 17;
double b = 4.0;
a += b; // ?
a -= b; // ?
a *= b; // ?
a /= b; // ?
a %= b; // ?
```

Jakie działania arytmetyczne reprezentują wyrażenia w kodzie i jakie wyniki zwrócą?

### 1.6 Dany jest fragment kodu:

```java
int a = 5;
int b = 3;
int c = a+b++;
int d =(a++)+b;
```
W jakiej kolejności będą wykonywana działania podczas wyliczania wartości zmiennych c i d? 
Jakie wartości zostaną wyliczone? 

### 1.7 Jakimi operatorami w Javie definiuje się operacje logiczne `NOT` i `XOR`? Utwórz odpowiednie programy demonstrujące działanie dla tych bramek logicznych.

## 1.8 Utwórz program wykorzystujący działanie operatora przeciwnego do operatora porównania `==`.

# 2 Typ łańcuchowy

## Zadania
### 2.1 Zapoznaj się z dokumkentacją klasy `String`: http://docs.oracle.com/javase/6/docs/api/java/lang/String.html. Przetestuj działanie poniższego programu:

```java

public class StringExample
{
   public static void main( String args[] )
   {
      String s1 = new String( "Happy " );
      String s2 = new String( "Birthday" );

      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
      System.out.printf( 
         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
      System.out.printf( "s1 after concatenation = %s\n", s1 );
   } // end main
} 
```

### 2.2 Opisz słownie działanie następujących metod klasy String oraz utwórz proste aplikacje w języku Java pokazujące zasadę działania tych metod – jako wzór patrz program powyżej. Wyniki działania wypisz na konsoli.

* `char[] toCharArray()`
* `byte[] getBytes()`
* `boolean equals(String str)`
* `boolean equalsIgnoreCase(String str)`
* `int campareTo(String str)`
* `int campareToIgnoreCase(String str)`
* `int indexOf(int i)`
* `int indexOf(String str)`
* `int lastIndexOf(int i)`
* `int lastIndexOf(String str)`
* `String substring(int startString)`
* `String substring(int startString, int stopString)`
* `String replace(char orginal, char zamiennik)`
* `String trim()`
* `String toLowerCase()`
* `String toUpperCase()`
* `String[] split(String regex, int limit)`
* `String[] split(String regex)`

# 3 Rekursja (rekurencja)


## Zadania

### 3.1 Przetestuj działanie poniższego programu:

```java
import java.util.*; 
public class Silnia { 

// metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji
public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
 
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));
 }
}
```

Po uruchomieniu aplikacji:

```java
Podaj liczbę: 5
5! = 120
```

Analiza działania:
Podając na wejściu liczbę 5 wywołamy metodę silnia z wartością pięć. Metoda zwróci nam wartość parametru pomnożoną ponowne wywołanie metody silnia z parametrem o 1 mniejszym itd. Przebieg działania metody będzie wyglądał tak jak poniżej: 

```
silnia(5)
    |
    5 * silnia(4)
            |
            4 * silnia(3)
                    |
                    3 * silnia(2)
                            |
                            2 * silnia(1)
                                    1 * silnia(0)
                                            |
                                            1
```

Razem dostaniemy: `5 * 4 * 3 * 2 * 1 * 1 = 120`

### 3.2 Utwórz program obliczający silnie bez użycia rekurencji. Do wykonania działania użyj dowolnej pętli.

### 3.3 Zaimplementuj algorytm potęgowania w dwóch wersjach (dwie osobne metody – funkcje): 

* rekurencyjna
* iteracyjna 

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Algorytm_szybkiego_pot%C4%99gowania.

### 3.4 Zaimplementuj algorytm obliczający wartość ciągu Fibonacciego.

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego.


### 3.5 (fakultatywne) Napisz algorytm realizujący zagadnienie wież Hanoi. 

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Wie%C5%BCe_Hanoi.
# ObjectiveProgrammingLab2
Programowanie obiektowe lab2

[**1 Typy zmiennych w języku Java**](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2/blob/master/README.md#1-typy-zmiennych-w-języku-java)

[**2 Konstrukcja wyrażeń warunkowych w języku JAVA**](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2/blob/master/README.md#2-konstrukcja-wyrażeń-warunkowych-w-języku-java)

* [2.1 Instrukcja warunkowa `if`](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2/blob/master/README.md#21-instrukcja-warunkowa-if)
* [2.2 Instrukcja warunkowa `if-else`](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#22-instrukcja-warunkowa-if-else)
* [2.3 Rozbudowana instrukcja warunkowa `else-if`](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#23-rozbudowana-instrukcja-warunkowa-else-if)
* [2.4 Konstrukcja warunkowa – operator trójargumentowy](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#24-konstrukcja-warunkowa--operator-trójargumentowy)
* [2.5 Instrukcja wielokrotnego wyboru](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#25-instrukcja-wielokrotnego-wyboru)

[**3 Konstrukcje pętli**](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2/blob/master/README.md#1-typy-zmiennych-w-języku-java)

* [*3.1 Pętla `while`*](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#31-pętla-while)
* [*3.2 Pętla `do-while`*](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#32-pętla-do-while)
* [*3.3 Pętla iteracyjna `for`*](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#33-pętla-iteracyjna-for)
* [*3.4 Pętla iteracyjna `for-each`*](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#34-pętla-iteracyjna-for-each)
* [*3.5 Instrukcje `break` i `continue`*](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab2#35-instrukcje-break-i-continue)

# 1 Typy zmiennych w języku Java

Java jest językiem silnie typowanym, co oznacza, że każda wartość w języku Java ma dobrze określony typ. Istnieją dwa rodzaje typów: typy obiektowe i typy proste (prymitywne). Typy obiektowe definiowane są przez klasy – i jest bez znaczenia, czy są to klasy które sami zaimplementowaliśmy, czy klasy pochodzące z jakichś bibliotek, np. bibliotek Java SE. Typy proste to typy wbudowane w język, traktowane w specyficzny sposób. Jest 8 typów prostych; są to: `char`, `boolean`, `byte`, `short`, `int`, `long`, `float` oraz `double`.
	Typ `char` reprezentuje pojedynczy znak (np. literę). Zmienne typu char mają wartości odpowiadające dowolnemu znakowi kodowania UTF-16.
	Typ `boolean` reprezentuje wartość typu logicznego. Zmienna typu boolean może przyjmować jedną z dwu wartości: `true` albo `false`.
	Pozostałe typy proste to typy numeryczne. Typy: `byte`, `short`, `int` i `long` to `typy` całkowitoliczbowe tj. typy reprezentujące liczby całkowite. Zmienna typu byte może przyjmować wartości z zakresu od -128 do 127. Zmienna typu `short` z zakresu od -32768 do 32767, typu `int` z zakresu od -2147483648 do 2147483647 a typu `long` z zakresu od -9223372036854775808 do 9223372036854775807.
	Typy `float` oraz double reprezentują liczby zmiennoprzecinkowe. Typ float reprezentuje wartości pojedynczej precyzji a typ double liczby podwójnej precyzji.
	Bodaj najpopularniejszym typem obiektowym obok typu `Object` jest typ `String`. Jest to typ reprezentujący ciąg znaków.

Przykład:

```java 
String a="Typ łańcuchowy";
```

Pewnym specyficznym rodzajem typu obiektowego jest tablica. Typ tablicowy to typ definiujący sekwencję elementów pewnego ustalonego typu. Typ tablicowy oznaczamy umieszczając nawiasy kwadratowe za typem elementów tablicy. Przykładowo, typ tablicowy elementów typu `int` to `int[]` a elementów typu String to `String[]`.
Przykład:

```java
int[] vector;
int[] preinitializedVector = new int[] { 1, 2, 3, 4 };
int[][] twoDimMatrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
String[] arrayName = {"Ala", "Ela", "Ula", "Ola"};
```

# 2 Konstrukcja wyrażeń warunkowych w języku JAVA


## 2.1 Instrukcja warunkowa `if`

```java
if( warunek ) {
  kod wykonywany warunkowo
}
```


## 2.2 Instrukcja warunkowa `if-else`

```java
if( warunek ) {
  kod wykonywany warunkowo
} else {
  kod wykonywany alternatywnie
}
```

Przykład:

```java
void isPositive(int x) {
 if( x > 0 ) {
    System.out.println("liczba " + x + " jest dodatnia");
  } else {
    System.out.println("liczba " + x + " jest ujemna");
  }
}
```

## 2.3 Rozbudowana instrukcja warunkowa `else-if`

```java
if( warunek ) {
  kod wykonywany warunkowo
} else if ( warunek_drugi ) {
  kod wykonywany gdy spełniony jest drugi warunek
} else {
  kod wykonywany alternatywnie
}
```

Przykład:

```java
void isPositive(int x) {
 if( x > 0 ) {
    System.out.println("liczba " + x + " jest dodatnia");
} else if( x == 0 ) {
    System.out.println("liczba " + x + " jest równa zero");
  } else {
    System.out.println("liczba " + x + " jest ujemna");
  }
}
```

## 2.4 Konstrukcja warunkowa – operator trójargumentowy
```java
warunek ? wartość pierwsza : wartość druga
```
Przykład:

Kod:

```java
public String isEven(int x) {
if(x % 2 == 0)
   return "parzysta";
else
   return "nieparzysta";
}
```

jest równoważny kodowi

```java
public String isEven(int x) {
  return x % 2 == 0 ? "parzysta" : "nieparzysta";
}
```

## 2.5 Instrukcja wielokrotnego wyboru 

```java
switch (wyrażenie wyboru) {
  case wartość_wyboru:
    ciąg instrukcji dla danego wariantu
  case inna_wartość_wyboru:
    ciąg instrukcji dla danego wariantu
  default:
    ciąg instrukcji dla wariantu domyślnego
}
```

Przykład:

```java
public void oddOrEven(int x) {
  switch (x % 2) {
    case 0:
      System.out.println(x + " jest liczbą parzystą");
      break;
    case 1:
      System.out.println(x + " jest liczbą nieparzystą");
      break;
    default:
      System.out.println("nieprzewidziana sytuacja");
  }
}
```

gdzie polecenie brak oznacza, że po spełnieniu warunku i wejściu do danego bloku case, pozostałe bloki nie będą już sprawdzane, zatem kod zawarty w nich na pewno się nie wykona.


# 3 Konstrukcje pętli

## 3.1 Pętla `while`

```java
while( {warunek_pętli} ) {
  ciało pętli
}
```

Przykład:

```java
public void lowerThan(int num) {
  int x = 0;

while( x < num ) {
    System.out.println(x);
    x = x + 1;
  }
}
```

Uwaga: 
Pętla while może nie wykonać kodu w niej zawartego ani raz jeśli warunek początkowy (pierwszy warunek sprawdzany przez pętle nie jest spełniony). 

## 3.2 Pętla do-while 

```java
do {
  ciało pętli
} while ( warunek_pętli );
```

Przykład:

```java
public void lowerThan(int num) {
  int x = 0;
  
  while( x < num ) {
    System.out.println(x);
  
    x = x + 1;
  }
}
```

Uwaga: 
Pętla `do-while` wykona się przynajmniej raz, gdyż warunek sprawdzany jest po wykonaniu ciała pętli.

## 3.3 Pętla iteracyjna `for` 

```java
for(deklaracje_zmiennych; warunek_pętli; instrukcje_inkrementacji) {
  ciało pętli
}
```

Przykład:

```java
public void lowerThan(int num) {
  for( int x = 0 ; x < num ; x++ )  // x++ to x=x+1
    System.out.println(x);
}

public void decrementValue(int num) {
  for( int x = num ; x >= 0 ; x-- ) // x-- to x=x-1
    System.out.println(x);
}
```

Uwaga: 
Pętla for podobnie jak pętla `while` może nie wykonać kodu w niej zawartego ani raz jeśli warunek początkowy (pierwszy warunek sprawdzany przez pętle nie jest spełniony). 

Dodatkowo:

```java
for( ; warunek pętli ; ) {
  ciało pętli
}

jest odpowiednikiem pętli:

while( {warunek pętli} ) {
  ciało pętli
}
```



## 3.4 Pętla iteracyjna `for-each`

Pętla używana do poruszania się po tablicach i kolekcjach danych.

```java
for (deklaracja_zmiennej_pętli : kolekcja lub tablica) {
  ciało pętli
}
```


Przykład:

```java
int[] myArray = { 1, 3, 5, 7, 11 };
    
for (int arrayElem : myArray) {
  System.out.print(arrayElem + " ");
}
```

## 3.5 Instrukcje `break` i `continue`

Instrukcja `BREAK` służy do natychmiastowego przerwania wykonania pętli lub ciągu instrukcji w instrukcji wyboru `SWITCH`. Wykonanie instrukcji `BREAK` powoduje skok do pierwszej instrukcji za przerwaną pętlą czy instrukcją wyboru. Instrukcja ta jest zazwyczaj stosowana do przerwania wykonania w instrukcji wyboru `SWITCH` o której piszę w kolejnym artykule. Użycie w innym celu jest niezalecane i raczej dość rzadko spotykane.

Instrukcja `CONTINUE` może być użyta wewnątrz pętli i służy do przerwania wykonania danej iteracji pętli - tylko wykonanie bieżącej iteracji jest przerwane, nie zaś wykonanie całej pętli, tak jak to ma miejsce w przypadku instrukcji `BREAK`.
W przypadku umieszczenia instrukcji `BREAK` lub `CONTINUE` w pętli zagnieżdżonej w innej pętli mają one skutek tylko dla pętli w której bezpośrednio się znajdują, ale możliwe jest wskazanie – poprzez etykietę – pętli bardziej zewnętrznej. Przykładowo, uruchomienie programu:

```java
public static void main(String[] args) {
  outerLoop:
  for (int j = 0; ; j += 100) {
    for (int i = 0; i < 5; i++) {
      if ((i + j) % 2 == 1)
        continue;
 
      if (j > 100)
        break outerLoop; // przerywa wykonanie także pętli zewnętrznej
 
      System.out.println(i + j + " jest liczbą parzystą");
    }
  }
}
```

skutkuje wyświetleniem sekwencji:

```
0 jest liczbą parzystą
2 jest liczbą parzystą
4 jest liczbą parzystą
100 jest liczbą parzystą
102 jest liczbą parzystą
104 jest liczbą parzystą
```

Instrukcja `CONTINUE` z powyższego przykładu nie została oznaczona żadną etykietą, dlatego dotyczy ona wewnętrznej pętli `FOR`. Instrukcja `BREAK` z etykietą outerLoop powoduje natomiast przerwanie wykonania obydwu pętli, jako że etykietą tą została oznaczona pętla zewnętrzna.
Zadania do wykonania w ramach konspektu:

### Zadanie 1. 
Napisz program obliczający wyróżnik delta i pierwiastki trójmianu kwadratowego.

### Zadanie 2. 
Napisz kalkulator obliczający: sumę, różnicę, iloczyn, iloraz, potęgę, pierwiastek, oraz wartości funkcji trygonometrycznych dla zadanego kąta. Użyj biblioteki Math np. `Math.Sin(2.5)`. Proszę pamiętać, że wartości kąta podawane do funkcji mierzone są miarą łukową. Wyniki działania algorytmów wyświetlaj na konsoli. Do obsługi menu proszę użyć konstrukcji `switch-case` oraz pętli `while`.

### Zadanie 3. 
Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy. Następnie utwórz następujące funkcjonalności używając pętli `for`:

* Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
* Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
* Wyświetlanie elementów o nieparzystych indeksach.
* Wyświetlanie elementów o parzystych indeksach.

Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności programu utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji `else-if` oraz pętli `do-while`.

### Zadanie 4. 
Napisz program umożliwiający wprowadzanie 10-ciu liczb. Dla wprowadzonych liczb wykonaj odpowiednie algorytmy:

* oblicz sumę elementów tablicy,
* oblicz iloczyn elementów tablicy,
* wyznacz wartość średnią,
* wyznacz wartość minimalną,
* wyznacz wartość maksymalną.

Wyniki działania algorytmów wyświetlaj na konsoli. Utwórz odpowiednie menu. 

### Zadanie 5. 
Napisz program wyświetlający liczby od 20-0, z wyłączeniem liczb `{2,6,9,15,19}`. Do realizacji zadania wyłączenia użyj instrukcji `continue`;

### Zadanie 6.
Napisz program, który w nieskończoność pyta użytkownika o liczby całkowite. Pętla nieskończona powinna się zakończyć gdy użytkownik wprowadzi liczbę mniejszą od zera. Do opuszczenia pętli nieskończonej użyj instrukcji `break`. Pętle nieskończoną realizuje się następującymi konstrukcjami:

```java
while(true)	
  { ciało pętli }
```
 lub    
```java
for(;;) 
  { ciało pętli }
```
       

### Zadanie 7.  
Napisz program umożliwiający wprowadzanie n liczb oraz sortujący te liczby metodą bąbelkową lub wstawiania. Wyniki wyświetlaj na konsoli.





###### Opracował dr inż. Wojciech Kozioł
