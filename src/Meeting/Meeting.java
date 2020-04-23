package Meeting;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import User.Manager;
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
	Manager Organisateur;
	Map<String, User> Participants;
	//String Partager;
	
	static Scanner input = new Scanner(System.in);
	
	public Meeting() {

	}

	Meeting(String name, String date, String starttime,String timemeeting, Manager organisateur, Map<String, User> participants, String type) {
		Name = name;
	    Date = date;
	    StartTime = starttime;
	    TimeMeeting = timemeeting;
		Type = type;
		Organisateur = organisateur;
		Participants = participants;
	}

	public String GetMeetingName() {
		return Name;
	}
}
