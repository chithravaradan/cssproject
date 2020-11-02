package com.css.corejavatraining.BankingSystem;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
	
	private static int lastAssignedNo;
	static {
		lastAssignedNo=0;
	}
		
	public BankAccount(String accountName) {
		super();
		this.balance=1000;
		this.accountNo=Integer.toString(lastAssignedNo+1);  
		lastAssignedNo++;
		this.accountName = accountName;
	}
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance=1000.00;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	



}
