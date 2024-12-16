package viaggi;

public class AgenziaViaggi {
    public class agenziaViaggi {
        private pacchettiViaggi [] v;
        private int inseriti;

        public agenziaViaggi(pacchettiViaggi[] viaggios,int inseriti) {
            this.v = viaggios;
            this.inseriti=inseriti;
        }
        public agenziaViaggi(int nViaggio) {
            this(new pacchettiViaggi[nViaggio],0);
        }
        public agenziaViaggi() {
            this(new pacchettiViaggi[100],0);
        }


        public pacchettiViaggi[] getViaggio() { return v; }
        public void setViaggio(pacchettiViaggi[] viaggio) { this.v = viaggio; }

        public int getInseriti() { return inseriti; }
        public void setInseriti(int inseriti) { this.inseriti = inseriti; }


        @Override
        public String toString() {
            String s="Elenco:\n";
            for (int i=0;i<this.inseriti;i++){
                s=s+v[i].toString()+", costo: "+v[i].getCosto()+" \n";
            }
            return s;
        }
        @Override
        public boolean equals(Object o){
            if(o instanceof agenziaViaggi){
                agenziaViaggi r=(agenziaViaggi) o;
                for (int i=0;i<this.inseriti;i++){
                    if (!v[i].equals(r.getViaggio()[i])){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }


        public boolean inserisci(pacchettiViaggi viaggio){
            if (this.inseriti== v.length)
                return false;
            else {
                v[this.inseriti] = viaggio;
                this.inseriti++;
                return true;
            }
        }
        public double getCostoMedio(){
            double costo=0.0;
            for (int i=0;i<this.inseriti;i++){
                costo+=v[i].getCosto();
            }
            return costo/this.inseriti;
        }
        public int getPosizionePacchettoMin(){
            double costoMin=v[0].getCosto();
            int posMin=0;
            for (int i=0;i<this.inseriti;i++){
                if (costoMin>v[i].getCosto()){
                    costoMin=v[i].getCosto();
                    posMin=i;
                }
            }
            return posMin;
        }
        public int getPosizionePacchettoMax(){
            double costoMax=v[0].getCosto();
            int posMax=0;
            for (int i=0;i<this.inseriti;i++){
                if (costoMax<v[i].getCosto()){
                    costoMax=v[i].getCosto();
                    posMax=i;
                }
            }
            return posMax;
        }
        public String getMinMax(){
            return "Max: "+v[getPosizionePacchettoMax()].toString()+"\n\n Min: "+v[getPosizionePacchettoMin()].toString();

        }
    }
}
