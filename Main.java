package SolidOcp;

public class Main {

	public static void main(String[] args) {
		Authentifiable employé1 = Employé.authentifier("admin");
		Authentifiable employé2 = Employé.authentifier("developpeur");
		Authentifiable employé3 = Employé.authentifier("directeur");

        // Affichage des types d'employés authentifiés
        System.out.println("Employé 1 : " + employé1.getClass().getSimpleName());
        System.out.println("Employé 2 : " + employé2.getClass().getSimpleName());
        System.out.println("Employé 3 : " + employé3.getClass().getSimpleName());

	}

}
