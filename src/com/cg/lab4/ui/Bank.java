package com.cg.lab4.ui;
public class Bank {
	

	public static void main(String[] args) {
		Account aash=new Account(2000,"Rahi",32);
		Account teja=new Account(3000,"Sai",24);
		aash.deposit(2000);
		teja.withdraw(2000);
		System.out.println("Balance in aaash's account is Rs."+aash.getBalance());
		System.out.println("Balance in teja's account is Rs."+teja.getBalance());
		System.out.println(aash.getAccNum());
		System.out.println(teja.getAccNum());
		

	}

}