package User;

import java.util.Map;

import Main.SimulateBDD;

public class Director extends User {

	Director() {

	}

	public Director(String name, String username, String mail, String password, String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
	}

	public static User createnewuser() {
		User newUSer;

		return null;
	}

	public void EjectRoom() {
	}

	public void BookRoom() {
	}

	@Override
	public void StartWorking() {
		boolean keepWorking = true;
		while (keepWorking) {
			System.out.println("Que voulez faire");
			System.out.println("Choix 1 : Enregistre un nouvel utilisateur");
			System.out.println("Choix 2 : Valider les demandes d'inscription");
			System.out.println("Choix 3 : g�rer les salles");
			System.out.println("Choix 4 : se d�connecter");
			String getuser = input.nextLine();
			switch(getuser)
			{
			case "2" :
				Map<String, User> userToValidate = SimulateBDD.GetTmpUsers();
				break;
			case "4":
				keepWorking = false;
				break;
			}
		}

	}
}
