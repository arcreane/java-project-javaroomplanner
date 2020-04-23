package User;

import java.util.List;
import java.util.Map;
import User.Director;

import Main.SimulateBDD;
import Meeting.Meeting;
import Room.Room;

public class Collaborator extends User {
	
	public Collaborator(String name, String username, String mail, String password,  String comfirmpassword, String role) {
		super(name, username, mail, password, comfirmpassword, role);
		// TODO Auto-generated constructor stub
	}
   
	Collaborator() {
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
			case "1" : 	System.out.println("Voici la liste des salles :");
			DisplayMyRooms();
			case "2" : System.out.println("Acceptez-vous de rejoindre la réunion ?");
			JoinMeeting();
				
				break;
			case "3":
				keepWorking = false;
				break;
			}
		}
		
	}

	
	private void DisplayMyRooms() {
		// TODO Auto-generated method stub
		List<Meeting> listmeeting = SimulateBDD.getmeetings(this);
		
		// Pour évité la duplication des codes, on va créer une méthode static 
		// pour afficher de maniere générique un meeting particulier
		for (Meeting meeting : listmeeting) {
			Meeting.DisplayMeetingOne(meeting);
		}
	}
	
}
