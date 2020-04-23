package Meeting;

import java.util.Scanner;

import User.User;
import Material.material;

public class Meeting {
//Package des réunions
	
	String Name;
	String Date;
	String StartTime;
	String TimeMeeting;
	String Type;
	//Materiel materiel;
	User Organisateur;
	User Participants;
	//String Partager;
	
	static Scanner input = new Scanner(System.in);
	
	public Meeting() {

	}

	Meeting(String name, String date, String starttime, User organisateur, User participants, String type) {
		Name = name;
	    Date = date;
	    StartTime = starttime;
		Type = type;
		Organisateur = organisateur;
		Participants = participants;
	}

	public String GetMetting() {
		return Name;
	}
}
