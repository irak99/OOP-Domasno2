import java.util.Arrays;

public class Student extends Covek{


    private String brIndeks;

    private double prosek;

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {

        this.prosek = prosek;
    }

    public String getBrIndeks() {
        return brIndeks;
    }

    public void setBrIndeks(String brIndeks) {
        this.brIndeks = brIndeks;
    }
    public Student (){

    }
    @Override
    public String toString(){
        return "Br. na idex:" + brIndeks + "i prosek: " + prosek;
    }
   static public  class Ocenka {
       public int getOceni() {
           return oceni;
       }

       public String getPredmet() {
           return predmet;
       }

       public void setPredmet(String predmet) {
           this.predmet = predmet;
       }

       public String getDatum() {
           return datum;
       }

       public void setDatum(String datum) {
           this.datum = datum;
       }

       public void setOceni(int oceni) {
           this.oceni = oceni;
       }

       private int oceni;
        private String predmet, datum;





       @Override
       public String toString()
       {
           return "predmet: " + this.predmet + " Ocenka: " + this.oceni + " Datum na test: " + this.datum + "\n" ;
       }

   }
}