package User;

import java.util.Map;

import Main.SimulateBDD;
import Room.Room;

public class Director extends User {

	Director() {

	}

	public Director(String name, String username, String mail, String password, String comfirmpassword, String role) {
		super(name, username, mail, password, comfirmpassword, role);
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
	public void DisplayUserAll() {
		Map<String, User> userToAfficher = SimulateBDD.getusers();
		userToAfficher.forEach((userAll, User)->{
			System.out.println("-----------------------------------");
			System.out.println("Name :" +  User.Name );
			System.out.println("Prenom :" + User.Username );
			System.out.println("Mail :" + User.Mail );
			System.out.println("Role :" + User.Role );
			System.out.println("-----------------------------------");
		});
		
	}
	public void UserDelete() {
		
		DisplayUserAll();
		System.out.println("Taper l'identifiant (mail) de l'user que vous voulez supprimer :");
		String getmailuserremove = input.nextLine();
		SimulateBDD.removeUser(getmailuserremove);
		System.out.println("Votre utilisateur : " + getmailuserremove + "a bien Ã©tÃ© supprimer");
		
	}
	public void DisplayUserOne() {
		
		String getmailuserunique = input.nextLine();
		Map<String, User> userToAfficherOne = SimulateBDD.getusers();
		User userunique = userToAfficherOne.get(getmailuserunique);
		System.out.println("-----------------------------------");
		System.out.println("Name :" + userunique.Name);
		System.out.println("Prenom :" + userunique.Username);
		System.out.println("Mail :" + userunique.Mail);
		System.out.println("-----------------------------------");
	}
	public void UserDemandeValidation() {
		Map<String, User> userToValidate = SimulateBDD.getTmpUsers();
		userToValidate.forEach((userAll, User) -> {
			System.out.println("-----------------------------------");
			System.out.println("Name :" + User.Name);
			System.out.println("Prenom :" + User.Username);
			System.out.println("Mail :" + User.Mail);
			System.out.println("-----------------------------------");
		});
		System.out.println("Voulez vous valider tout vos demande ? ( taper OUI ou NON )");

		String getvalidationrequeste = input.nextLine();
		if (getvalidationrequeste.contentEquals("OUI")) {
			SimulateBDD.AddToUsers(userToValidate);
			System.out.println(
					"Vos nouveaux utilisateurs on été validé, vous pouvez desormais les voirs dans gÃ©rer les utilisateurs :");
		} else {
			System.out.println("Vos demande de validation n'ont pas été validé");
		}
	}
	public void UserPromotion() {
		Map<String, User> userToAfficherPourModifier = SimulateBDD.getusers();
		DisplayUserAll();
		System.out.println("Taper l'identifiant (mail) de l'user que vous voulez modifier :");
		String getmailusermodif = input.nextLine();
		
		User userToModif = userToAfficherPourModifier.remove(getmailusermodif);
		String newRole = GetUserModifInput("Quel est la promotion de cet user ?\n"
				+ "1 > Collaborateur,\n"
				+ "2 > Guest,\n"
				+ "3 > Manager \n"
		         + "4 > Director \n");
		
		
		userToModif = User.ChangeUserRole(userToModif, newRole);
		
		SimulateBDD.addUser(userToModif.GetMail(), userToModif);
		System.out.println("La promotion à bien été pris en compte");
		
	}
	public void UserUpdate() {
		Map<String, User> userToAfficherPourModifier = SimulateBDD.getusers();
		DisplayUserAll();
		System.out.println("Taper l'identifiant (mail) de l'user que vous voulez modifier :");
		String getmailusermodif = input.nextLine();
		System.out.println("Maintenant taper les nouvelles information que vous voulez modifier :");

		String Name = GetUserModifInput("Nom: ");
		String Username = GetUserModifInput("Prenom: ");
		String Mail = GetUserModifInput("Mail: ");
		String Password = GetUserModifInput("Password: ");
		String ConfirmPassword = GetUserModifInput("Confirm-Password: ");
		String Role = GetUserModifInput("Quel est votre role \n"
				+ "1 > Collaborateur,\n"
				+ "2 > Guest,\n"
				+ "3 > Manager \n"
		         + "4 > Director \n");
		
		switch(Role)
		{
			case "1":
				SimulateBDD.getusers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Collaborator(Name, Username, Mail, Password,ConfirmPassword, Role ) );
				break;
				
			case "2":
				SimulateBDD.getusers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Guest(Name, Username, Mail, Password,ConfirmPassword, Role ) );
				break;
			
			case "3":
				SimulateBDD.getusers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Manager(Name, Username, Mail, Password,ConfirmPassword, Role ) );
				break;
			case "4":
				SimulateBDD.getusers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Director(Name, Username, Mail, Password,ConfirmPassword, Role ) );
				
				break;
		}
		System.out.println("Votre utilisateur a bien été modifier");
		
	}
	public void UserRegisterByDirector() {
		User user = User.RegisterUser();
		SimulateBDD.addUser(user.GetMail(), user);
		System.out.println("Vous venez d'enregistrer votre nouveau employer :");
	}
	private static String GetUserModifInput(String InfoToGet) {
		System.out.print(InfoToGet);
		return input.nextLine();
	}
	
	
	@Override
	public void StartWorking() {
		boolean keepWorking = true;
		while (keepWorking) {
			System.out.println("Que voulez faire ?");
			System.out.println("Choix 1 : Gérer les utilisateurs");
			System.out.println("Choix 2 : Gérer les salles");
			System.out.println("Choix 3 : Se déconnecter");
			String getionInterface = input.nextLine();
			
			switch(getionInterface) {
			case "1" :
				UserManagement();
			case "2":
				RoomManagement();
			case "3":
				//Se déconnecter
				keepWorking = false;
				break;
			}
		}

	}
	
	private void UserManagement() {
		boolean gestionUser = true;
		while (gestionUser) {
			System.out.println("Bienvenue dans la Gestions des utilisateurs : Que voulez-vous faire ?");
			System.out.println("Choix 1 : Voir tous les utilisateurs");
			System.out.println("Choix 2 : Créer un nouvel utilisateur");
			System.out.println("Choix 3 : Afficher un utilisateur");
			System.out.println("Choix 4 : Promouvoir un utilisateur");
			System.out.println("Choix 4 : Modifier tout les données d'un utilisateur");
			System.out.println("Choix 6 : Supprimer un utilisateur");
			System.out.println("Choix 7 : Valider les demandes d'inscription.");
			System.out.println("Choix 8 : Se déconnecter du mode gestions des utilidateurs");
			String getuser = input.nextLine();
		
		switch(getuser)
		{
		
		case "1" :
			System.out.println("Voici la liste des utilisateur :");
			DisplayUserAll();
			break;
		case "2" :
			System.out.println("Vous pouvez désormais incricre un nouveau employer :");
			 UserRegisterByDirector();
			break;
		case "3" :
			System.out.println("Ecriver l'identifiant (mail) de l'utilisateur que vous voulez voir  :");
			DisplayUserOne();
			break;
			
		case "4" :
			System.out.println("Voici la liste des utilisateur que vous pouvez promouvoir :");
			UserPromotion();
			break;
			
		case "5" :
			System.out.println("Voici la liste des utilisateur que vous pouvez modifier :");
			UserUpdate();
			break;
		
		case "6" :
			System.out.println("Voici la liste des utilisateur que vous pouvez supprimer :");
			UserDelete();
			break;
			
		case "7" :
			System.out.println("Voici la liste des demandes d'utilisateur :");
			UserDemandeValidation();
			break;
			
		case "8":
			//Se déconnecter
			gestionUser = false;
			break;
		
	
		}};
	}
	
	private void RoomManagement() {
		boolean gestionSalles = true;
		while (gestionSalles) {
			System.out.println("Bienvenue dans la Gestions des Salles : Que voulez-vous faire ?");
			System.out.println("Choix 1 : Voir toutes les salles");
			System.out.println("Choix 2 : Voir les différentes réservations.");
			System.out.println("Choix 3 : Créer une nouvelle salle");
			System.out.println("Choix 4 : Afficher une salle");
			System.out.println("Choix 5 : Modifier une salle");
			System.out.println("Choix 6 : Supprimer un salle");
			System.out.println("Choix 7 : Se déconnecter du mode gestions des salles");
			String getsalle = input.nextLine();
		
		switch(getsalle)
		{
			
		case "1" :
			System.out.println("Voici la liste des salles :");
			DisplayRoomAll();
			break;
			
		case "2" :
			System.out.println("Voici la liste des différentes réservations  :");
			//Code en conséquences
			break;
			
		case "3":
			System.out.println("Vous pouvez désormais incricre une nouvelle salle :");
			Room room = Room.CreateRoom();
			SimulateBDD.addRoom(room.GetRoomName(),room);
			System.out.println("Vous venez d'enregistrer votre nouvelle salle :");
			break;
			
		case "5":
			System.out.println("Voici la liste des salles que vous pouvez modifier  :");
			RoomUpdate();
		
		case "6" :
			System.out.println("Voici la liste des salles que vous pouvez supprimer,  :");
			RoomDelete();
			break;	
		case "7":
			//Se déconnecter
			gestionSalles = false;
			break;
		
		
		}};
	}

	private void RoomDelete() {
		// TODO Auto-generated method stub
		
	}

	private void RoomUpdate() {
		// TODO Auto-generated method stub
		
		
	}

	public static void DisplayRoomAll() {
		// TODO Auto-generated method stub
		Room.RoomAll();
	}

	
}
