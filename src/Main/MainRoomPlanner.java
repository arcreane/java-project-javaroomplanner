
package Main;

public class MainRoomPlanner {

	public static void main(String[] args) {
		SimulateBDD.SetUpDatas();
		RoomPlanner.StartPlanning(args[0]);
	}
}

