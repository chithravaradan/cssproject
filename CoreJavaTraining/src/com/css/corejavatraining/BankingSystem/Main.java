package com.css.corejavatraining.BankingSystem;
import java.util.HashSet;
import java.util.Set;

public class Main {

public static void main(String[] args) {
		
		Set<BankAccount> accounts=new HashSet<BankAccount>();
		BankAccount acc1=new BankAccount("abc");
		BankAccount acc2=new BankAccount("xyz");
		BankAccount acc3=new BankAccount("lmn");
		BankAccount acc4=new BankAccount("gghg");
		BankAccount acc5=new BankAccount("xyhfghz");
		BankAccount acc6=new BankAccount("lmgfhfdn");
		
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);
		accounts.add(acc5);
		accounts.add(acc6);
		//Bank sbi=new Bank("101XXX101","sbi Bank");
		//sbi.setAccounts(accounts);
		Bank icic=new Bank("101XXX102","ICIC Bank");
		icic.setAccounts(accounts);
		BankAccount foundAccount=icic.checkAccount(Integer.toString(6));
		System.out.println("Print the requested account details: "+foundAccount.toString());
		System.out.println("GetBalance: "+icic.getBalance(Integer.toString(1)));
		System.out.println("DepositMoney: "+icic.depositMoney(Integer.toString(1),1200));
		System.out.println("GetBalance: "+icic.getBalance(Integer.toString(1)));
		System.out.println("DepositMoney: "+icic.depositMoney(Integer.toString(5),3000));
		System.out.println("GetBalance: "+icic.getBalance(Integer.toString(5)));
		System.out.println("WithdrawMoney: "+icic.withdrawMoney(Integer.toString(4),300));
		System.out.println("Balance After withdraw: "+icic.getBalance(Integer.toString(4)));
		System.out.println("TransferMoney: "+icic.transferMoney(Integer.toString(5), Integer.toString(6), 500));
		System.out.println("CheckAccount fromAccount: "+icic.checkAccount(Integer.toString(5)).toString());
		System.out.println("CheckAccount ToAccount: "+icic.checkAccount(Integer.toString(6)).toString());
		System.out.println("Create Account: "+icic.createAccount("7","Chithra"));
		
}
}
