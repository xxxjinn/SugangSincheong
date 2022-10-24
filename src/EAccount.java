import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EAccount {

	private String id;
	private String password;
	private String name;
	
	public EAccount(String id, String password, String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}


	public VLogin getLogin() {
		// file read
		VLogin vLogin = new VLogin(id, password);
		return vLogin;
	}

}
