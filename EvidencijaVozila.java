package vozilo.evidencija;

import vozilo.Vozilo;

public interface EvidencijaVozila {
    public void ispisiPoVlasniku(String vlasnik);
    public void dodajVozilo(Vozilo v);
}   //moraju se ove metode prvo implementirati u nekim klasma da bi mogle da se korsite
