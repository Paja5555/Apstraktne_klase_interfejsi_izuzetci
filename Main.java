package vozilo;

import vozilo.impl.EvidencijaVozilaImplementacija;
import vozilo.izuzeci.VoziloException;
import vozilo.kategorija.KategorijaVozila;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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


        //PRVO MORAMO DA NAPRAVIMO OBJEKAT KLASE EVIDENCIJAVOZILAIMPLEMENTACIJA DA BI MOGLI DA POZOVEMO METODE TE KLASE !!!!!
        EvidencijaVozilaImplementacija ev = new EvidencijaVozilaImplementacija(true); //mora zbg konstruktora
        PutničkoVozilo v2 = new PutničkoVozilo();
        TeretnoVozilo v3 = new TeretnoVozilo();
        PutničkoVozilo v4 = new PutničkoVozilo();
        PutničkoVozilo v5 = new PutničkoVozilo();
        v2.setRegistracija("BG-189-PO");
        v3.setRegistracija("BG-491-AU");
        v4.setRegistracija("BG-873-LK");
        v5.setRegistracija("KG-249-NT");
        v2.setuSaobraćaju(true);
        v3.setuSaobraćaju(true);
        v4.setuSaobraćaju(true);
        v5.setuSaobraćaju(false);
        v2.setPredjenaKilometraža(211000);
        v3.setPredjenaKilometraža(198000);
        v4.setPredjenaKilometraža(96000);
        v5.setPredjenaKilometraža(356000);
        /*List<Vozilo> vozila= new ArrayList<>();
        vozila.add(v2);
        vozila.add(v3);
        vozila.add(v4);
        vozila.add(v5);
        System.out.println(vozila);*/
        ev.dodajVozilo(v2);
        ev.dodajVozilo(v3);
        ev.dodajVozilo(v4);
        ev.dodajVozilo(v5);
        ev.arhivirajVozila();
        ev.sacuvajVozilaSaKilometrazom(100000);
        



    }
}
