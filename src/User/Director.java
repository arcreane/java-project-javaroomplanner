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
			System.out.println("Choix 1 : Gérer les utilisateurs");
			System.out.println("Choix 2 : Valider les demandes d'inscription.");
			System.out.println("Choix 3 : Enregister un nouveau employer.");
			System.out.println("Choix 7 : Supprimer un utilisateur");
			System.out.println("Choix 4 : Gérer les salles");
			System.out.println("Choix 5 : Voir les différents réservations.");
			System.out.println("Choix 6 : Se déconnecter");
			String getuser = input.nextLine();
			switch(getuser)
			{
			case "1" :
				System.out.println("Voici la liste des utilisateur :");
				Map<String, User> userToAfficher = SimulateBDD.Getusers();
				System.out.println( userToAfficher);
				
				
				
				break;
				
			case "7" :
				System.out.println("Voici la liste des utilisateur que vous pouvez supprimer,  :");
				Map<String, User> userToAfficherPourSupprimer = SimulateBDD.Getusers();
				System.out.println( userToAfficherPourSupprimer);
				System.out.println("Taper l'identifiant de l'user que vous voulez supprimer :");
				SimulateBDD.getUsers().remove("aude@gmail.fr");
				break;
			case "2" :
				System.out.println("Voici la liste des demandes d'utilisateur :");
				Map<String, User> userToValidate = SimulateBDD.GetTmpUsers();
				System.out.println( userToValidate);
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
