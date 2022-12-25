package bank;

public class Bank {
	private int accountNumber;
	private String holder;
	private double balance;
	private double newBalance;

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
// fim getters e setters

	public double deposit (double deposit) {
		newBalance = newBalance + deposit;
		balance = newBalance;
		return balance;
	}
	public double withdraw (double withdraw) {
		newBalance = (newBalance-5) - withdraw;
		balance = newBalance;
		return balance;
	}
}
