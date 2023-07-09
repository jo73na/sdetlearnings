package javabasics;


class Parent {

	public Parent() {

	}

	public void fun() {
		System.out.println("parent fun");
	}
	


}

public class Inheritancedemo extends Parent {

	public Inheritancedemo() {

	}

	public Inheritancedemo(int i) {
		this();
	}

	 public void fun() {

		System.out.println("sub fun");
	}

	

	public static void main(String[] args) {
		Parent n = new Inheritancedemo(10);// obj sub
		n.fun();

		
		
	}

}
