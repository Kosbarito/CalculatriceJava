 /**
 * Creation de la classe Division
 * @author Mohamed Kosbar & Konté Diarra
 */

public class Nombre extends Expression {

    private double valeurNombre;

    public Nombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    public double valeur() {
        return valeurNombre;
    }

    public String toString() {
        return "" + valeurNombre;
    }
}
