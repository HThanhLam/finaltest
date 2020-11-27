package entity;

public class Candidate {
	private String Firstname;
	private String Lastname;
	private String Email;
	private String phone;
	private String Password;
	private int Expinyear;
	private String Proskill;
	private String GraduationRank;
	public Candidate(){
		Expinyear= 0;
		Proskill="undefined";
		GraduationRank="non";
	}
	public String getFirstname() {
		return Firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public String getPhone() {
		return phone;
	}
	public int getExpinyear() {
		return Expinyear;
	}
	public String getProskill() {
		return Proskill;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setExpinyear(int expinyear) {
		Expinyear = expinyear;
	}
	public void setProskill(String proskill) {
		Proskill = proskill;
	}
	public String getGraduationRank() {
		return GraduationRank;
	}
	public void setGraduationRank(String graduationRank) {
		GraduationRank = graduationRank;
	};
	
}
