package model;

import java.util.Date;

public class Appointment {
	public int id;
	public Date date;
	public String title;
	public String text;
	
	public Appointment(int id, Date date, String title, String text) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.text = text;
	}
}
