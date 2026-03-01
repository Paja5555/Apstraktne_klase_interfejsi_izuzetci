package vozilo;

import vozilo.izuzeci.VoziloException;
import vozilo.kategorija.KategorijaVozila;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws VoziloException {
        PutničkoVozilo v = new PutničkoVozilo();
        TeretnoVozilo v1 = new TeretnoVozilo();
        v.setBrojSedišta(7);
        v1.setNosivost(200);
        //v.predjenaKilometraža=600000;
        //v1.predjenaKilometraža=-200;
        //System.out.println(v.predjenaKilometraža); ne dobijam ovako nista mora preko setera da bi izbacio exception
        //System.out.println(v1.predjenaKilometraža);
        v.setPredjenaKilometraža(450000);
        v1.setPredjenaKilometraža(200);
        v1.setRegistracija("BG-123-56");
        v1.setVlasnik("Marko M");
        v1.setDatumRegistracije(LocalDateTime.of(2025,05,16,0,0));
        v1.setuSaobraćaju(true);
        v1.setKategorija(KategorijaVozila.TERETNO);
        //v1.toString(); ne moze ovako mora sout(v1.toString())
        System.out.println(v1.toString());


    }
}
