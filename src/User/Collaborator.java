package User;



public class Collaborator extends User {
	
	Collaborator(String name, String username, String mail, String password,  String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
	}
   
	Collaborator() {
	}

	public static Collaborator createnewusercollaborateur() {
		Collaborator newcollaborator = new Collaborator();
		
       
		newcollaborator.RegisterUser();
		return newcollaborator;
	}
}
