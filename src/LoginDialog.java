import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private SLogin1 sLogin;
	private JTextField tfId;
	private JPasswordField tfPassword;
	private SugangsincheongPanel su;
	private int success = 0;

	
	public LoginDialog(JFrame parent) {
		super(parent);
		
		setSize(350, 200);
	    setModal(true);
	    setTitle("Login");

		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		this.setLocation(parent.getX()+60,parent.getY()+300);
		
		JPanel nullPanel = new JPanel();
		this.add(nullPanel);
		
		JPanel idPanel = new JPanel();
		JLabel lbId = new JLabel("ID:             ");
		lbId.setFont(new Font("HY중고딕 12", 0, 16));
		this.tfId = new JTextField();
		tfId.setColumns(10);
		idPanel.add(lbId);
		idPanel.add(tfId);
		this.add(idPanel);
		
		JPanel passwordPanel = new JPanel();
		JLabel lbPassword = new JLabel("Password: ");
		lbPassword.setFont(new Font("HY중고딕 12", 0, 16));
		this.tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		passwordPanel.add(lbPassword);
		passwordPanel.add(tfPassword);
		this.add(passwordPanel);
		
		JPanel btnPanel = new JPanel();
		JButton btLogin = new JButton("Log in");
		btLogin.setFont(new Font("HY중고딕 12", Font.BOLD, 13));
		btLogin.setBackground(new Color(53,84,158));
		btLogin.setForeground(Color.white);
		btLogin.setBorderPainted(false);
		btLogin.setFocusPainted(false);
		btnPanel.add(btLogin);
		this.add(btnPanel);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		this.sLogin = new SLogin1();
		
		setVisible(true);
	}
	
	public void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		VLogin1 vLogin = sLogin.login(id,password);
		if(vLogin == null)
			JOptionPane.showMessageDialog(null, "Login Failed!");
		else {
			success=1;
			loginDone();
		}
	}
	
	public String getName() {
	     String id = tfId.getText();
	     String password = tfPassword.getText();
	     VLogin1 vLogin = sLogin.login(id, password);
	     return vLogin.getName();
	}

	private void loginDone() {
		this.setVisible(false);
		SugangsincheongPanel su = new SugangsincheongPanel();
		su.draw(this.getName());
	}
		
	int Success() {
		return success;
	}

	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			login();
		}
	}
}
