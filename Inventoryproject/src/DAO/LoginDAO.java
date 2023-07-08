package DAO;
import Model.Login;

import java.sql.*;

import ConnectionManager.ConnectionManager;
public class LoginDAO {
 
	public boolean validate(Login login) throws ClassNotFoundException, SQLException
	{
		String username = login.getUsername();
		String password = login.getPassword();
		
		
		ConnectionManager conm = new ConnectionManager();
		Connection con = conm.establishConnection();
		
		// statement class for implementation of Query in Java
		Statement st = con.createStatement();
		// Resultset class
		ResultSet rt = st.executeQuery("select * from login");
		
		while(rt.next())
		{
			if(username.equals(rt.getString("username"))&& password.equals(rt.getString("password")))
			{
				conm.closeConnection();
				return true;
			}
		}
		conm.closeConnection();
		return false;
	}
}