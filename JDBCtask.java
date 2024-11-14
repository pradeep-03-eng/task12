package task12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Database connection details
		
				String db_url="jdbc:mysql://localhost:3306";
				String user ="root";
				String password="root";
				
				// Step 2: Establish the connection.
				
					try {
						Connection connection = DriverManager.getConnection(db_url, user, password);
						
				// Step 3: Check connection is successful
						
						if(connection!=null) {
							System.out.println("Connection established");
						} else {
							System.out.println("Issue in connecting");
						}
						
				//Step 4: Peform Operation
						
						// Create the statements
						
						String createDB="create database JDBC_TASK";
						String use="use JDBC_TASK";
						String createTable="create table EMP_TABLE (empcode int, empname varchar(15),empage int,esalary int)";
						String insert="insert into EMP_TABLE values(101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000)";
						String select = "select * from EMP_TABLE";
						
						Statement stmt = connection.createStatement();
						
						// Execute the statements
						
						stmt.execute(createDB);
						
						stmt.execute(use);
						
						stmt.execute(createTable);
						
						stmt.executeUpdate(insert);
						
						ResultSet res = stmt.executeQuery(select);
						
						while(res.next()) {
							
							System.out.println(res.getInt("empcode")+" "+ res.getString("empname")+" "+ res.getInt("empage")+" "+res.getInt("esalary"));
						}
						
					// Step 5: Close the connection
						
						connection.close();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}
	
