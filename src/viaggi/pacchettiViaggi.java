package viaggi;
public abstract class  pacchettiViaggi {
    private String destinazione;
    private int durata;
    private double costo;
    public abstract double costoViaggi();

    public pacchettiViaggi(String destinazione, int durata, double costo){
        this.destinazione=destinazione;
        this.durata=durata;
        this.costo=costo;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public double  getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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
