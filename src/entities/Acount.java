package entities;

public class Acount {

	private int number;
	private String name;
	private double balance;

	public Acount(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Acount(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double balance) {
		this.balance -= balance + 5.0;
	}

	public String toString() {
		return "Acount: " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

}
