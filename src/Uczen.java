public class Uczen extends Osoba implements Dyżurny{
//dziedziczymy wszystko publiczne i chronione
    private int numerseryjny;
    public static int liczbauczniow;
    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbauczniow++;
        numerseryjny = liczbauczniow;
    }

    @Override
    public String toString() {
        return "Uczen " +
                " imie " + getImie()+
                " nazwisko " + getNazwisko()+
                " numerseryjny= " + numerseryjny;
    }

    @Override
    public void wykonajdyżur() {

    }
}
