package business_logic;

import java.sql.Connection;



public class Client {
	int client_ID;
	String name;
	String ID_number;
	String CNP;
	String address;
	int login_ID;
	
	public Client(Connection con, Client client) {}

	public Client(int client_ID, String name, String iD_number, String cNP, String address, int login_ID) {
		super();
		this.client_ID = client_ID;
		this.name = name;
		ID_number = iD_number;
		CNP = cNP;
		this.address = address;
		this.login_ID = login_ID;
	}

	public int getClient_ID() {
		return client_ID;
	}

	public void setClient_ID(int client_ID) {
		this.client_ID = client_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID_number() {
		return ID_number;
	}

	public void setID_number(String iD_number) {
		ID_number = iD_number;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLogin_ID() {
		return login_ID;
	}

	public void setLogin_ID(int login_ID) {
		this.login_ID = login_ID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
