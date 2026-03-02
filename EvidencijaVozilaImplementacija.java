package vozilo.impl;

import vozilo.Vozilo;
import vozilo.evidencija.EvidencijaVozila;
import vozilo.izuzeci.VoziloException;
import vozilo.kategorija.KategorijaVozila;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EvidencijaVozilaImplementacija implements EvidencijaVozila {
    private List<Vozilo> vozila ;

    public EvidencijaVozilaImplementacija(boolean p) {
        if(p){
            vozila = new ArrayList<>();
            return; //Obavezno
        }
        vozila = new LinkedList<>();
    }

    @Override
    public void ispisiPoVlasniku(String vlasnik) {
        for (Vozilo v: vozila){
            if(v.getVlasnik().equals(vlasnik)){ //PO VLSNIKU a posto je string onda equals()
                System.out.println(v);
            }
        }

    }
    public boolean postoji(Vozilo v){
        if(vozila.contains(v)){
            return true;
        }
        return false;
    }

    @Override
    public void dodajVozilo(Vozilo v) throws VoziloException { //promenio sam i u interfejsu EvidencijaVozila ne znam kako drugacije
            if(v==null){
                throw new NullPointerException("VOZILO NE POSTOJI"); //prvo za null pa ostalo
            } if(postoji(v)){
                throw new VoziloException("VOZILO VEC POSTOJI U LISTI");
        }

        vozila.add(0,v);

    }

    public void isteklaVozila(){
        int brojPutničkih=0;
        int brojTeretnih=0;
        int brojMotora=0;
        LocalDateTime danas = LocalDateTime.now();
        for (int i = 0; i < vozila.size(); i++) {
            if (vozila.get(i).isuSaobraćaju() && (vozila.get(i).getDatumRegistracije().plusYears(1).isBefore(danas))) {
                System.out.print(vozila.get(i));

                if (vozila.get(i).getKategorija() == KategorijaVozila.PUTNICKO) { // MORA DA STOJI U OKVIRU IF U FORU INACE CE BROJATI ZAA SVE A NE SAMO ZA ONE KOJI ISPUNJAVAJU USLOV
                    brojPutničkih++; //moglo bi i preko instanceof al za motor nemamo klasu
                } else if (vozila.get(i).getKategorija() == KategorijaVozila.TERETNO) {
                    brojTeretnih++;
                } else if (vozila.get(i).getKategorija() == KategorijaVozila.MOTOR) {
                    brojMotora++;
                }

            }
            System.out.println("Putničkih: " + brojPutničkih); //ispod fora da se ne bi pisalo uvek nego na kraju metode
            System.out.println("Teretnih: " + brojTeretnih);
            System.out.println("Motornih: " + brojMotora);
        }


    }
}

