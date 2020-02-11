package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlCustomerDao implements Dao <Customer> {
	private Connection connection;
	//C
	public void create(Customer customer) {
		
	}
	//R
	public ArrayList<Customer> readAll() {
		return null;

	}
	//U
	public void update(Customer customer) {
		
	}
	//D
	public void delete(Customer customer) {
		
	}
	

	
	public MysqlCustomerDao() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://34.89.19.218/projectdb", "root", "g2e6can26");
	}
	
	public ArrayList<Customer> getAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customers");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String firstName = resultSet.getString("first_name");
				String surname = resultSet.getString("surname");
				customers.add(new Customer(id, firstName, surname));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return customers;
	}
	
}
