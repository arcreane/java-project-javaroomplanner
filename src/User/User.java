package User;

import java.util.Scanner;
enum ROLE_TYPE
{
	DIRECTOR,
	MANAGER,
	COLLABORATOR,
	GUEST
}
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

	

	static public User RegisterUser() {
		System.out.println(
				"Pour vous inscrire, veuillez nous fournir les informations suivantes :\n Nom, Prenom, Mail , Password");
	
		String Name = GetUserInput("Nom: ");
		String Username = GetUserInput("Prenom: ");
		String Mail = GetUserInput("Mail: ");
		String Password = GetUserInput("Password: ");
		String ConfirmPassword = GetUserInput("Confirm-Password: ");

		
		

		String Role = GetUserInput("Quel est votre role \n"
				+ "1 > Collaborateur,\n"
				+ "2 > Guest,\n"
				+ "3 > Manager \n");
		User user = null;
		switch(Role)
		{
			case "1":
				user = new Collaborator(Name, Username, Mail, Password, ConfirmPassword);
				break;
				
			case "2":
				user = new Guest(Name, Username, Mail, Password, ConfirmPassword);
				break;
			
			case "3":
				user = new Manager(Name, Username, Mail, Password, ConfirmPassword);
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

	public static User ChangeUserRole(User userToModif, ROLE_TYPE newRole) {
		User user = null;
		String name = userToModif.Name;
		String userName = userToModif.Username;
		String mail = userToModif.Mail;
		String pass = userToModif.Password;
		switch (newRole)
		{
		case COLLABORATOR:
			user = new Collaborator(name, userName, mail, pass, pass);
			break;
		case DIRECTOR:
			user = new Director(name, userName, mail, pass, pass);
			break;
		case GUEST:
			user = new Guest(name, userName, mail, pass, pass);
			break;
		case MANAGER:
			user = new Manager(name, userName, mail, pass, pass);
			break;
		default:
			break;
		
		}
		return user;
	}
}