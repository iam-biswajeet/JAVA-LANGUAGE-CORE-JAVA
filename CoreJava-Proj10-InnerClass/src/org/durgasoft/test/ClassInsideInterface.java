package org.durgasoft.test;

import java.util.Date;

public interface ClassInsideInterface {
	public void sendEmail(EmailDetail detail);
	class EmailDetail{
		String sender;
		String reciver;
		String message;
		Date time;
		
	}
}
