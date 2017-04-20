package day3;

public abstract class person {
	
	String fname;
	String lname;
	String address;
	public person(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "person [fname=" + fname + ", lname=" + lname + ", address="
				+ address + "]";
	}
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getAddress() {
		return address;
	}
	public abstract void showdetails();

}
