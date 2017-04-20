package day3;

public class trainer extends person {
	private int num_of_skills;
	private int expinyears;
	public trainer(String fname, String lname, String address,int num_of_skills,int expinyears) {
		super(fname, lname, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showdetails() {
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.num_of_skills);
		System.out.println(this.expinyears);
	}
public void trainerkamethod(){
	
}
}
