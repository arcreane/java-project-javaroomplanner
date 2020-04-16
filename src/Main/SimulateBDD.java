package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		Director myDirect = new Director("DAM", "Tony", "tony@gmail.com", "tony","tony" );
		users.put(myDirect.GetMail(), myDirect);
		Manager myManager1 = new Manager("Compoint", "Laure", "laure@compoint.fr", "azertyuiop","azertyuiop" );
		Manager myManager2 = new Manager("Larpenteur", "Coralie", "coralie@larpenteur.fr", "azertyuiop","azertyuiop" );
		Manager myManager3 = new Manager("Coco", "Marie-Ange", "marie-ange@coco.fr", "azertyuiop","azertyuiop" );
		users.put(myManager1.GetMail(), myManager1);
		users.put(myManager2.GetMail(), myManager2);
		users.put(myManager3.GetMail(), myManager3);
		Collaborator myCollaborator1 = new Collaborator("Crevette", "Rouge", "crevette@rouge.fr", "azertyuiop","azertyuiop" );
		Collaborator myCollaborator2 = new Collaborator("Crevette", "Rose", "crevette@rose.fr", "azertyuiop","azertyuiop" );
		/*
		 * Collaborator myCollaborator3 = new Collaborator("Crevette", "Jaune",
		 * "crevette@jaune.fr", "azertyuiop","azertyuiop" ); Collaborator
		 * myCollaborator4 = new Collaborator("Crevette", "Orange",
		 * "crevette@orange.fr", "azertyuiop","azertyuiop" ); Collaborator
		 * myCollaborator5 = new Collaborator("Crevette", "Vert", "crevette@vert.fr",
		 * "azertyuiop","azertyuiop" ); Collaborator myCollaborator6 = new
		 * Collaborator("Crevette", "Bleu", "crevette@bleu.fr",
		 * "azertyuiop","azertyuiop" ); Collaborator myCollaborator7 = new
		 * Collaborator("Crevette", "Violet", "crevette@violet.fr",
		 * "azertyuiop","azertyuiop" ); Collaborator myCollaborator8 = new
		 * Collaborator("Crevette", "Marron", "crevette@marron.fr",
		 * "azertyuiop","azertyuiop" ); Collaborator myCollaborator9 = new
		 * Collaborator("Crevette", "Noire", "crevette@noire.fr",
		 * "azertyuiop","azertyuiop" );
		 */
		users.put(myCollaborator1.GetMail(), myCollaborator1);
		users.put(myCollaborator2.GetMail(), myCollaborator2);
		/*
		 * users.put(myCollaborator3.GetMail(), myCollaborator3);
		 * users.put(myCollaborator4.GetMail(), myCollaborator4);
		 * users.put(myCollaborator5.GetMail(), myCollaborator5);
		 * users.put(myCollaborator6.GetMail(), myCollaborator6);
		 * users.put(myCollaborator7.GetMail(), myCollaborator7);
		 * users.put(myCollaborator8.GetMail(), myCollaborator8);
		 * users.put(myCollaborator9.GetMail(), myCollaborator9);
		 */
	}
	
	static public void CreateRooms()
	{
		
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


}
