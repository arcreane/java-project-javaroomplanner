
package User;


public class Guest extends User {
	Guest(){
		
	}
	Guest(String name, String username, String mail, String password, String comfirmpassword, String role) {
		super(name, username, mail, password, comfirmpassword, role);
		// TODO Auto-generated constructor stub
	}
	public static Guest createnewuser() {
		Guest newguest = new Guest();
		
       
		newguest.RegisterUser();
		return newguest;
	}

	public void EjectRoom() {
	}
	
	public void BookRoom() {
	}
	@Override
	public void StartWorking() {
		// TODO Auto-generated method stub
		
	}
}


