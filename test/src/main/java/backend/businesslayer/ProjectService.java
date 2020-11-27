package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.datalayer.ProjectRepository;
import entity.Candidate;

public class ProjectService {
	private ProjectRepository ProjectRepository;
	public ProjectService() {
		ProjectRepository = new ProjectRepository();
		}
	public int register_connect(Candidate a) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
				return ProjectRepository.register_connect(a);
			};
	public boolean login_connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
				return ProjectRepository.login_connect();
	};
	
}