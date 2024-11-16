public class Multiplication extends Operation {

    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);  // Hérite des constructeurs
    }

    public double valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}
