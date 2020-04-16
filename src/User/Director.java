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
			System.out.println("Choix 2 : Gérer les salles");
			System.out.println("Choix 3 : Se déconnecter");
			String getionInterface = input.nextLine();
			switch(getionInterface) {
			case "1" :
				boolean gestionUser = true;
				while (gestionUser) {
					System.out.println("Bienvenue dans la Gestions des utilisateurs : Que voulez-vous faire ?");
					System.out.println("Choix 1 : Voir tous les utilisateurs");
					System.out.println("Choix 2 : Créer un nouvel utilisateur");
					System.out.println("Choix 3 : Afficher un utilisateur");
					System.out.println("Choix 4 : Modifier un utilisateur");
					System.out.println("Choix 5 : Supprimer un utilisateur");
					System.out.println("Choix 6 : Valider les demandes d'inscription.");
					String getuser = input.nextLine();
				
				switch(getuser)
				{
				
				case "1" :
					System.out.println("Voici la liste des utilisateur :");
					UserAll();
					break;
				case "2" :
					System.out.println("Vous pouvez désormais incricre un nouveau employer :");
					User user = User.RegisterUser();
					SimulateBDD.getUsers().put(user.GetMail(),user);
					System.out.println("Vous venez d'enregistrer votre nouveau employer :");
					break;
					
				case "3" :
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
					
				case "4" :
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
					
					
					String Role = GetUserModifInput("Quel est votre role \n"
							+ "1 > Collaborateur,\n"
							+ "2 > Guest,\n"
							+ "3 > Manager \n"
					         + "4 > Director \n");
					
					switch(Role)
					{
						case "1":
							SimulateBDD.getUsers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Collaborator(Name, Username, Mail, Password,ConfirmPassword ) );
							break;
							
						case "2":
							SimulateBDD.getUsers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Guest(Name, Username, Mail, Password,ConfirmPassword ) );
							break;
						
						case "3":
							SimulateBDD.getUsers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Manager(Name, Username, Mail, Password,ConfirmPassword ) );
							break;
						case "4":
							SimulateBDD.getUsers().replace( getmailusermodif, userToAfficherPourModifier.get(getmailusermodif), new Director(Name, Username, Mail, Password,ConfirmPassword ) );
							
							break;
					}
					
					
					
					
					System.out.println("Votre utilisateur a bien été modifier");
					break;
				
				case "5" :
					System.out.println("Voici la liste des utilisateur que vous pouvez supprimer,  :");
					UserAll();
					System.out.println("Taper l'identifiant (mail) de l'user que vous voulez supprimer :");
					String getmailuserremove = input.nextLine();
					SimulateBDD.getUsers().remove(getmailuserremove);
					System.out.println("Votre utilisateur : "+ getmailuserremove + "a bien été supprimer");
					break;	
					
				case "6" :
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
				
				}};
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
					String getsalle = input.nextLine();
				
				switch(getsalle)
				{
					
				case "1" :
					System.out.println("Voici la liste des salles :");
					//UserAll();
					break;
					
				case "2" :
					System.out.println("Voici la liste des différentes réservations  :");
					//Code en conséquences
					break;
					
				case "3":
					System.out.println("Vous pouvez désormais incricre une nouvelle salle :");
					//User user = User.RegisterUser();
					//SimulateBDD.getUsers().put(user.GetMail(),user);
					System.out.println("Vous venez d'enregistrer votre nouvelle salle :");
					break;
					
				case "5":
					System.out.println("Voici la liste des salles que vous pouvez modifier  :");
				
				case "6" :
					System.out.println("Voici la liste des salles que vous pouvez supprimer,  :");
					//UserAll();
					System.out.println("Taper le nom de la salle que vous voulez supprimer :");
					//String getmailuserremove = input.nextLine();
					//SimulateBDD.getUsers().remove(getmailuserremove);
					System.out.println("Votre salle : "+ /*getmailuserremove +*/ "a bien été supprimer");
					break;	
				
				}};

			case "3":
				//Se déconnecter
				keepWorking = false;
				break;
			}
		}

	}
}
