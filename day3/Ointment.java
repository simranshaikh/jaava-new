package day3;

import java.util.Date;

public class Ointment extends medicine {
	



String label="for external use only";


	@Override
	public void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println(this.label);
		System.out.println(this.getPrice());
		System.out.println(this.getExpdate());
	}

}
