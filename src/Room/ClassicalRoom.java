package Room;
import Material.Material;
import Material.MaterialList;
import Material.Screen;
import Material.Sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import Main.SimulateBDD;
import User.Director;

public class ClassicalRoom extends Room {

static Map<MaterialList, Integer> RoomMaterials= new HashMap<>();

	public ClassicalRoom(String name, int slot) {
		
		super(name, slot, RoomMaterials);
		// TODO Auto-generated constructor stub
	}



	
	// Verification de la disponibilité de la Room
	public void hasFreeSlot() {
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