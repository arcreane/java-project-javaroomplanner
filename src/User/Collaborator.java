package User;

import java.util.Map;

import Main.SimulateBDD;

public class Collaborator extends User {
	
	public Collaborator(String name, String username, String mail, String password,  String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
	}
   
	Collaborator() {
	}

	public static Collaborator createnewusercollaborateur() {
		Collaborator newcollaborator = new Collaborator();
		
       
		newcollaborator.RegisterUser();
		return newcollaborator;
	}

	@Override
	public void StartWorking() {
		boolean keepWorking = true;
		while (keepWorking) {
			System.out.println("Que voulez faire");
			System.out.println("Choix 1 : Voir les salles");
			System.out.println("Choix 2 : Rejoindre une salle");
			System.out.println("Choix 3 : se d�connecter");
			String getuser = input.nextLine();
			switch(getuser)
			{
			case "2" :
				
				break;
			case "3":
				keepWorking = false;
				break;
			}
		}
		
	}
}
