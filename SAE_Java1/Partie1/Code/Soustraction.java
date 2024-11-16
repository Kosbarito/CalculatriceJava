public class Soustraction extends Operation {

    public Soustraction(Nombre operande1, Nombre operande2) {
        super(operande1, operande2); // Récupère les variablke d'Opération
    }

    public int valeur() {
        return getOperande1().valeur() - getOperande2().valeur(); // L'operation soustraction
    }

    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}