package uppgift_6;

public class Account {
	private String nbr;
	private double balance;
	private Person owner;

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public Person getOwner() {
		return this.owner;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public String getNbr() {
		return this.nbr;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	void credit(double amount) {
		setBalance(getBalance() + amount);
	}

	void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
	
	public String toString() {
		return this.nbr;
	}
}
