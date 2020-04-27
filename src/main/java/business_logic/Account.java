package business_logic;

import java.sql.Connection;



public class Account {
	int account_ID;
	String type;
	String balance;
	String creationDATE;
	int client_ID;
	
	public Account(Connection con, Account account) {}
	
	public Account(int account_ID, String type, String balance, String creationDATE, int client_ID) {
		super();
		this.account_ID = account_ID;
		this.type = type;
		this.balance = balance;
		this.creationDATE = creationDATE;
		this.client_ID = client_ID;
	}

	public int getAccount_ID() {
		return account_ID;
	}

	public void setAccount_ID(int account_ID) {
		this.account_ID = account_ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCreationDATE() {
		return creationDATE;
	}

	public void setCreationDATE(String creationDATE) {
		this.creationDATE = creationDATE;
	}

	public int getClient_ID() {
		return client_ID;
	}

	public void setClient_ID(int client_ID) {
		this.client_ID = client_ID;
	}
	
}
	