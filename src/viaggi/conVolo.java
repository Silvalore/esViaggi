package viaggi;

public class conVolo extends pacchettiViaggi{
    private  boolean andataRitorno;

    public conVolo(String destinazione, int durata, double costo, boolean andataRitorno){
        super(destinazione,  durata, costo,andataRitorno);
        this.andataRitorno=andataRitorno;
    }

    public boolean GetAndataRitorno() {
        return andataRitorno;
    }

    public void setAndataRitorno(boolean andataRitorno) {
        this.andataRitorno = andataRitorno;
    }
}