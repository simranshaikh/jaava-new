package day3;

import java.util.Date;

public class Syrup extends medicine {
	


	String label="twice a day only";
	

	@Override
	public void DisplayLabel()
	{
		
		System.out.println(this.label);
		System.out.println(this.getPrice());
		System.out.println(this.getExpdate());
	}

}
