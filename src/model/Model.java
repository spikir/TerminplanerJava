package model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Model extends MySqlCon {

	public Model() {
		this.open_connection();
	}
	
	public void set_termin() {
		
	}
	
	public ArrayList<Appointment> get_termine() {
		ArrayList<Appointment>appointments = new ArrayList<Appointment>();
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM termine");
			while(rs.next()) {
				appointments.add(new Appointment(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4)));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return appointments;
	}
}
