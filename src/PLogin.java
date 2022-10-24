import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PLogin {

	private SLogin sLogin;
	private VLogin vLogin;
	
	Scanner scanner = new Scanner(System.in); //System.in이 키보드, Scanner와 연결
	
	public void signUp(){
		System.out.println("회원가입을 시작합니다.");
		System.out.print("생성할 id를 입력해주세요:");
		String id = scanner.next(); //사람이 읽는 형태 그대로 읽어줌. space, line feed ... 띄어쓰기로 인식함. -> next: 한 단어를 읽어라
		System.out.println();
		System.out.print("비밀번호를 입력해주세요:");
		String password = scanner.next();
		System.out.println();
		System.out.print("이름을 입력해주세요:");
		String name=scanner.next();
		System.out.println("\n회원가입이 완료되었습니다!");
		
		sLogin = new SLogin(id, password, name);
		vLogin = sLogin.login();
	}
	
	public void logIn() {
		JFrame mainFrame = new JFrame();
		JPanel panel = new JPanel();
		JLabel id = new JLabel("ID: ");
		JLabel pswrd = new JLabel("Password: ");
		final JTextField txtId = new JTextField(10);
		final JTextField txtPassword = new JTextField(10);
		JButton logBtn = new JButton("Log In");
		mainFrame.setVisible(true); 
		mainFrame.setSize(400, 300);
		mainFrame.setLocationRelativeTo(null); 
		
		panel.add(id);
		panel.add(txtId);
		panel.add(pswrd);
		panel.add(txtPassword);
		panel.add(logBtn);
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sLogin.register(txtId.getText(), txtPassword.getText());
				PLogin pLogin = new PLogin();
			}
		});
		
		mainFrame.add(panel);
		/*System.out.println("--------------------");
		System.out.println("아이디를 입력해주세요.");
		String inputId = scanner.next();
		System.out.println("비밀번호를 입력해주세요.");
		String inputPassword = scanner.next();
		scanner.close();
		
		sLogin.register(inputId,inputPassword);*/
	}
}
