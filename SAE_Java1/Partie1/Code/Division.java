 /**
 * Creation de la classe Division
 * @author Mohamed Kosbar & Konté Diarra
 */

public class Division extends Operation {

    public Division(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }

    public int valeur() {
        int valeurOperande2 = getOperande2().valeur();
        if (valeurOperande2 == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return getOperande1().valeur() / valeurOperande2;
    }

    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
