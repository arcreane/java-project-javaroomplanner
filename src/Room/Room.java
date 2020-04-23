package Room;

import Room.Room;

import java.util.Map;
import java.util.Scanner;

import Main.SimulateBDD;

public abstract class Room {

	String Name;
	String Material;
	int Available;
	int Slot;
	static Scanner input = new Scanner(System.in);
	
	public Room() {
		System.out.println("test");
	}

	Room(String name, String material, int available, int slot) { 
		Material = material;
		Available = available;
		Slot = slot;
		Name = name;
	}
	
	public String GetRoomName() {
		return Name;
	}

	static public Room CreateRoom() { 
		System.out.println(
				"Pour créer une salle, veuillez nous fournir les informations suivantes :\n Nom de la salle, le matériele, le nombre de place disponible et le nombre de place total");
	
		String Name = GetRoomInput("Nom de la salle: "); 
		String Material = GetRoomInput("Materiel: ");
		int Available = GetRoomInt("Nombre de place disponible: "); 
		int Slot = GetRoomInt("Nombre de place total: ");

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
				room = new PhoneRoom(Name, Material, Available, Slot);
				break;
				
			case "4":
				room = new VisioRoom(Name ,Material, Available, Slot);
				break;
		}
		return room;
	}

	private static String GetRoomInput(String InfoToGet) {
		System.out.print(InfoToGet);
		return input.nextLine();
	}
	private static int GetRoomInt(String InfoToGet) { // pour permettre d'ecrire un int a l'user et plus un string
		System.out.print(InfoToGet);
		return input.nextInt();
	}
	public static void JoinMeeting() {
		System.out.println("Rejoignez une reunion");
	}	
	
	public abstract void StartWorking();

	public static void RoomAll() { // methode dans room pour appeler toute les room en meme temps ( methode appeler dans la partie director )
		Map<String, Room> roomToAfficher = SimulateBDD.getRooms();
		roomToAfficher.forEach((roomAll, room)->{
			System.out.println("-----------------------------------");
			System.out.println("Name :" +  room.Name );
			System.out.println("Material :" +  room.Material );
			System.out.println("Available :" + room.Available );
			System.out.println("Slot :" + room.Slot );
			System.out.println("-----------------------------------");
		});
		
	}
	
	
}