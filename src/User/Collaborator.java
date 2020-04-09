package User;



public class Collaborator extends User {
	
	public Collaborator(String name, String username, String mail, String password,  String comfirmpassword) {
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

	@Override
	public void StartWorking() {
		// TODO Auto-generated method stub
		
	}
}
