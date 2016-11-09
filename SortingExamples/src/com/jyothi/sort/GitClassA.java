package com.jyothi.sort;

public class GitClassA {
	private int aInt;
	private int[] data = { 2,5,7,8,};
	
	private GitClassB gitb;
	
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
		gita.displayArray();
	}

}
