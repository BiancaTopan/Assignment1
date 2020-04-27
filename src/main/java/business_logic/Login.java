package business_logic;

public class Login {
	int login_ID;
	String username;
	String password;
	String role;
	
	public Login() {}
	
	public Login(int login_ID, String username, String password, String role) {
		super();
		this.login_ID = login_ID;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getLogin_ID() {
		return login_ID;
	}

	public void setLogin_ID(int login_ID) {
		this.login_ID = login_ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
