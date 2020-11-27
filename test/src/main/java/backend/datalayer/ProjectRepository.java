package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entity.Candidate;
import utils.Scannerutils;

public class ProjectRepository {
	public int register_connect(Candidate a) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		String mysql="INSERT INTO Candidate VALUES ("+ a.getFirstname()+","+a.getLastname()+","+a.getEmail()+
			","+a.getPhone()+","+a.getPassword()+","+a.getExpinyear()+","+a.getProskill()+","+a.getGraduationRank() +")";
		String URL= "jdbc:mysql://localhost:3306/testsystem";
		String username="root";
		String password="0914661056";
		Connection conn = DriverManager.getConnection(URL, username, password);
		Statement stmat = conn.createStatement();
		int result = stmat.executeUpdate(mysql);
		conn.close();
		stmat.close();
		return result;
	}

	public boolean login_connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Scannerutils scanner= new Scannerutils();
		System.out.println("input email:");
		String email=scanner.inputEmail("cant input email");
		System.out.println("input password:");
		String inputpassword=scanner.inputPassword("cant input password");
		String mysql="SELECT Email FROM Candidate WHERE " + email +"= Email AND Password="+inputpassword ;
		String URL= "jdbc:mysql://localhost:3306/testsystem";
		String username="root";
		String password="0914661056";
		Connection conn = DriverManager.getConnection(URL, username, password);
		Statement stmat = conn.createStatement();
		ResultSet myresultset= stmat.executeQuery(mysql);
		while (myresultset.next()) {
			conn.close();
			stmat.close();
			return true;
		}
		conn.close();
		stmat.close();
		return false;
	}
}	