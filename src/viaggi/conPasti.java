package viaggi;

public class conPasti extends pacchettiViaggi{
    private  boolean PensioneComp;

    public conPasti(String destinazione, int durata, double costo, boolean pensioneComp){
        super(destinazione,  durata, costo, pensioneComp);
        this.PensioneComp=PensioneComp;
    }

    public boolean isPensioneComp() {
        return PensioneComp;
    }

    public void setPensioneComp(boolean pensioneComp) {
        PensioneComp = pensioneComp;
    }
}