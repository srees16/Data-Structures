package GUIPractice;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;


public class MoreGUIFull extends JFrame {
	private JTextField tx1;
	private JTextField tx2;
	private JTextField tx3;
	private JPasswordField pwd;
	
	public MoreGUIFull () {
		super ("MoreGUIFull");
		setLayout (new FlowLayout());
		
		tx1 = new JTextField (20);
		add(tx1);
		
		tx2 = new JTextField ("Type your name", 20);
		add(tx2);
		
		tx3 = new JTextField ("", 20);
		tx3.setEditable(false);
		add(tx3);
		
		pwd = new JPasswordField ("",20);
		pwd.setVisible(true);
		add(pwd);
		
		smartbrain handler = new smartbrain ();
		tx1.addActionListener(handler);
		tx2.addActionListener(handler);
		tx3.addActionListener(handler);
		pwd.addActionListener(handler);
		
	}
	
	public class smartbrain implements ActionListener {
		public void actionPerformed (ActionEvent ap) {
			String str = "";
			
		if (ap.getSource()==tx1)
			str = String.format("%s", ap.getActionCommand());
		else if (ap.getSource()==tx2)
			str = String.format("%s", ap.getActionCommand());
		else if (ap.getSource()==tx3)
			str = String.format("%s", ap.getActionCommand());
		else if (ap.getSource()==pwd)
			str = String.format("%s", ap.getActionCommand());
		
		JOptionPane.showMessageDialog(null, str);
		}
		
	}
	
}