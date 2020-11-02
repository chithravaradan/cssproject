package com.css.corejavatraining.BankingSystem;

public interface IBankServiceProvider {
	public boolean createAccount(String accountNo,String accountName);
	public BankAccount checkAccount(String accountNo);
	public double getBalance(String accountNo);
	public boolean depositMoney(String accountNo,double amount);
	public boolean withdrawMoney(String accountNo,double amount);
	public boolean transferMoney(String fromAccountNo,String toAccountNo,double amount);
	
}
