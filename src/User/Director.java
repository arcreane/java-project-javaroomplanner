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
		Map<String, User> userToAfficher = SimulateBDD.Getusers();
		userToAfficher.forEach((userAll, User)->{
			System.out.println("-----------------------------------");
			System.out.println("Name :" +  User.Name );
			System.out.println("Prenom :" + User.Username );
			System.out.println("Mail :" + User.Mail );
			System.out.println("-----------------------------------");
		});
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
			System.out.println("Choix 2 : Valider les demandes d'inscription.");
			System.out.println("Choix 3 : Enregister un nouveau employer.");
			System.out.println("Choix 7 : Supprimer un utilisateur");
			System.out.println("Choix 8 : Modifier un utilisateur");
			System.out.println("Choix 9 : Voir un utilisateur unique");
			System.out.println("Choix 4 : Gérer les salles");
			System.out.println("Choix 5 : Voir les différents réservations.");
			System.out.println("Choix 6 : Se déconnecter");
			String getuser = input.nextLine();
			switch(getuser)
			{
			case "1" :
				System.out.println("Voici la liste des utilisateur :");
				UserAll();
			
				break;
				
			case "9" :
				System.out.println("Ecriver l'identifiant (mail) de l'utilisateur que vous voulez voir  :");
				String getmailuserunique = input.nextLine();
				Map<String, User> userToAfficherOne = SimulateBDD.Getusers();
				User userunique = userToAfficherOne.get(getmailuserunique);
				System.out.println("-----------------------------------");
				System.out.println("Name :" + userunique.Name );
				System.out.println("Prenom :" + userunique.Username );
				System.out.println("Mail :" + userunique.Mail );
				System.out.println("-----------------------------------");
				
				
				break;
					
			case "7" :
				System.out.println("Voici la liste des utilisateur que vous pouvez supprimer,  :");
				UserAll();
				System.out.println("Taper l'identifiant (mail) de l'user que vous voulez supprimer :");
				String getmailuserremove = input.nextLine();
				SimulateBDD.getUsers().remove(getmailuserremove);
				System.out.println("Votre utilisateur : "+ getmailuserremove + "a bien été supprimer");
				break;
				
			case "8" :
				System.out.println("Voici la liste des utilisateur que vous pouvez modifier,  :");
				Map<String, User> userToAfficherPourModifier = SimulateBDD.Getusers();
				UserAll();
				System.out.println("Taper l'identifiant (mail) de l'user que vous voulez modifier :");
				String getmailusermodif = input.nextLine();
				System.out.println("Maintenant taper les nouvelles information que vous voulez modifier :");
				
				String Name = GetUserModifInput("Nom: ");
				String Username = GetUserModifInput("Prenom: ");
				String Mail = GetUserModifInput("Mail: ");
				String Password = GetUserModifInput("Password: ");
				String ConfirmPassword = GetUserModifInput("Confirm-Password: ");
				
				SimulateBDD.getUsers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Director(Name, Username, Mail, Password,ConfirmPassword ) );
				
				System.out.println("Votre utilisateur a bien été modifier");
				break;
				
			case "2" :
				System.out.println("Voici la liste des demandes d'utilisateur :");
				Map<String, User> userToValidate = SimulateBDD.GetTmpUsers();
				userToValidate.forEach((userAll, User)->{
					System.out.println("-----------------------------------");
					System.out.println("Name :" +  User.Name );
					System.out.println("Prenom :" + User.Username );
					System.out.println("Mail :" + User.Mail );
					System.out.println("-----------------------------------");
				});
				System.out.println("Voulez vous valider tout vos demande ? ( taper OUI ou NON )");
				
				String getvalidationrequeste = input.nextLine();
				if(getvalidationrequeste.contentEquals("OUI")) {
						SimulateBDD.getUsers().putAll(userToValidate);
						System.out.println("Vos nouveaux utilisateurs on été validé, vous pouvez desormais les voirs dans gérer les utilisateurs :");
				}else {
						System.out.println("Vos demande de validation n'ont pas été validé");
				}

				break;
				
			case "3" :
				System.out.println("Vous pouvez désormais incricre un nouveau employer :");
				User user = User.RegisterUser();
				SimulateBDD.getUsers().put(user.GetMail(),user);
				System.out.println("Vous venez d'enregistrer votre nouveau employer :");
				break;
				
			case "6":
				keepWorking = false;
				break;
			}
		}

	}
}
