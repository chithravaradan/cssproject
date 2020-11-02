package com.css.corejavatraining.Banking;

public class Bank {
public String accountNo;
private double balance;
public String accountName;
public int lastAssignedNo=0;

public Bank() {
	super();
	// TODO Auto-generated constructor stub
}

public Bank(double balance, String accountName, int lastAssignedNo) {
	super();
	
	this.balance = balance;
	this.accountName = accountName;
	this.lastAssignedNo = lastAssignedNo;
}

public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}

@Override
public String toString() {
	return "Bank [accountNo=" + accountNo + ", balance=" + balance + ", accountName=" + accountName
			+ ", lastAssignedNo=" + lastAssignedNo + "]";
}



}
