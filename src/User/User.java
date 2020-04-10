package User;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class User {

	String Name;
	String Username;
	static String Mail;
	String Password;
	String ConfirmPassword;
	static Scanner input = new Scanner(System.in);
	private static User User;
	
	public User() {

	}

	User(String name, String username, String mail, String password, String confirmpassword) {
		Name = name;
		Username = username;
		Mail = mail;
		Password = password;
		ConfirmPassword = confirmpassword;
	}

	public static String GetMail() {
		return Mail;
	}
	

	public static boolean isValid(String Mail) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (Mail == null) 
            return false; 
        return pat.matcher(Mail).matches(); 
    } 
  
	static public User RegisterUser() {
		char reponserestart = ' ';
		User user = null;
		System.out.println(
				"Pour vous inscrire, veuillez nous fournir les informations suivantes :\n Nom, Prenom, Mail , Password");
		
	do {
		
		
		String Name = GetUserInput("Nom: ");
		String Username = GetUserInput("Prenom: ");
		String mail = GetUserInput("Mail: ");
		String Password = GetUserInput("Password: ");
		String ConfirmPassword = GetUserInput("Confirm-Password: ");
	
		
		String Role = GetUserInput("Quel est votre role \n"
				+ "1 > Collaborateur,\n"
				+ "2 > Guest,\n"
				+ "3 > Manager \n");
		
		
		switch(Role)
		{
			case "1":
				user = new Collaborator(Name, Username, mail, Password, ConfirmPassword);
				break;
				
			case "2":
				user = new Guest(Name, Username, mail, Password, ConfirmPassword);
				break;
			
			case "3":
				user = new Manager(Name, Username, mail, Password, ConfirmPassword);
				break;
		}
		if (!isValid(mail) || !(Password.equals(ConfirmPassword))) 
            System.out.println("Votre email n'est pas valide ou votre mot passe ne correspond pas"); 
        
		
		
	}while(!isValid(GetMail()));
	
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
