package day3;

import java.util.Date;

public class ELITian extends Associate {
	private int groupId;
	private String mappedIBU;
	public ELITian(int id, String name, Date joinDate,int gId,String IBU) 
	{
		super(id, name, joinDate);
		this.groupId=gId;
		this.mappedIBU=IBU;
	}
	@Override
	public String toString() {
		return super.toString()+" " +"group id is  " +groupId + ", mappedIBU=" + mappedIBU + "]";
	}
	

}
