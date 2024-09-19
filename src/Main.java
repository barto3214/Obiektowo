public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan","Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());
        osoba.setImie("Jaś");
        System.out.println(osoba.getImie());
    }
}