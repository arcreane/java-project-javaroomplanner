package Meeting;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Main.SimulateBDD;
import User.Manager;
import User.User;


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
	
<<<<<<< HEAD
	public static void MeetingAll() {
=======
	public static void DisplayMeetingAll() {
		
>>>>>>> branch 'master' of https://github.com/arcreane/java-project-javaroomplanner
		Map<String, Meeting> meetingToAfficher = SimulateBDD.getmeeting();
		meetingToAfficher.forEach((MeetingAll, Meeting)->{
			System.out.println("-----------------------------------");
			System.out.println("Name :" +  Meeting.Name );
			System.out.println("Date :" +  Meeting.Date );
			System.out.println("Start Time :" +  Meeting.StartTime );
			System.out.println("Time Meeting :" +  Meeting.TimeMeeting );
			System.out.println("Type :" +  Meeting.Type );
			System.out.println("Organisateurs :" +  Meeting.Organisateur );
			System.out.println("Participants :" +  Meeting.Participants );
			System.out.println("-----------------------------------");
		});
		
	}
}