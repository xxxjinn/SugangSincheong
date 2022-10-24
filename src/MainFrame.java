import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MainFrame() {
		//attributes
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		SugangsincheongPanel sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel,BorderLayout.CENTER);
		
		LoginDialog loginDialog = new LoginDialog(this);
		loginDialog.setVisible(true);
		loginDialog.setSize(350,200);
		loginDialog.setModal(true);
		loginDialog.setTitle("Login");
		setVisible(true);
	}
}
