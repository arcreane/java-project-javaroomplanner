
package User;


public class Manager extends User {
	Manager(){
		
	}
	public Manager(String name, String username, String mail, String password, String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
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
			System.out.println("Choix 1 : Voir mes réunions");
			System.out.println("Choix 2 : Réservation");
			System.out.println("Choix 4 : Se déconnecter");
			String gestionReunion = input.nextLine();
			switch(gestionReunion) {
			case "1":
				//UserAll();
				break;
				
			case "2" :
				boolean getReservation = true;
				while (getReservation) {
					System.out.println("Bienvenue dans la Gestions des Réservation : Que voulez-vous faire ?");
					System.out.println("Choix 1 : Créer une reservation");
					System.out.println("Choix 2 : Afficher mes réservation");
					System.out.println("Choix 3 : Modifier mes réservation");
					System.out.println("Choix 4 : Supprimer mes utilisateur");
					String getReserve = input.nextLine();
					switch(getReserve)
					{
					case "1":
						System.out.println("Vous pouvez désormais incricre une nouvelle salle :");
						//createReservation();
						break;
					case "2":
						System.out.println("Voici la liste de vos réservations :");
						//myReservation();
						break;
					case "3":
						System.out.println("Voici la liste de vos réservations que vous pouvez modifier,  :");
						//myReservationUpdate();
						break;
					case "4":
						System.out.println("Voici la liste de vos réservations que vous pouvez supprimer  :");
						//myReservationUDelete();
						break;
					}
				};
				
			};
		}
	}
}