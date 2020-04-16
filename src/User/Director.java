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

	public void UserAll() {
		Map<String, User> userToAfficher = SimulateBDD.getusers();
		userToAfficher.forEach((userAll, User) -> {
			System.out.println("-----------------------------------");
			System.out.println("Name :" + User.Name);
			System.out.println("Prenom :" + User.Username);
			System.out.println("Mail :" + User.Mail);
			System.out.println("-----------------------------------");
		});
	}

	public void UserDelete() {

		UserAll();
		System.out.println("Taper l'identifiant (mail) de l'user que vous voulez supprimer :");
		String getmailuserremove = input.nextLine();
		SimulateBDD.removeUser(getmailuserremove);
		System.out.println("Votre utilisateur : " + getmailuserremove + "a bien Ã©tÃ© supprimer");

	}

	public void UserOne() {

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

	public void UserUpdate() {
		Map<String, User> userToAfficherPourModifier = SimulateBDD.getusers();
		UserAll();
		System.out.println("Taper l'identifiant (mail) de l'user que vous voulez modifier :");
		String getmailusermodif = input.nextLine();
		System.out.println("Maintenant taper les nouvelles information que vous voulez modifier :");

		User userToModif = userToAfficherPourModifier.remove(getmailusermodif);

		// Récupérer de la part de l'utilisateur le nouveau role à donner
		int newRole = 0; // 0 pour manager, 1 pour collaborateur, 2 pour directeur, 3 pour guest
		userToModif = User.ChangeUserRole(userToModif, ROLE_TYPE.values()[newRole]);
		/*
		 * String Name = GetUserModifInput("Nom: "); String Username =
		 * GetUserModifInput("Prenom: "); String Mail = GetUserModifInput("Mail: ");
		 * String Password = GetUserModifInput("Password: "); String ConfirmPassword =
		 * GetUserModifInput("Confirm-Password: ");
		 */
		SimulateBDD.addUser(userToModif.GetMail(), userToModif);

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
			System.out.println("Que voulez faire");
			System.out.println("Choix 1 : Gérer les utilisateurs");
			System.out.println("Choix 2 : Gérer les salles");
			System.out.println("Choix 3 : Se déconnecter");
			String getionInterface = input.nextLine();
			switch (getionInterface) {
			case "1":
				ManageUsers();
				break;
			case "2":
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

					switch (getsalle) {

					case "1":
						System.out.println("Voici la liste des salles :");
						// UserAll();
						break;

					case "2":
						System.out.println("Voici la liste des différentes réservations  :");
						// Code en conséquences
						break;

					case "3":
						System.out.println("Vous pouvez désormais incricre une nouvelle salle :");
						// User user = User.RegisterUser();
						// SimulateBDD.getUsers().put(user.GetMail(),user);
						System.out.println("Vous venez d'enregistrer votre nouvelle salle :");
						break;

					case "5":
						System.out.println("Voici la liste des salles que vous pouvez modifier  :");

					case "6":
						System.out.println("Voici la liste des salles que vous pouvez supprimer,  :");
						// UserAll();
						System.out.println("Taper le nom de la salle que vous voulez supprimer :");
						// String getmailuserremove = input.nextLine();
						// SimulateBDD.getUsers().remove(getmailuserremove);
						System.out.println("Votre salle : " + /* getmailuserremove + */ "a bien été supprimer");
						break;
					case "7":
						// Se déconnecter
						gestionSalles = false;
						break;

					}
				}
				;

			case "3":
				// Se déconnecter
				keepWorking = false;
				break;
			}
		}

	}

	private void ManageUsers() {
		boolean gestionUser = true;
		while (gestionUser) {
			System.out.println("Bienvenue dans la Gestions des utilisateurs : Que voulez-vous faire ?");
			System.out.println("Choix 1 : Voir tous les utilisateurs");
			System.out.println("Choix 2 : Créer un nouvel utilisateur");
			System.out.println("Choix 3 : Afficher un utilisateur");
			System.out.println("Choix 4 : Modifier un utilisateur");
			System.out.println("Choix 5 : Supprimer un utilisateur");
			System.out.println("Choix 6 : Valider les demandes d'inscription.");
			System.out.println("Choix 7 : Se déconnecter du mode gestions des utilidateurs");
			String getuser = input.nextLine();

			switch (getuser) {

			case "1":
				System.out.println("Voici la liste des utilisateur :");
				UserAll();
				break;
			case "2":
				System.out.println("Vous pouvez désormais incricre un nouveau employer :");
				UserRegisterByDirector();
				break;
			case "3":
				System.out.println("Ecriver l'identifiant (mail) de l'utilisateur que vous voulez voir  :");
				UserOne();
				break;

			case "4":
				System.out.println("Voici la liste des utilisateur que vous pouvez modifier,  :");
				UserUpdate();
				break;

			case "5":
				System.out.println("Voici la liste des utilisateur que vous pouvez supprimer,  :");
				UserDelete();
				break;

			case "6":
				System.out.println("Voici la liste des demandes d'utilisateur :");
				UserDemandeValidation();
				break;

			case "7":
				// Se déconnecter
				gestionUser = false;
				break;

			}
		}
		;
	}
}
