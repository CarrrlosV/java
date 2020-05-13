package bancoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {

	public static Connection bdJava() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/bdjava", "root", "");

		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}

	}

}
