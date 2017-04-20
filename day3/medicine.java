package day3;

import java.util.Date;

public abstract class medicine {
	int price;
	Date expdate;



	public void setPrice(int price) {
		this.price = price;
	}


	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}


	public int getPrice() {
		return price;
	}


	public Date getExpdate() {
		return expdate;
	}


	public abstract void DisplayLabel();
	
}
