package com.jyothi.sort;

public class GitClassA {
	private int aInt;
	private int[] data = { 2,5,7,8,};
	
	private GitClassB gitb;

	String message_;
	public int sum(){
		// just a dummy function to test
		return 1;
	}
	
	public void displayArray(){
		for(int i: data){
			System.out.println("data is " + i);
		}
	}
	public void display(String message){
		gitb = new GitClassB(message);
		gitb.display();
		
	}
	public static void main(String[] args) {
		System.out.println(" Hello frpom class A");
		GitClassA gita = new GitClassA();
		gita.display("Fred");
		
		System.out.println(" calling dummy function sum " + gita.sum());

		gita.displayArray();
	}

}
