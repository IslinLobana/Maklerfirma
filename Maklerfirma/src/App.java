public class App {


/*
Aufgabe 1:
Ich musste dazu die Klasse der Wohnungen bzw der Häuser erstellen die verkaeuft werden sollen. In diesen haben ich dann die jeweiligen Eigenschaften erstellt und die Klassenvariablen wie z.B Preis oder Beschreibung deklariert. Zudem habe ich die Klassen des Käufers und des Verkäufers erstellt. Diese hatten jeweils die selben Eigenschaften mit den selben Klassenvariblen, nähmlich den Vornamen und den Nachnamen. Nun will man die Verkäufe implimentieren. Dazu habe ich einmal eine Klasse des Wohnungsverkaufs erstellt und einmal eine des Hausverkaufs. So könnte man später auswählen, was für ein Verkauf es am Ende denn geworden ist. Aus diesern Klassen kann ich jetzt ganz viele Objekte erstellen, da ich die Klassen bereits definiert habe. Nun greifen jeweils die beiden Verkaufsklassen auf die Klassen der Häuser bzw. der Wohnungen zu um sich daher die Eigenschaften der jeweiligen Klasse zu ziehen. Dasselbe mit den Käufern und Verkäufern, nur das dies beide Verkaufsklassen machen. Das OOP-Paradigma also sprich die Objektorientierte Programmierung ist dafür da, um dem Programmierer eine besser Vorstellung davon zu geben was er denn da gerade eigentlich tut. So ist das Ziel der OOP immer, dass man den Code quasi auf die reale Welt logisch übertragen könnte.*/





static Haeuser[] _haeuser;
static Hausverkaeufe[] _hausverkaeufe;
static Kaeufer[] _kaeufer;
static Makler[] _makler;
static Wohnungen[] _wohnungen;
static Wohnungsverkaeufe[] _wohnungsverkaeufe;
static Wohnungsreservierung[] _wohnungsreservierung;
static Hausreservierung[] _hausreservierung;



//Aufgabe 3:
public static void main(String [] args) throws Exception{
    _haeuser = new Haeuser[10];
    _haeuser[0] = new Haeuser(100000, 250, 2, "Schön", "Einfamilie");

    _kaeufer = new Kaeufer[10];
    _kaeufer[0] = new Kaeufer("Herbert", "König");
    _kaeufer[1] = new Kaeufer("Maxi", "Schmidt");

    _makler = new Makler[10];
    _makler[0] = new Makler("Hubertus", "Schlange");

    _wohnungen = new Wohnungen[10];
    _wohnungen[0] = new Wohnungen(200000, 150, "Zentral", "Modern");


    _hausverkaeufe = new Hausverkaeufe[10];
    _hausverkaeufe[0] = new Hausverkaeufe(_makler[0], _kaeufer[0], _haeuser[0]);


    _wohnungsverkaeufe = new Wohnungsverkaeufe[10];
    _wohnungsverkaeufe[0] = new Wohnungsverkaeufe(_makler[0], _kaeufer[0], _wohnungen[0]);

    _hausreservierung = new Hausreservierung[10];
    _hausreservierung[0] = new Hausreservierung(_makler[0], _kaeufer[0], _haeuser[0]);
    System.out.println("Das Haus " + _haeuser[0] + " wurde vom Makler "+ _makler[0] + " für den Käufer " + _kaeufer[0] + "reserviert. Es gibt insgseamt 1 Reservierungen auf das Haus");
    _hausreservierung[0] = new Hausreservierung(_makler[0], _kaeufer[1], _haeuser[0]);
    System.out.println("Das Haus " + _haeuser[0] + " wurde vom Makler "+ _makler[0] + " für den Käufer " + _kaeufer[1] + "reserviert. Es gibt insgseamt 2 Reservierungen auf das Haus");

}

//Aufgabe 4.1:
/*
Hier habe ich die beiden Reservierungen als Demodaten erstellt. Dabei beziehen sich die Variablen der Demodaten auf die Eigenschaften der jeweiligen Klassen, also Sprich Makler, Käufer und das jeweilige Haus. Die Demodaten dafür habe ich ja bereits wenige Zeilen davor erstellt. So wird bei der zweiten Hausreservierung dann auch der zweite Käufer für das selbe Haus mit dem selben Makler eingetragen  Man kann nun auch noch ein Menü dafür erstellen, dass man diese , wie ich sie genannt habe, Häuser- bzw. Wohnungsreservierungen selbst erstellen kann. Jedoch sprengt das heir denke ich den Rahmen, wobei wir ja auch kein Menü erstellen sollten.

*/
}
