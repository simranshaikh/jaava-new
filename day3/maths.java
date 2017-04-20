package day3;

public class maths {
int add(int n1,int n2){
	return(n1+n2);
	}
float add(int n1,float n2){
	return(n1+n2);
	}
double add(int n1,double n2){
	return(n1+n2);
	}


public static void main(String[] args) {

	maths m=new maths();
	System.out.println(m.add(10,5));	
}
	
}


