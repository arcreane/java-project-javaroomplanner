package User;

import java.util.Scanner;

import Main.MainRoomPlanner;

public abstract class User {

	String Name;
	String Username;
	String Mail;
	String Password;
	String ConfirmPassword;
	static Scanner input = new Scanner(System.in);
	
	public User() {

	}

	User(String name, String username, String mail, String password, String confirmpassword) {
		Name = name;
		Username = username;
		Mail = mail;
		Password = password;
		ConfirmPassword = confirmpassword;
	}

	public String GetMail() {
		return Mail;
	}

	public void LoginUser() {

		System.out.print("UserName: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		if (username.equals("test")) {
			if (password.equals("test")) {
				System.out.println("Vous etez connecter :)");
			} else {
				System.out.println("Votre tentative de connexion a echouer :(");

			}
		}
	}

	static public User RegisterUser() {
		System.out.println(
				"Pour vous enregistrer veuillez ecrire les information suivante : - votre nom, - votre prenom, - votre email , - votre password");
	
		String Name = GetUserInput("Nom: ");
		String Username = GetUserInput("Prenom: ");
		String Mail = GetUserInput("Mail: ");
		String Password = GetUserInput("Password: ");
		String ConfirmPassword = GetUserInput("Confirm-Password: ");
//
//		if (Password.equals(ConfirmPassword)) {
//			System.out.println(
//					"Vos information d'inscription sont les suivante : - votre nom : " + Name + ", - votre prenom : "
//							+ Username + ", - votre email:  " + Mail + " , - votre password:  " + Password);
//			System.out.println("Vous etez desormais connecter");
//		} else {
//			System.out.println("Erreur, avec vos information, les mots de passe ne correspond pas");
//			System.out.println("Vous n'etez pas encore connecter");
//		}

		String Role = GetUserInput("Quel est votre role \\n"
				+ "1 Collaborateur,\n"
				+ "2 Guest,\n"
				+ "3 pour Manager");
		User user = null;
		switch(Role)
		{
		case "1":
			user = new Collaborator(Name, Username, Mail, Password, ConfirmPassword);
			break;
		}
		return user;
	}

	private static String GetUserInput(String InfoToGet) {
		System.out.print(InfoToGet);
		return input.nextLine();
	}

	public void JoinMeeting() {
	}

	public boolean checkPassword(String mdp) {
		// 
		return Password.equals(mdp);
	}
	
	public abstract void StartWorking();
}
