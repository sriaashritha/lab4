package com.cg.lab4.ui;

class Account{
	
	private static int count=0;
	
	protected long accNum=1000000000;
	{
		count++;
		accNum+=count;
	}
	public Account() {
		
	}
	protected double balance;
	protected Person accHolder=new Person(null, accNum);
	
	public Account(double initialBalance, String name, int age) {
		this.balance=initialBalance;
		this.accHolder.setName(name);
		this.accHolder.setAge(age);
		
	}
	
	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		
		return balance;
	}
	
	public void deposit(double cash) {
		if(balance+cash<500) {
			System.out.println("Your Account balance is less than Rs.500. Please add minimum Rs."+(500-this.balance));
			
		}
		else {
			
			this.balance+=cash;
			System.out.println("Rs."+cash+" has been succesfully credited into your account.");
			
		}
	}
	
	public boolean withdraw(double withdraw) {
		if(this.balance-withdraw<500) {
			System.out.println("Please keep minimum balance of 500 rupees in your account.");
			System.out.println("You can withdraw maximum amount of Rs."+(500-balance));
			return false;
		}
		else {
			balance-=withdraw;
			System.out.println("Rs."+withdraw+" from your account succesfully");
			return true;
			
		}
	}
}