package backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.businesslayer.ProjectService;
import entity.Candidate;

public class ProjectController {
	private ProjectService ProjectService;
	public ProjectController() {
		ProjectService = new ProjectService();
	};
	public int register_connect(Candidate a) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
			return ProjectService.register_connect(a);
	};
	public boolean login_connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		return ProjectService.login_connect();		
	};
}
