public abstract class Operation {
    private Nombre operande1; // On créé deux variable de type Nombre
    private Nombre operande2;

    public Operation(Nombre operande1, Nombre operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    } // Constructeur Champs à Champs  

    public abstract int valeur();
    // Méthode abstrate à complété 

    public Nombre getOperande1() {
        return operande1;
    }
    public Nombre getOperande2() {
        return operande2;
    }
}