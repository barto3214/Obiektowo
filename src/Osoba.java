public class Osoba {
    public static String nazwisko;
    public static String imie;
    public static int wiek;

    public Osoba(int wiek, String nazwisko, String imie) {
        this.wiek = wiek;                                                       //konstruktor
        this.nazwisko = nazwisko;    //zmienne lokalne
        this.imie = imie;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 6;    //przeciążanie konstruktora
    }
}
