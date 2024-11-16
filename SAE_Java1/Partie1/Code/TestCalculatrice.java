 /**
 * Creation de la classe TestCalculatrice
 * @author Mohamed Kosbar & Konté Diarra
 */

public class TestCalculatrice {
    public static void main(String[] args) {
        // Création de deux nombres aléatoire
        Nombre nombre1 = new Nombre(10);
        Nombre nombre2 = new Nombre(0);

    // On va tester l'addition
       Operation a = new Addition(nombre1, nombre2);
       System.out.println(a + " = " + a.valeur()); // il doit retourner : (10 + 0) = 10

    // On va tester la soustraction
       Operation s = new Soustraction(nombre1, nombre2);
       System.out.println(s + " = " + s.valeur()); // il doit retourner : (10 - 0) = 10

    // On va tester la multiplication
       Operation m = new Multiplication(nombre1, nombre2);
       System.out.println(m + " = " + m.valeur()); // il doit retourner : (10 * 0) = 0
    
    // On va tester la division

        try { // On doit gerer les exeptions avce le try et catch
            Operation d = new Division(nombre1, nombre2);
            System.out.println(d + " = " + d.valeur()); // il doit afficher : Erreur : Division par zéro !
        }
        catch (ArithmeticException e) {

        System.out.println("Erreur : " + e.getMessage());

    }
  }
}
