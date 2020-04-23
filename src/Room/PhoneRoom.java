package Room;

import java.util.Map;

import Main.SimulateBDD;

public class PhoneRoom extends Room {

	PhoneRoom() {

	}

	public PhoneRoom(String name, int slot) {
		super(name, slot);
		// TODO Auto-generated constructor stub
	}
	
	
	// Verification de la disponibilité de la Room
	public void slot() {
		boolean freeSlot = true;
		while (freeSlot) {
			System.out.print("Places disponibles dans la salle :");
			String getslot = input.nextLine();
			switch(getslot)
			{
			case "1" : 	freeSlot = false;
				break;
			case "2" : System.out.println("Bienvenue dans la salle");
			Room.JoinRoom();
				
				break;
			}
		}
		
	}

}