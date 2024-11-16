 /**
 * Creation de la classe Operation
 * @author Mohamed Kosbar & Konté Diarra
 */

public abstract class Operation extends Expression {

    private Expression operande1;
    private Expression operande2;

    public Operation(Expression operation1, Expression operation2) {

        this.operande1 = operation1;  //Constructeur CHAMPS a CHAMPS
        this.operande2 = operation2; 
    }

    public Expression getOperande1() {
        return operande1;
    }

    public Expression getOperande2() {
        return operande2;
    }
}
