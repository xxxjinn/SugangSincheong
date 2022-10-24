import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VLogin {
	private String id;
	private String password;
	private String name;
	
	public VLogin(String id, String password) {
		this.id=id;
		this.password=password;
	}

	public Object getId() {
		return id;
	}

	public Object getPassword() {
		return password;
	}

}
