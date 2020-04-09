package Main;

import java.util.ArrayList;
import java.util.Scanner;

import User.Collaborator;
import User.User;


public class MainRoomPlanner {
	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<>();
		System.out.println("Hello, bienvenue dans RoomPlanner");
		System.out.println("Veuillez vous connecter ( taper 1 ) ou vous inscricre ( taper 2 )");
		Scanner scanuser = new Scanner(System.in);
		while( scanuser.hasNextInt() == false ) {
			System.out.println("Choisi 1 pour te connecter ou 2 pour t'inscrire");
			scanuser.next();
		}	
		 int answer = scanuser.nextInt();
		 switch(answer) {
		 case 1:
			System.out.println("Vous connecter :");
			User userlogin = new User();
			userlogin.LoginUser();
			
		    break;
		  case 2:
			System.out.println("Vous incricre");
			 user.add(Collaborator.createnewusercollaborateur());
		    break;
		
		  default:
		 }
	}
}
