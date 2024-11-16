 /**
     * Creation de la classe Test
 * @author Mohamed Kosbar & Konté Diarra
 */

public class TestOperation {

    public static void main(String[] args) {

        Expression operande1 = new Nombre(17); // Je genere le nombre de type Expression : 17
        Expression operande2 = new Nombre(2); // Meme chose pour 2
        Expression operande3 = new Nombre(3); // Meme chose pour 3

        try { 
            
            Expression a = new Addition(operande2, operande3);

            Expression s = new Soustraction(operande1, operande2);

            Expression d = new Division(s, a);

            System.out.println(d + " = " + d.valeur()); // Il doit renvoyer ((17 - 2) / (2 + 3)) = 3

        } catch (ArithmeticException e) {
            System.err.println("Erreur: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite: " + e.getMessage());
        }
    }
}
