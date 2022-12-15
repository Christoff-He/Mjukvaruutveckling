package uppgift_6;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	
	private String pNbr;
	private String name;
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public void setPNbr(String pNbr) {
		this.pNbr = pNbr;
	}
	
	public String getPNbr() {
		return this.pNbr;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAccounts(ArrayList<Account> accounts) { 
		this.accounts = accounts;
	}
	
	public ArrayList<Account> getAccounts() {
		return this.accounts;
	}
	
	public String toString() {
		return this.name;
	}
	
	public void addAccount(Account a)  {
		accounts.add(a);
	}
	
	public Account findAccount(String accountNbr) {
		for(Account a : accounts) {
			if(a.getNbr().equals(accountNbr)) {
				return a;
			}
		}
		
		return null;
	}
	
	public double totBalance() {
		double totalBalance = 0;
		for(int a = 0; a < accounts.size(); a++) {
			totalBalance += accounts.get(a).getBalance();
		}
		
		return totalBalance;
	}
}