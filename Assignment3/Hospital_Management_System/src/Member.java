
public class Member {
	
	private String uname, password, email, phone , confirmPassword;

	
	public Member() {
		super();
	}

	public Member(String uname, String password, String email, String phone , String confirmPassword) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.confirmPassword = confirmPassword;
	}

	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getconfirmPassword() {
		return confirmPassword;
	}

	public void setconfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
