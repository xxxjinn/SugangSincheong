import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SLogin {
	
	private VLogin vLogin;
	private EAccount eAccount;
	
	public SLogin(String id, String password, String name) {
		this.eAccount = new EAccount(id,password,name);
	}

	public VLogin login() {
		vLogin = this.eAccount.getLogin();
		return vLogin;
	}

	/*public void register(String inputId, String inputPassword) {
		if(vLogin.getId().equals(inputId) || vLogin.getPassword().equals(inputPassword)){
			System.out.println("로그인에 성공했습니다!");
		}else {
			System.out.println("아이디/비밀번호가 일치하지 않습니다.");
		}
	}*/

	public void register(String inputId, String string) {
		if(vLogin.getId().equals(inputId) && vLogin.getPassword().equals(string))
			JOptionPane.showMessageDialog(null, "Log in Success!");
		else
			JOptionPane.showMessageDialog(null, "Log in Failed.");
	}
}

