package viaggi;
public class pacchettiViaggi{
    private String destinazione;
    private int durata;
    private double costo;

    public pacchettiViaggi(String destinazione, int durata, double costo, boolean pensioneComp){
        this.destinazione=destinazione;
        this.costo=costo;
        this.durata=durata;
    }
    public String getDestinazione(){
        return destinazione;

    }

    public double getCosto() {
        return costo;
    }

    public int getDurata() {
        return durata;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    public String toString() {
        return "destinazione='" + destinazione + '\'' + ", durata=" + durata + ", costo=" + costo;
    }
    public boolean equals(Object o){
        if(o instanceof pacchettiViaggi){
            pacchettiViaggi r=(pacchettiViaggi) o;
            return r.getDestinazione().equalsIgnoreCase(this.destinazione) && this.durata==r.getDurata() && this.costo==getCosto();
        }
        return false;
    }
}
