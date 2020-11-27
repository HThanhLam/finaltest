package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class program {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		function func= new function();
		func.register_connect();
		 func.login_connect();
		
		
	}
}
