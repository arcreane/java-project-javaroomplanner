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

	//Variable static qui contient tous nos utilisateurs
	static Map<String, User> users = new HashMap<String, User>();
	static Map<String, User> tempusers = new HashMap<String, User>();

	public static void SetUpDatas() {
		// TODO Auto-generated method stub
		CreateUsers();
		CreateRooms();
	}
	
	///	Fonctions (CreateUSers et CreateRooms) servent uniquement de plastron 
	/// pour le moment seront supprim�es un fois 
	/// qu'il y aura un BDD fonctionnelle ou un 
	/// enregistrement des donn�es dans un fichier
	static void CreateUsers()
	{
		Director myDirect = new Director("DAM", "Tony", "tony@dam.fr", "azertyuiop","azertyuiop" );
		users.put(myDirect.GetMail(), myDirect);
		Manager myManager1 = new Manager("Compoint", "Laure", "laure@compoint.fr", "azertyuiop","azertyuiop" );
		Manager myManager2 = new Manager("Larpenteur", "Coralie", "coralie@larpenteur.fr", "azertyuiop","azertyuiop" );
		Manager myManager3 = new Manager("Coco", "Marie-Ange", "marie-ange@coco.fr", "azertyuiop","azertyuiop" );
		users.put(myManager1.GetMail(), myManager1);
		users.put(myManager2.GetMail(), myManager2);
		users.put(myManager3.GetMail(), myManager3);
		
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
		User myUser = (User)users.get(mail);
			
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
