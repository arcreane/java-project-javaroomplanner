package User;


import java.util.Scanner;

public class User {
	String Name;
	String Username;
	String Mail;
	String Password;
	String ConfirmPassword;
	
	public User(){
		
	}
	User(String name, String username, String mail,String password, String confirmpassword){
		Name = name;
		Username = username;
		Mail = mail;
		Password = password;
		ConfirmPassword = confirmpassword;
	}
	public void LoginUser() {
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("UserName: ");
	        String username= input.nextLine();
	        System.out.print("Password: ");
	        String password= input.nextLine();
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	      
	        if (username.equals("test")){
	            if (password.equals("test")){
	                System.out.println("Vous etez connecter :)");
	            }
	            else{
	                System.out.println("Votre tentative de connexion a echouer :(");
	               
	            }
	        }
	}
	public void RegisterUser() {
		 System.out.println("Pour vous enregistrer veuillez ecrire les information suivante : - votre nom, - votre prenom, - votre email , - votre password");
		
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Nom: ");
	     Name= input.nextLine();
	     System.out.print("Prenom: ");
	     Username= input.nextLine();
		 System.out.print("Mail: ");
	     Mail= input.nextLine();
	     System.out.print("Password: ");
	     Password= input.nextLine();
	     System.out.print("Confirm-Password: ");
	     ConfirmPassword= input.nextLine();
	     
	     if(Password.equals(ConfirmPassword)) {
	    	 System.out.println("Vos information d'inscription sont les suivante : - votre nom : "+ Name +", - votre prenom : "+ Username +", - votre email:  "+ Mail +" , - votre password:  "+ Password );
		     System.out.println("Vous etez desormais connecter");
	     }
	     else {
	    	 System.out.println("Erreur, avec vos information, les mots de passe ne correspond pas");
		     System.out.println("Vous n'etez pas encore connecter");
	     }
	    
	     
		 }
		
	
	public void JoinMeeting() {
	}
}

