package com.css.corejavatraining.BankingSystem;
import java.util.Set;



public  class Bank implements IBankServiceProvider{
	private String IFSC;
	private String bankName;
	//private BankAccount[] accounts;
	private Set<BankAccount> accounts;
	
	
	public Bank(String iFSC, String bankName) {
		super();
		IFSC = iFSC;
		this.bankName = bankName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	

	public Set<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<BankAccount> accounts) {
		this.accounts = accounts;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String iFSC, String bankName, Set<BankAccount> accounts) {
		super();
		IFSC = iFSC;
		this.bankName = bankName;
		this.accounts = accounts;
	}



	@Override
	public String toString() {
		return "Bank [IFSC=" + IFSC + ", bankName=" + bankName + ", accounts=" + accounts + "]";
	}

	@Override
	public BankAccount checkAccount(String accountNo) {
		BankAccount foundAccount = null;
		for (BankAccount account : this.accounts) {
			if (account.getAccountNo().equals(accountNo)) {
				foundAccount = account;
				break;
			}
		}
		return foundAccount;
	}

	
	public double getBalance(String accountNo) {
		double balance = 0.0;
		BankAccount foundAccount = this.checkAccount(accountNo);
		if (foundAccount != null)
			balance = foundAccount.getBalance();
		return balance;
	}

	public boolean depositMoney(String accountNo, double amount) {
		boolean depositFlag = false;
		BankAccount foundAccount = this.checkAccount(accountNo);
		if (foundAccount != null) {
			double newBalance = foundAccount.getBalance() + amount;
			foundAccount.setBalance(newBalance);
			depositFlag = true;
		}
		return depositFlag;
	}

	public boolean withdrawMoney(String accountNo, double amount) {
		boolean withdrawFlag = false;
		BankAccount foundAccount = this.checkAccount(accountNo);
		if (foundAccount != null) {
			if (foundAccount.getBalance() >= amount) {
				double newBalance = foundAccount.getBalance() - amount;
				foundAccount.setBalance(newBalance);
				withdrawFlag = true;
			}
		}
		return withdrawFlag;
	}

	public boolean transferMoney(String fromAccountNo, String toAccountNo, double amount) {
		boolean transferFlag=false;
		
		boolean withdrawFlag=this.withdrawMoney(fromAccountNo, amount);
		if(withdrawFlag) {
			boolean depositFlag=this.depositMoney(toAccountNo, amount);
			if(depositFlag)
				transferFlag=true;
			else
				this.depositMoney(fromAccountNo,amount);
		}
		
		return transferFlag;
	}

	public boolean createAccount(String accountNo,String accountName) {
		boolean createAccountFlag=false;
		BankAccount newAccount=new BankAccount(accountName);
		this.accounts.add(newAccount);
		if(this.accounts.contains(newAccount))
			createAccountFlag=true;
		
		return createAccountFlag;
	}

	
	
}
