
package Main;

public class MainRoomPlanner {

	public static void main(String[] args) {
		SimulateBDD.SetUpDatas();
		String temporary = "";
		if(args.length > 0){
			//Commenter ou Décommenter cette ligne pour passer en GUEST
			//Click droit sur le projet "Run as" puis "Run config"  > onglet "Arguments"  dans "Program Argument" écrire un String quelconque et faire "Apply"
			//temporary = args[0];
			
		}
		RoomPlanner.StartPlanning(temporary);
	}
}

