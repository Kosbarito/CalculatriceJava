 /**
 * Creation de la classe Nombre
 * @author Mohamed Kosbar & Konté Diarra
 */
public class Nombre {
        private int valeurNombre;

        public Nombre(int valeur) {
            this.valeurNombre = valeur;
        }

        public int valeur() {
            return valeurNombre;
        }

        public String toString() {
            return  "" + valeurNombre;
        }
    }

