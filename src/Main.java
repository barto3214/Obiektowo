public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan","Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());
        osoba.setImie("Jaś");
        System.out.println(osoba.getImie());
        System.out.println(osoba);

        System.out.println("Liczba uczniów" + Uczen.liczbauczniow);
        Uczen uczen = new Uczen("Ewa","Tak");
        System.out.println(uczen);
        System.out.println("Liczba uczniów " + Uczen.liczbauczniow);
        Uczen uczen2 = new Uczen("Jan","nie");
        System.out.println(uczen2);
        System.out.println("Liczba uczniów " + Uczen.liczbauczniow);
        Uczen uczen3 = new Uczen("Ewas","Taks");
        System.out.println(uczen3);
        System.out.println("Liczba uczniów " + Uczen.liczbauczniow);

    }
}