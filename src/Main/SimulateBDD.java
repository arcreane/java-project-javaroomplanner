package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import User.Collaborator;
import User.Director;
import User.User;

public class SimulateBDD {

	static Scanner input = new Scanner(System.in);

	//Variable static qui contient tous nos utilisateurs
	static Map<String, User> users = new HashMap<String, User>();
	static Map<String, User> tempusers = new HashMap<String, User>();

	public static void SetUpDatas() {
		// TODO Auto-generated method stub
		CreateUsers();
		CreateRooms();
	}
	
	///	Fonctions (CreateUSers et CreateRooms) servent uniquement de plastron 
	/// pour le moment seront supprimées un fois 
	/// qu'il y aura un BDD fonctionnelle ou un 
	/// enregistrement des données dans un fichier
	static void CreateUsers()
	{
		Director myDirect = new Director("toto", "titi", "mail", "mdp","mdp" );
		//Manager myManager = .myDirect..
		users.put(myDirect.GetMail(), myDirect);
	}
	
	static public void CreateRooms()
	{
		
	}
	

	
	static User Login()
	{
		System.out.println("Quel est votre mail");
		String mail= input.nextLine();
		System.out.println("Quel est votre mot de passe");
		String mdp = input.nextLine();
		User myUser = (User)users.get(mail);
			
		if(myUser != null && myUser.checkPassword(mdp))
		{
			System.out.println("Tout est bon");
		}
		return myUser;
	}
	
	static void SignIn()
	{
		System.out.println("Vous aller pouvoir vous s'incricre");
		User user = User.RegisterUser();
		tempusers.put(user.GetMail(),user);
	}
	
	

	public static void GenerateId() {
		// TODO Auto-generated method stub
		
	}

	public static Map<String, User> GetTmpUsers() {
		return tempusers;
	}


}
