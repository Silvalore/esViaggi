package viaggi;

public class conVolo extends pacchettiViaggi {
        private boolean andataRitorno;

        public conVolo(String destinazione, int durata, double costo, boolean andataRitorno) {
            super(destinazione, durata, costo);
            this.andataRitorno = andataRitorno;
        }

        public boolean GetAndataRitorno() {
            return andataRitorno;
        }

        public void setAndataRitorno(boolean andataRitorno) {
            this.andataRitorno = andataRitorno;
        }

        public String toString() {
            return super.toString() + " andataRitono" + this.andataRitorno;
        }

        public boolean equals(Object o) {
            if (o instanceof pacchettiViaggi) {
                pacchettiViaggi r = (pacchettiViaggi) o;
                return super.equals(o) && this.andataRitorno == GetAndataRitorno();
            }
            return false;
        }

        public double costoViaggi() {
            if (GetAndataRitorno()) {
                return super.getCosto() + super.getCosto() / 100 * 85;
            }
            return super.getCosto() + super.getCosto() / 100 * 50;
        }
    }
