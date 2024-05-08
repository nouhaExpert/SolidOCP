package SolidOcp;

public class Admin implements Authentifiable {
    // Attributs et méthodes spécifiques à un administrateur
    
    @Override
    public void authentifier() {
    	System.out.println("Authentification de l'admin...");
    }
}