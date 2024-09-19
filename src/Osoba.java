import java.util.Scanner;

public abstract class Osoba {
    private String nazwisko;
    private String imie;
    private int wiek;
    //hermetyzacja -> modyfiukatory dostępu
    /*
    * public = dostępne wszędzie
    * private = dostepne tylko w tej klasie
    * protected = dostępne w tej klasie i klasie pochodnej(w javie protected to dostępne też w ramach pakietu)
    * brak modyfikatora = dostępne w pakiecie
    * */

    /*
    * Z klasy abstract nie można utworzyć obiektu
    * */


    public Osoba(String wiek, String nazwisko, int imie) {
        this.wiek = Integer.parseInt(wiek);                                                       //konstruktor
        this.nazwisko = nazwisko;    //zmienne lokalne
        this.imie = String.valueOf(imie);
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;//wiek to pole klasy
        wiek = 6;    //przeciążanie konstruktora
    }


    //metody dostępu

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    //setter imienia

    public void setImie(String imie) {
        System.out.println("Wprowadź hasło");
        Scanner klaw = new Scanner(System.in);
        String haslo = klaw.next();
        if(haslo.equals("asd123")){
            this.imie = imie;
        }
        else{
            System.out.println("Kij ci w szprychy");
        }

    }
    @Override
    public String toString() {
        return "Osoba" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek;
    }
}
