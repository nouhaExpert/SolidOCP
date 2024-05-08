package SolidOcp;

public class Employé {
	public static Authentifiable authentifier(String nom) {
        switch (nom.toLowerCase()) {
            case "admin":
                return new Admin();
            case "developpeur":
                return new Développeur();
            case "directeur":
                return new Directeur();
            // Ajoutez d'autres cas pour d'autres types d'employés ici
            default:
                throw new IllegalArgumentException("Type d'employé inconnu : " + nom);
        }
    }
}
