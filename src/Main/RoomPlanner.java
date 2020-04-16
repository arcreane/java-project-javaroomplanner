package Main;

import java.util.Scanner;

import User.User;

public class RoomPlanner {

	static User CurrentUser;

	static void StartPlanning(String args) {
		boolean keepWorking = true;
		Scanner scanuser = new Scanner(System.in);
		while (keepWorking) {
			System.out.println("Bienvenue sur RoomPlanner");
			if (args.isEmpty()) {

				System.out.println("- Taper 1 =  Se connecter ! \n"
						+ "- Taper 2 = S'Inscrire (cette inscription sera validé ou non par le Directeur)\n"
						+ "- Taper 3 = Quitter l'application...");
				
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
					System.out.println(
							"Votre demande a bien �t� prise en compte elle devrait �tre valid�e sous peu...");
					break;
				case 3:
					keepWorking = false;
					break;
				default:
				}
			}
			else
			{
				if(args.equals(SimulateBDD.codeInvtTest))
				{
					System.out.println("Voici les infos de la salle");
					break;
				}
				
			}
		}
	}
}