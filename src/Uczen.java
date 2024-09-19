public class Uczen extends Osoba {

    private int numerseryjny;
    public static int liczbauczniow;
    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbauczniow++;
        numerseryjny = liczbauczniow;
    }
}
