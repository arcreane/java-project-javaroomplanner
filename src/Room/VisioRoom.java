package Room;

import java.util.Map;

import Main.SimulateBDD;
import User.User;

public class VisioRoom extends Room {

	VisioRoom() {
	public VisioRoom(String Name, String Materiel, String Available, String Slot) {
		super(Name, Materiel, Available, Slot);
	}
	

	public static Room createnewroom() {
		Room newRoom;

		return null;
	}

	public void RoomAll() {

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
	