import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SugangsincheongPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	 public SugangsincheongPanel() {
	   }

	   public void draw(String name) {
	      JLabel label = new JLabel("Welcome, "+name +"!");
	      label.setFont(new Font("HY중고딕 12", 0, 16));
	      this.add(label);
	   }
}
