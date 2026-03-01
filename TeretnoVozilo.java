package vozilo;

import vozilo.izuzeci.VoziloException;

public class TeretnoVozilo extends Vozilo{
    private double nosivost;

    public double getNosivost() {
        return nosivost;
    }

    public void setNosivost(double nosivost) throws VoziloException {
        if(nosivost<0){
            throw new VoziloException("GREŠKA,NEGATIVNA NOSIVOST");
        }
        this.nosivost = nosivost;
    }

    @Override
    public void setPredjenaKilometraža(double predjenaKilometraža) throws VoziloException {
       if(predjenaKilometraža<0){
           throw new VoziloException("GREŠKA,NEISPRAVAN UNOS KILOMETRAŽE");
       }
       this.predjenaKilometraža=predjenaKilometraža;
    }
}
