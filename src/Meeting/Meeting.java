package Meeting;

import java.util.Scanner;

import User.User;

public class Meeting {
//Package des réunions
	
	String Name;
	String Date;
	String StartTime;
	String TimeMeeting;
	User user; 
	String Type;
	static Scanner input = new Scanner(System.in);
	
	public Meeting() {

	}

	Meeting(String name, String date, String starttime, User user, String type) {
		Name = name;
	    Date = date;
	    StartTime = starttime;
		Type = type;
	}

	public String GetMetting() {
		return Name;
	}
}
