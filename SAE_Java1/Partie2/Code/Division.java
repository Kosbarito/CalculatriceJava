public class Division extends Operation {

    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);

    }

    public double valeur() {

        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division par zéro !"); // On Verifie la valeur de l'operande 2
        }
        return getOperande1().valeur() / getOperande2().valeur(); //Ce que la méthode fera comme calcul
    }
    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")"; //Retourne l'affichage du calcul
    }
}
