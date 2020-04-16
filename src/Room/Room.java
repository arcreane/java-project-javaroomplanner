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
	int Available;
	int Slot;
	static Scanner input = new Scanner(System.in);
	
	public Room() {

	}

	Room(String Material, int Available, int Slot) {
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
		test
	}	
	
	public abstract void StartWorking();
	
	public static Room ChangeRoomRole(Room roomToModif, ROLE_TYPE newRole) {
		Room room = null;
		String Material = roomToModif.Material;
		String Available = roomToModif.Available;
		String Slot = roomToModif.Slot;
		switch (newRole)
		{
		case AMPHITHEATER:
			room = new Amphitheater(Material, Available, Slot);
			break;
		case CLASSICALROOM:
			room = new ClassicalRoom(Material, Available, Slot);
			break;
		case PHONEROOM:
			room = new PhoneRoom(Material, Available, Slot);
			break;
		case VISIOROOM:
			room = new VisioRoom(Material, Available, Slot);
			break;
		default:
			break;
		
		}
		return room;
	}
}