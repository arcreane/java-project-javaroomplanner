package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Meeting.Meeting;
import Meeting.MeetingObligatory;
import Room.PhoneRoom;
import Room.Room;
import Room.VisioRoom;
import User.Collaborator;
import User.Director;
import User.Manager;
import User.User;

public class SimulateBDD {

	static Scanner input = new Scanner(System.in);
	static String codeInvtTest = "CodeInvitation1";
	//Variable static qui contient tous nos utilisateurs
	private static Map<String, User> users = new HashMap<String, User>();
	public static Map<String, User> tempusers = new HashMap<String, User>();
	
	//Variable static qui contient tous nos utilisateurs
	private static Map<String,Room> rooms = new HashMap<String, Room>();
	
	//Variable static qui contient tous nos réunions
	private static Map<String,Meeting> meetings = new HashMap<String, Meeting>();
	
	public static void SetUpDatas() {
		// TODO Auto-generated method stub
		CreateUsers();
		CreateRooms();
	}
	
	///	Fonctions (CreateUSers et CreateRooms) servent uniquement de plastron 
	/// pour le moment seront supprim�es un fois 
	/// qu'il y aura un BDD fonctionnelle ou un 
	/// enregistrement des donn�es dans un fichier
	public static void CreateUsers()
	{
		Director myDirect = new Director("DAM", "Tony", "tony@dam.fr", "dam","dam", "Directeur" );
		users.put(myDirect.GetMail(), myDirect);
		Manager myManager1 = new Manager("Compoint", "Laure", "laure@compoint.fr", "azertyuiop","azertyuiop", "manager" );
		Manager myManager2 = new Manager("Larpenteur", "Coralie", "coralie@larpenteur.fr", "azertyuiop","azertyuiop", "manager"  );
		Manager myManager3 = new Manager("Coco", "Marie-Ange", "marie-ange@coco.fr", "azertyuiop","azertyuiop", "manager"  );
		users.put(myManager1.GetMail(), myManager1);
		users.put(myManager2.GetMail(), myManager2);
		users.put(myManager3.GetMail(), myManager3);
		Collaborator myCollaborator1 = new Collaborator("Crevette", "Rouge", "crevette@rouge.fr", "azertyuiop","azertyuiop" , "collabortor");
		Collaborator myCollaborator2 = new Collaborator("Crevette", "Rose", "crevette@rose.fr", "azertyuiop","azertyuiop", "collabortor" );
		users.put(myCollaborator1.GetMail(), myCollaborator1);
		users.put(myCollaborator2.GetMail(), myCollaborator2);

	}
	
	static public void CreateRooms()
	{
		Room myRoom1 = new VisioRoom("Visio Room", 15 );
		rooms.put(myRoom1.GetRoomName(), myRoom1);
	}
	
	public static void CreateMeeting() {
		//String name, String date, String starttime, String timemeeting, User organisateur, User participants, String type
		Meeting AG = new MeetingObligatory("Assemblée Générale Avril 2020", "24/04/2020", "15:30", "02:00", (Manager)users.get("tony@dam.fr") , users , "Obligatoire" );
		meetings.put(AG.GetMeetingName(), AG);
	}
	
	static User Login()
	{
		System.out.println("Quel est votre mail ?");
		String mail= input.nextLine();
		System.out.println("Quel est votre mot de passe ?");
		String mdp = input.nextLine();
		User myUser = users.get(mail);
			
		if(myUser != null && myUser.checkPassword(mdp))
		{
			System.out.println("Tout est bon");
		}
		else {
			System.out.println("Ou vous vous êtes trompé dans votre mail et/ou mot de passe ou votre compte n'existe pas");
			SignIn();
		}
		return myUser;
	}
	
	static void SignIn()
	{
		System.out.println("** INSCRIPTION **");
		User user = User.RegisterUser();
		tempusers.put(user.GetMail(),user);
	}
	
	

	public static void GenerateId() {
		// TODO Auto-generated method stub
		
	}

	public static Map<String, User> getTmpUsers() {
		return tempusers;
	}
	
	public static void getUsers(Map<String, User> users) {
		SimulateBDD.users = users;			//SimulateBDD.users.replaceAll(function); = users;
	}		
	public static Map<String, User> getusers() {
		final Map<String, User> tmp = new HashMap<String, User>(users);
		return tmp;
	}	
	public static void AddToUsers(Map<String, User> userToValidate) {
		users.putAll(userToValidate);
		
	}

	public static void addUser(String getMail, User user) {
		users.put(getMail, user);
		
	}

	public static void removeUser(String getmailuserremove) {
		users.remove(getmailuserremove);
		
	}

	
	public static Map<String, Room> getRooms() {
		// TODO Auto-generated method stub
		final Map<String, Room> room = new HashMap<String, Room>(rooms);
		return room;
	
	}
	public static void addRoom(String getRoom, Room room) {
		rooms.put(getRoom, room);
		
	}

	public static Map<String, Meeting> getmeeting() {
		// TODO Auto-generated method stub
		final Map<String, Meeting> meeting = new HashMap<String, Meeting>(meetings);
		return meeting;
	}


}
