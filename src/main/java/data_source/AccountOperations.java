package data_source;

import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;

import business_logic.Account;



public class AccountOperations {
	
	public static void printAccount(Connection connection)throws SQLException {
		System.out.println("Creating Statement...");
		Statement stmt=connection.createStatement();
		String sqlQuery="SELECT * FROM account";
		ResultSet queryResult=stmt.executeQuery(sqlQuery);
		
		while (queryResult.next()) {
			int account_ID=queryResult.getInt("account_ID");
			String type=queryResult.getString("type");
			String balance = queryResult.getString("balance");
			String creationDATE = queryResult.getString("creationDATE");
			int client_ID = queryResult.getInt("client_ID");
			
			System.out.println("account_ID: " + account_ID + " type: " + type + " balance: " + balance + " creationDATE: " + creationDATE + " client_ID: " + client_ID);
		}
		queryResult.close();
		stmt.close();
	}
	
	public static void insertAccount(Connection con, Account account) throws SQLException {
		String statement= "INSERT INTO account (account_ID, type, balance, creationDATE, client_ID)values (?,?,?,?,?)";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, account.getAccount_ID());
		prepSt.setString(2, account.getType());
		prepSt.setString(3, account.getBalance());
		prepSt.setString(4, account.getCreationDATE());
        prepSt.setInt(5, account.getClient_ID());
          
		prepSt.executeUpdate();
	}
	

	public static void deleteAccount(Connection con, Account account) throws SQLException {
		String statement= "DELETE from account where account_ID=?";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, account.getAccount_ID());
		prepSt.executeUpdate();
		
	}
    
	public static void updateAccount(Connection con, Account account, String new_type, String new_balance, String new_creationDATE, int new_client_ID ) throws SQLException {
		String statement= "UPDATE account SET type=?, balance=?, creationDATE=?, client_ID=? where account_ID=?";
		PreparedStatement prepSt = con.prepareStatement(statement);
		prepSt.setInt(1, account.getAccount_ID());
		prepSt.setString(2, new_type);
		prepSt.setString(3, new_balance);
		prepSt.setString(4, new_creationDATE);
		prepSt.setInt(5, new_client_ID);
		prepSt.executeUpdate();
	}
     
	
}
