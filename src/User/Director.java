package User;


public class Director extends User {
	
	Director(){
		
	}
	Director(String name, String username, String mail, String password, String comfirmpassword) {
		super(name, username, mail, password, comfirmpassword);
		// TODO Auto-generated constructor stub
	}
	public static Director createnewuser() {
		Director newdirector = new Director();
		
       
		newdirector.RegisterUser();
		return newdirector;
	}

	public void EjectRoom() {
	}
	
	public void BookRoom() {
	}
}
