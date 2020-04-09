package User;


public class Manager extends User {
	Manager(){
		
	}
	Manager(String name, String username, String mail, String password, String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
	}
	public static Manager createnewuser() {
		Manager newmanager = new Manager();
		
       
		newmanager.RegisterUser();
		return newmanager;
	}

	public void EjectRoom() {
	}
	
	public void BookRoom() {
	}
}
