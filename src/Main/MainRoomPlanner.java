package Main;

import java.util.Scanner;


public class MainRoomPlanner {
	public static void main(String[] args) {
		System.out.println("Hello, bienvenue dans notre syteme de gestion d'utilisateur");
		System.out.println("Veuillez vous connecter ( taper 1 ) ou vous inscricre ( taper 2 ) pour acceder a la gestion de vos salles");
		Scanner scanuser = new Scanner(System.in);
		while( scanuser.hasNextInt() == false ) {
			System.out.println("Choisie soit 1 pour la connexion ou 2 si tu n'est pas encore inscrit");
			scanuser.next();
		}	
		 int answer = scanuser.nextInt();
		 switch(answer) {
		 case 1:
			System.out.println("Vous aller pouvoir vous connecter");
			 
			
		    break;
		  case 2:
			System.out.println("Vous aller pouvoir vous s'incricre");
			  
		    break;
		
		  default:
		 }
	}
}
