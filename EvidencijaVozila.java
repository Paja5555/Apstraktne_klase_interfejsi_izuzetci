package vozilo.evidencija;

import vozilo.Vozilo;
import vozilo.izuzeci.VoziloException;

public interface EvidencijaVozila {
    public void ispisiPoVlasniku(String vlasnik);
    public void dodajVozilo(Vozilo v) throws VoziloException;
}   //moraju se ove metode prvo implementirati u nekim klasma da bi mogle da se korsite
