package day3;

import java.util.Date;

public class Associate {
private int id;
private String name;
private Date joinDate;
public Associate(int id, String name, Date joinDate) {
	super();
	this.id = id;
	this.name = name;
	this.joinDate = joinDate;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Date getJoinDate() {
	return joinDate;
}

public void showData() {
	System.out.println("Id: "+this.id);
	System.out.println("name: "+this.name);
	System.out.println("date: "+this.joinDate);
}
@Override
public String toString() {
	return "Associate id=" + id + "\n name=" + name + "\n joinDate=" + joinDate;
}
}
