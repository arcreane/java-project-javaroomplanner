package Meeting;

import java.util.Scanner;

import User.User;


public class Meeting {
//Package des réunions
	
	String Name;
	String Date;
	String StartTime;
	String TimeMeeting;
	String Type;
	
	User Organisateur;
	User Participants;
	//String Partager;
	
	static Scanner input = new Scanner(System.in);
	
	public Meeting() {

	}

	Meeting(String name, String date, String starttime, String timemeeting, User organisateur, User participants, String type) {
		Name = name;
	    Date = date;
	    StartTime = starttime;
	    TimeMeeting = timemeeting;
		Type = type;
		Organisateur = organisateur;
		Participants = participants;
	}

	public String GetMetting() {
		return Name;
	}
}
