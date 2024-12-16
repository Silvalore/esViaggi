package viaggi;

public class conPasti extends pacchettiViaggi{
    private  boolean PensioneC;

    public conPasti(String destinazione, int durata, double costo, boolean PensioneComp){
        super(destinazione,  durata, costo);
        this.PensioneC=PensioneC;
    }

    public boolean GetPensioneC() {
        return PensioneC;
    }

    public void setPensioneComp(boolean pensioneC) {
        PensioneC = pensioneC;
    }
    public String toString() {
        return super.toString() + " pensioneCompleta " + this.PensioneC;
    }
    public boolean equals(Object o){
        if(o instanceof pacchettiViaggi){
            pacchettiViaggi r=(pacchettiViaggi) o;
            return super.equals(o) && this.PensioneC==GetPensioneC();
        }
        return false;
    }
    public double costoViaggi() {
        if (GetPensioneC()) {
            return super.getCosto() + getDurata()*35;
        }
        return super.getCosto() + getDurata()*25;
    }
}

