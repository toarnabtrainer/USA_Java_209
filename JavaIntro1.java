package com.demo.intro;

public class JavaIntro1 {
	static {
		System.out.println("This is the static block-1 executing...");
	}
	static {
		System.out.println("This is the static block-2 executing...");
	}
	{
		System.out.println("Initilizer block-1 is executing, it executes when an object will be defined...");
	}
	public JavaIntro1() {
		System.out.println("Default constructor method is executing...");
	}
	
	public void myFunction() {
		System.out.println("myFunction() is executing...");
	}
	
	public static void main(String[] args) {
		JavaIntro1 ob1 = new JavaIntro1();   // crreating the first object under the class
		JavaIntro1 ob2 = new JavaIntro1();   // crreating the second object under the class
		
		ob1.myFunction();
		ob1.myFunction();
		
		System.out.println("\nEnd of the program...");
	}
	static {
		System.out.println("This is the static block-3 executing...");
	}
	static {
		System.out.println("This is the static block-4 executing...");
	}
	{
		System.out.println("Initilizer block-2 is executing, it executes when an object will be defined...");
	}
}
