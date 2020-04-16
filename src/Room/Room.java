package Room;

import Room.Room;
import java.util.Scanner;
enum ROLE_TYPE
{
	AMPHITHEATER,
	CLASSICALROOM,
	PHONEROOM,
	VISIOROOM
}
public abstract class Room {

	String Material;
	Int Available;
	Int Slot;
	static Scanner input = new Scanner(System.in);
	
	public Room() {

	}

	Room(String Material, Int Available, Int Slot) {
		Material = material;
		Available = available;
		Slot = slot;
	}
	

	static public Room CreateRoom() {
		System.out.println(
				"Pour créer une salle, veuillez nous fournir les informations suivantes :\n Nom, Prenom, Mail , Password");
	
		String Material = GetRoomInput("Materiel: ");
		String Available = GetRoomInput("Nombre de place disponible: ");
		String Slot = GetRoomInput("Nombre de place total: ");

		
		

		String Role = GetRoomInput("Quel est la catégorie de la salle? \n"
				+ "1 > Amphithéâtre,\n"
				+ "2 > Classical Room,\n"
				+ "3 > Phone Room \n"
				+ "4 > Visio Room \n");
		Room room = null;
		switch(Role)
		{
			case "1":
				room = new Amphitheater(Material, Available, Slot);
				break;
				
			case "2":
				room = new ClassicalRoom(Material, Available, Slot);
				break;
			
			case "3":
				room = new PhoneRoom(Material, Available, Slot);
				break;
				
			case "4":
				room = new VisioRoom(Material, Available, Slot);
				break;
		}
		return room;
	}

	private static String GetRoomInput(String InfoToGet) {
		System.out.print(InfoToGet);
		return input.nextLine();
	}

	public void JoinMeeting() {
	}	
	
	public abstract void StartWorking();
	
	public static Room ChangeRoomRole(Room roomToModif, ROLE_TYPE newRole) {
		Room room = null;
		String Material = userToModif.Name;
		String Available = userToModif.Username;
		String Slot = userToModif.Mail;
		switch (newRole)
		{
		case COLLABORATOR:
			user = new Collaborator(name, userName, mail, pass, pass);
			break;
		case DIRECTOR:
			user = new Director(name, userName, mail, pass, pass);
			break;
		case GUEST:
			user = new Guest(name, userName, mail, pass, pass);
			break;
		case MANAGER:
			user = new Manager(name, userName, mail, pass, pass);
			break;
		default:
			break;
		
		}
		return user;
	}
}