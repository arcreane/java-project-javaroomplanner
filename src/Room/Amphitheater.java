package Room;

import java.util.Map;

import Main.SimulateBDD;

public class Amphitheater extends Room {

	Amphitheater() {

	}

	public Amphitheater(String material, Int available, Int slot) {
		super(material, available, slot);
		// TODO Auto-generated constructor stub
	}

	public static Room createnewroom() {
		Room newRoom;

		return null;
	}

	public void RoomAll() {
		Map<String, Room> roomToAfficher = SimulateBDD.getrooms();
		roomToAfficher.forEach((roomAll, room)->{
			System.out.println("-----------------------------------");
			System.out.println("Material :" +  room.Material );
			System.out.println("Available :" + room.Available );
			System.out.println("Slot :" + room.Slot );
			System.out.println("-----------------------------------");
		});
	}
}