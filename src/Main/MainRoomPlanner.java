package Main;

import java.util.ArrayList;
import java.util.Scanner;

import User.Collaborator;
import User.User;


public class MainRoomPlanner {
	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<>();
		System.out.println("Hello, bienvenue dans notre syteme de gestion d'utilisateur");
		System.out.println("Veuillez vous connecter ( taper 1 ) ou vous inscricre ( taper 2 ) pour acceder a la gestion de vos salles.");
		Scanner scanuser = new Scanner(System.in);
		while( scanuser.hasNextInt() == false ) {
			System.out.println("Choisie soit 1 pour la connexion ou 2 si tu n'est pas encore inscrit");
			scanuser.next();
		}	
		 int answer = scanuser.nextInt();
		 switch(answer) {
		 case 1:
			System.out.println("Vous aller pouvoir vous connecter");
			User userlogin = new User();
			userlogin.LoginUser();
			
		    break;
		  case 2:
			System.out.println("Vous aller pouvoir vous s'incricre");
			 user.add(Collaborator.createnewusercollaborateur());
		    break;
		
		  default:
		 }
	}
}
