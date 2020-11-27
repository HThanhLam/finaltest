package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.presentation.ProjectController;
import entity.Candidate;
import utils.Scannerutils;

public class function {
	private ProjectController ProjectController;
	public function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ProjectController = new ProjectController();
	};;
	public Candidate register(int typeofcandidate) {
		//type 0:Experienced, type1:Fresh
		Candidate candidate=new Candidate();
		Scannerutils scanner= new Scannerutils();
		if (typeofcandidate==0) {
			System.out.println("input first name:");
			candidate.setFirstname(scanner.inputName("cant input firstname"));
			System.out.println("input last name:");
			candidate.setLastname(scanner.inputName("cant input lastname"));
			System.out.println("input Email:");
			candidate.setEmail(scanner.inputEmail("cant input email"));
			System.out.println("input phonenumber :");
			candidate.setPhone(scanner.inputPhoneNumber("cant input phonenumber"));
			System.out.println("input password :");
			candidate.setPassword(scanner.inputPassword("cant input password"));
			System.out.println("input expinyear :");
			candidate.setExpinyear(scanner.inputInt("cant input expinyear"));
			System.out.println("input Proskill :");
			candidate.setProskill(scanner.inputString("cant input proskill"));
			candidate.setGraduationRank("non");
		}
		else {
			System.out.println("input first name:");
			candidate.setFirstname(scanner.inputName("cant input firstname"));
			System.out.println("input last name:");
			candidate.setLastname(scanner.inputName("cant input lastname"));
			System.out.println("input Email :");
			candidate.setEmail(scanner.inputEmail("cant input email"));
			System.out.println("input phonenumber :");
			candidate.setPhone(scanner.inputPhoneNumber("cant input phonenumber"));
			System.out.println("input password :");
			candidate.setPassword(scanner.inputPassword("cant input password"));
			System.out.println("input GraduationRank :");
			candidate.setGraduationRank(scanner.Graduation("cant input GraduationRank"));
			candidate.setProskill("non");
			candidate.setExpinyear(0);

		}
		return candidate;
	}
	public int register_connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		Candidate a= new Candidate();
		Scannerutils scanner= new Scannerutils();
		System.out.println("Experienced type: 0,Fresh type:1 ");
		while(true) {
		int num=scanner.inputInt("");
		if (num==0||num==1) {
		a=this.register(num);
			if(ProjectController.register_connect(a)!=-1) {
					System.out.println("register success");
					return 0;
				}
			else {
				System.out.println("register failure");
			};
				
		}
				else {
					System.out.println("wrong input");
		};
		}
	};
	public void login_connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		if( ProjectController.login_connect())	{
			System.out.println("login success");
		}
		else {
			System.out.println("login failure");
		}
};

}
