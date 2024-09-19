public sealed class Nauczyciele extends Osoba implements Dyżurny permits Wychowawca{
    private  String przedmiot;

    public Nauczyciele(String wiek, String nazwisko, int imie, String przedmiot) {
        super(wiek, nazwisko, imie);
        this.przedmiot = przedmiot;
    }

    @Override
    public void wykonajdyżur() {
        System.out.println("Spacer po korytarzu");
    }
}
