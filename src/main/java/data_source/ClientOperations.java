package data_source;

import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;

import business_logic.Client;



public class ClientOperations {
	
	public static void printMyAccount(Connection connection)throws SQLException {
		System.out.println("Creating Statement...");
		Statement stmt=connection.createStatement();
		String sqlQuery="SELECT * FROM account where client_ID=?";
		ResultSet queryResult=stmt.executeQuery(sqlQuery);
		
		while (queryResult.next()) {
			//int account_ID=queryResult.getInt("account_ID");
			String type=queryResult.getString("type");
			String balance = queryResult.getString("balance");
			String creationDATE = queryResult.getString("creationDATE");
			//int client_ID = queryResult.getInt("client_ID");
			
			//System.out.println("account_ID: " + account_ID + " type: " + type + " balance: " + balance + " creationDATE: " + creationDATE + " client_ID: " + client_ID);
			System.out.println( " type: " + type + " balance: " + balance + " creationDATE: " + creationDATE );
		}
		queryResult.close();
		stmt.close();
	}

	public static void printClient(Connection connection)throws SQLException {
		System.out.println("Creating Statement...");
		Statement stmt=connection.createStatement();
		String sqlQuery="SELECT * FROM client";
		ResultSet queryResult=stmt.executeQuery(sqlQuery);
		
		while (queryResult.next()) {
			int client_ID=queryResult.getInt("client_ID");
			String name=queryResult.getString("name");
			String ID_number = queryResult.getString("ID_number");
			String CNP = queryResult.getString("CNP");
			String address = queryResult.getString("address");
			int login_ID = queryResult.getInt("login_ID");
			
			System.out.println("client_ID: " + client_ID + " name: " + name + " ID_number: " + ID_number + " CNP: " + CNP + " address: " + address + " login_ID: " + login_ID);
		}
		queryResult.close();
		stmt.close();
	}
	
	public static void insertClient(Connection con, Client client) throws SQLException {
		String statement= "INSERT INTO client (client_ID, name, ID_number, CNP, address, login_ID)values (?,?,?,?,?,?)";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, client.getClient_ID());
		prepSt.setString(2, client.getName());
		prepSt.setString(3, client.getID_number());
		prepSt.setString(4, client.getCNP());
		prepSt.setString(5, client.getAddress());
        prepSt.setInt(6, client.getLogin_ID());
          
		prepSt.executeUpdate();
	}

	public static void deleteClient(Connection con, Client client) throws SQLException {
		String statement= "DELETE from client where client_ID=?";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, client.getClient_ID());
		prepSt.executeUpdate();
		
	}
   
	public static void updateClient(Connection con, Client client, String new_name, String new_ID_number, String new_CNP, String new_address,int new_login_ID ) throws SQLException {
		String statement= "UPDATE account SET name=?, ID_number=?, CNP=?, address=?, login_ID=?where client_ID=?";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, client.getClient_ID());
		prepSt.setString(2, new_name);
		prepSt.setString(3, new_ID_number);
		prepSt.setString(4, new_CNP);
		prepSt.setString(5, new_address);
		prepSt.setInt(6, new_login_ID);
	}
	
}
