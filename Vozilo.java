package vozilo;

import vozilo.izuzeci.VoziloException;
import vozilo.kategorija.KategorijaVozila;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vozilo {
    private String registracija;
    private String vlasnik;
    private LocalDateTime datumRegistracije;
    protected double predjenaKilometraža;
    private boolean uSaobraćaju;
    private KategorijaVozila kategorija;

    public String getRegistracija() {
        return registracija;
    }
              //BG-123-AA
    public void setRegistracija(String registracija) throws VoziloException {
        if(registracija==null || registracija.isEmpty() || (registracija.charAt(2)!='-' && registracija.charAt(6)!='-')){
            throw new VoziloException("NEISPRAVAN UNOS REGISTRACIJE");
        }
        this.registracija = registracija;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) throws VoziloException {
        if(vlasnik==null || vlasnik.isEmpty() || !(vlasnik.contains(" "))){
            throw new VoziloException("VLASNIK NE POSTOJI");
        }
        this.vlasnik = vlasnik;
    }

    public LocalDateTime getDatumRegistracije() {
        return datumRegistracije;
    }

    public void setDatumRegistracije(LocalDateTime datumRegistracije) throws VoziloException {
        if(datumRegistracije==null || datumRegistracije.isAfter(LocalDateTime.now())){
            throw new VoziloException("NEISPRAVAN UNOS DATUMA");
        }
        this.datumRegistracije = datumRegistracije;
    }

    public double getPredjenaKilometraža() {
        return predjenaKilometraža;
    }

    public abstract void setPredjenaKilometraža(double predjenaKilometraža) throws VoziloException;

    public boolean isuSaobraćaju() {
        return uSaobraćaju;
    }

    public void setuSaobraćaju(boolean uSaobraćaju) {
        this.uSaobraćaju = uSaobraćaju;
    }

    public KategorijaVozila getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaVozila kategorija) throws VoziloException{
        if(kategorija==null){
            throw new VoziloException("NEISPRAVNA KATEGORIJA");
        }
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "registracija='" + registracija + '\'' +
                ", vlasnik='" + vlasnik + '\'' +
                ", datumRegistracije=" + datumRegistracije +
                ", predjenaKilometraža=" + predjenaKilometraža +
                ", uSaobraćaju=" + uSaobraćaju +
                ", kategorija=" + kategorija +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vozilo vozilo)) return false;
        return Objects.equals(getRegistracija(), vozilo.getRegistracija());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRegistracija());
    }







}
