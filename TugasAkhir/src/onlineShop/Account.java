package onlineShop;

public class Account {
	private String username;
	private String password;
	private double balance;
	public Account(String username, String password, double balance) {
	
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
		
}
