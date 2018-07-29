package GUIPractice;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FullGUI extends JFrame {
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pwd;
	
	public FullGUI () {
		super ("My Window");
		setLayout (new FlowLayout());
		
		text1 = new JTextField (10);
		add(text1);
		
		text2 = new JTextField (10);
		text2.setEditable(false);
		add(text2);
		
		text3 = new JTextField ("Enter some shit here");
		//text3.setText(getName());
		add(text3);
		
		pwd = new JPasswordField ("",10);
		add(pwd);
	
		thehandler handler = new thehandler ();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		pwd.addActionListener(handler);
		//pwd.addComponentListener(null);
	}
	
	private class thehandler implements ActionListener {
		public void actionPerformed (ActionEvent ae) {
			String st = "";
			
		if (ae.getSource()==text1)
			st = String.format("field 1: %s", ae.getActionCommand());
		else if (ae.getSource()==text2)
			st = String.format("field 2: %s", ae.getActionCommand());
		else if (ae.getSource()==text3)
			st = String.format("field 3: %s", ae.getActionCommand());
		else if (ae.getSource()==pwd)
			st = String.format("Password : %s", ae.getActionCommand());
		
		JOptionPane.showMessageDialog(null, st);
		
		}
	
	}
	
}