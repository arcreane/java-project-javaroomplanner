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
			 Scanner input = new Scanner(System.in);
		        System.out.print("UserName: ");
		        String username= input.nextLine();
		        System.out.print("Password: ");
		        String password= input.nextLine();
		        System.out.println("Username: " + username);
		        System.out.println("Password: " + password);
		        while(!username.equals("test") && !password.equals("test") ){
					System.out.println("Veuillez recommencer ");
					 System.out.print("UserName: ");
					  username= input.nextLine();
					 System.out.print("Password: ");
					  password= input.nextLine();
				}
		        if (username.equals("test")){
		            if (password.equals("test")){
		                System.out.println("Vous etez connecter :)");
		            }
		            else{
		                System.out.println("Votre tentative de connexion a echouer :(");
		               
		            }
		        }
			
		    break;
		  case 2:
			System.out.println("Vous aller pouvoir vous s'incricre");
			  
		    break;
		
		  default:
		 }
	}
}
