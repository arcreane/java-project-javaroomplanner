package Main;

import java.util.Scanner;

import User.User;

public class RoomPlanner {

	static User CurrentUser;

	static void StartPlanning() {
		boolean keepWorking = true;
		while (keepWorking) {
			System.out.println("Hello, bienvenue dans notre syteme de gestion d'utilisateur");
			System.out.println("Veuillez taper 1 pour vous connecter ou vous inscricre \n"
					+ " taper 2 pour faire une demande d'inscription qui devra être validé par le directeur\n"
					+ " taper 3 pour quitter");
			Scanner scanuser = new Scanner(System.in);
			while (scanuser.hasNextInt() == false) {
				System.out.println("Choisie soit 1 pour la connexion ou 2 si tu n'est pas encore inscrit");
				scanuser.next();
			}
			int answer = scanuser.nextInt();
			switch (answer) {
			case 1:
				CurrentUser = SimulateBDD.Login();
				if (CurrentUser != null) {
					CurrentUser.StartWorking();
				}
				break;
			case 2:
				SimulateBDD.SignIn();
				System.out.println("Votre demande a bien été prise en compte elle devrait être validée sous peu");
				break;
			case 3:
				keepWorking = false;
				break;
			default:
			}
		}
	}
}
