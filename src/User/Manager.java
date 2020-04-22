
package User;


public class Manager extends User {
	Manager(){
		
	}
	public Manager(String name, String username, String mail, String password, String comfirmpassword, String role) {
		super(name, username, mail, password, comfirmpassword, role);
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
			System.out.println("Choix 3 : Se déconnecter");
			String gestionReunion = input.nextLine();
			switch(gestionReunion) {
			case "1":
				System.out.println("Voici la liste de vos réservations :");
				myReservation();
				break;
				
			case "2" :
				boolean getReservation = true;
				while (getReservation) {
					System.out.println("Bienvenue dans la Gestions des Réservation : Que voulez-vous faire ?");
					System.out.println("Choix 1 : Créer une reservation");
					System.out.println("Choix 2 : Modifier mes réservations");
					System.out.println("Choix 3 : Supprimer mes réservations");
					String getReserve = input.nextLine();
					switch(getReserve)
					{
					case "1":
						System.out.println("Vous pouvez désormais incricre une nouvelle salle :");
						createReservation();
						break;
				
					case "2":
						System.out.println("Voici la liste de vos réservations que vous pouvez modifier,  :");
						myReservationUpdate();
						break;
					case "3":
						System.out.println("Voici la liste de vos réservations que vous pouvez supprimer  :");
						myReservationUDelete();
						break;
					}
				};
			case "3":
				//Se déconnecter
				keepWorking = false;
				break;
			};
		}
	}
	private void myReservation() {
		// TODO Auto-generated method stub
		
	}
	private void createReservation() {
		// TODO Auto-generated method stub
		
	}
	private void myReservationUpdate() {
		// TODO Auto-generated method stub
		
	}
	private void myReservationUDelete() {
		// TODO Auto-generated method stub
		
	}
}