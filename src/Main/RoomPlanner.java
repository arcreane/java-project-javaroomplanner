package Main;

import java.util.Scanner;

import User.User;

public class RoomPlanner {

	static User CurrentUser;

	static void StartPlanning() {
		boolean keepWorking = true;
		while (keepWorking) {
			System.out.println("Bienvenue sur RoomPlanner");
			System.out.println("- Taper 1 =  Se connecter ! \n"
					+ "- Taper 2 = S'Inscrire (cette inscription sera validé ou non par le Directeur)\n"
					+ "- Taper 3 = Quitter l'application...");
			Scanner scanuser = new Scanner(System.in);
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
				System.out.println("Votre demande a bien �t� prise en compte elle devrait �tre valid�e sous peu...");
				break;
			case 3:
				keepWorking = false;
				break;
			default:
			}
		}
	}
}
