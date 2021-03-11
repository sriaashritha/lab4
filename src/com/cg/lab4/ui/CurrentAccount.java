package com.cg.lab4.ui;

class CurrentAccount extends Account{
	public double overdraftLimit=500;
	@Override
	public boolean withdraw(double withdraw) {
		if (super.balance-withdraw>overdraftLimit) {
			return true;
		}
		else return false;
	}
}
