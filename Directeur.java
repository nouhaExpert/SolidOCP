package SolidOcp;

public class Directeur implements Authentifiable {
    // Attributs et méthodes spécifiques à un directeur
    
    @Override
    public void authentifier() {
    	System.out.println("Authentification de la directeur...");
    }
}
