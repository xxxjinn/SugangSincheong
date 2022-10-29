import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private SugangsincheongPanel sugangsincheongPanel;
	
	public MainFrame() {
		//attributes
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(screenSize.width/2-this.getWidth(),0);
		this.setTitle("main");
		LayoutManager layoutManager = new BorderLayout();
	    this.setLayout(layoutManager);

		this.sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel,BorderLayout.CENTER);
		
		LoginDialog loginDialog = new LoginDialog(this);
		
		if (loginDialog.Success() == 1) {
	         this.sugangsincheongPanel = new SugangsincheongPanel();
	         String name = loginDialog.getName();
	         sugangsincheongPanel.draw(name);
	         this.add(sugangsincheongPanel, BorderLayout.NORTH);
	      }
	}
}
