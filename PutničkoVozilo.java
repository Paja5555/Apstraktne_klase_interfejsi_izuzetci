package vozilo;

import vozilo.izuzeci.VoziloException;

public class PutničkoVozilo extends Vozilo{
    private int brojSedišta;

    public int getBrojSedišta() {
        return brojSedišta;
    }

    public void setBrojSedišta(int brojSedišta) throws VoziloException {
        if(brojSedišta<=2 || brojSedišta>=9){
            throw new VoziloException("NEPOSTOJEĆI BROJ SEDIŠTA");
        }
        this.brojSedišta = brojSedišta;
    }

    @Override
    public void setPredjenaKilometraža(double predjenaKilometraža) throws VoziloException{
       if(predjenaKilometraža<0 || predjenaKilometraža>500000){
           throw new VoziloException("NEDOZVOLJENA KILOMETRAŽA");
       }
       this.predjenaKilometraža=predjenaKilometraža; //sme jer je protected inace bi islo super.set(predjenaKilometraza) ali ne bi ni to moglo jer je nadklasa abstraktna
    }
}
