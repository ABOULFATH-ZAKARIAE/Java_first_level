package firstproject;

import java.util.*;

public class Brief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu Monsieur");
		System.out.println("Entrer Votre Nom et Prénom S'il ve plait!!");
		String str = sc.nextLine();
		System.out.println("Bonjour " + str);
		System.out.println("Entrer le Nombre D'heures Travailées");
		int nmbr_heure = sc.nextInt();
		
		
		if (nmbr_heure <= 60) {
			System.out.println("Entrer le tarif par heure");
			int tarif = sc.nextInt();
			int salaire = tarif * nmbr_heure;
			System.out.println("votre indemnisation est de" + " " + salaire + " " + "MAD");
			
			
		}else if (nmbr_heure >70) {
			System.out.println(" informations erronés");
		}
	}

}
