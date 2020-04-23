package Meeting;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Main.SimulateBDD;
import Room.Amphitheater;
import Room.ClassicalRoom;
import Room.PhoneRoom;
import Room.Room;
import Room.VisioRoom;
import User.Manager;
import User.User;
// import jdk.internal.util.xml.impl.Pair;


public class Meeting {
//Package des réunions
	
	String Name;
	String Date;
	String StartTime;
	String TimeMeeting;
	String Type;
	Manager Organisateur;
	Map<String, User> Participants;
	//String Partager;
	
	static Scanner input = new Scanner(System.in);
	
	public Meeting() {
		// Pair<String, String> p;
	}
	
	public Map<String, User> getParticipants() {
		return Participants;
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
	private static String GetMeetingInput(String InfoToGet) {
		System.out.print(InfoToGet);
		return input.nextLine();
	}
	
	public static void MeetingAll() {
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
	
	public static void DisplayMeetingOne(Meeting meetingunique) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		System.out.println("Name :" +  meetingunique.Name );
		System.out.println("Date :" +  meetingunique.Date );
		System.out.println("Start Time :" +  meetingunique.StartTime );
		System.out.println("Time Meeting :" +  meetingunique.TimeMeeting );
		System.out.println("Type :" +  meetingunique.Type );
		System.out.println("Organisateurs :" +  meetingunique.Organisateur );
		System.out.println("Participants :" +  meetingunique.Participants );
		System.out.println("-----------------------------------");
	}
	
	static public Meeting CreateMeeting(Manager organisateur, Map<String, User> participants) { 
		System.out.println(
				"Pour créer une reunion, veuillez nous fournir les informations suivantes :\n Nom de la reunion, la date , l'heure de la reunion et le temps de la duréé de la réunion, l'organisateur, et les partipants");
	
		String Name = GetMeetingInput("Nom de la reunion: "); 
		String Date = GetMeetingInput("Date de la reunion: ");
		String StartTime = GetMeetingInput("Heure du début de la réunion: "); 
		String TimeMeeting = GetMeetingInput("Durée de la réunion : ");
		

		String Type = GetMeetingInput("Quel est le type de la réunion? \n"
				+ "1 > Optionel,\n"
				+ "2 > Obligatoire .\n");
				
		Meeting meeting = null; 
		switch(Type)
		{
			case "1":
				meeting = new MeetingObligatory(Name,Date, StartTime, TimeMeeting, organisateur, participants, Type);
				break;
				
			case "2":
				meeting = new MeetingOptional(Name,Date, StartTime, TimeMeeting, organisateur, participants, Type);
				break;
			
		
		}
		return meeting;
	}

}