public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan","Stokrotka");
        System.out.println(Osoba.imie);
        System.out.println(Osoba.nazwisko);
        System.out.println(Osoba.wiek);
        Osoba.imie = "Jaś";
        System.out.println(Osoba.imie);
    }
}