package Meeting;

import User.User;

public class MeetingObligatory extends Meeting{
	MeetingObligatory() {

	}

	public MeetingObligatory(String name, String date, String starttime, String timemeeting, User organisateur, User participants, String type) {
		super(name, date, starttime, timemeeting, organisateur, participants, type);
		// TODO Auto-generated constructor stub
	}
}
