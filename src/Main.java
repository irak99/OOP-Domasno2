import java.lang.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Covek cv = new Covek();
        Student std = new Student();
        cv.setGodini(19);
        cv.setIme("Nikola");
        cv.setPrezime("Irakoski");
        System.out.println(cv);

        Student.Ocenka predmet1 = new Student.Ocenka();
        predmet1.setOceni(10);
        predmet1.setPredmet("Makednoski");
        predmet1.setDatum("11-11-2011");
        Student.Ocenka predmet2 = new Student.Ocenka();
        predmet2.setDatum("13-11-2011");
        predmet2.setPredmet("Muzicko");
        predmet2.setOceni(6);
        System.out.println(predmet1);
        System.out.println(predmet2);

        std.setProsek((predmet1.getOceni() + predmet2.getOceni() )/2 );
        System.out.println("Prosek na studentot= "+std.getProsek());

    }
}
