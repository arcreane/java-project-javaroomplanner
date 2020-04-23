package Meeting;

import java.util.List;
import java.util.Map;

import User.Manager;
import User.User;

public class MeetingOptional extends Meeting {
	
	MeetingOptional() {

	}

	public MeetingOptional(String name, String date, String starttime,String timemeeting, Manager organisateur, Map<String, User> participants, String type) {
		super(name, date, starttime,timemeeting, organisateur, participants, type);
		// TODO Auto-generated constructor stub
	}

}
