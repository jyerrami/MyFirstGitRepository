package com.jyothi.sort;

public class GitClassA {
	private int aInt;
	private GitClassB gitb;
	
	public void display(String message){
		
		gitb = new GitClassB(message);
		gitb.display();
	}
	public static void main(String[] args) {
		System.out.println(" Hello frpom class A");
		GitClassA gita = new GitClassA();
		gita.display("Fred");
	}

}
