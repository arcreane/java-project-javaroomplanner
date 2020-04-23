package Meeting;
import java.util.List;
import java.util.Map;

import User.Manager;
import User.User;

public class MeetingObligatory extends Meeting{
	MeetingObligatory() {

	}

	public MeetingObligatory(String name, String date, String starttime, String timemeeting, Manager organisateur, Map<String, User> participants, String type) {
		super(name, date, starttime, timemeeting, organisateur, participants, type);
		// TODO Auto-generated constructor stub
	}
}
