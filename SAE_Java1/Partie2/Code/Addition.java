/**
 * Creation de la classe opération
 * @author Mohamed Kosbar & Konté Diarra
 */

public class Addition extends Operation {
    
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }


    public double valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }


    public String toString() {
        return "(" + getOperande1() + " + " + getOperande2() + ")";
    }
}
