import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class GUILesson extends JFrame {

	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pwd;
	
	public GUILesson () {
		super ("The Window");
		setLayout(new FlowLayout());
		
		text1 = new JTextField (10);
		add(text1);
		
		text2 = new JTextField ("Your Name");
		add(text2);
		
		text3 = new JTextField ("Cant Edit");
		text3.setEditable(false);
		add(text3);
		
		pwd = new JPasswordField ("       ");
		add(pwd);
		
		theaction action = new theaction ();
		text1.addActionListener(action);
		text2.addActionListener(action);
		text3.addActionListener(action);
		pwd.addActionListener(action);
		}
		private class theaction implements ActionListener {
			public void actionPerformed (ActionEvent watodo) {
				String string = "";
			if (watodo.getSource()==text1)
				string= String.format(watodo.getActionCommand());
			else if (watodo.getSource()==text2)
				string= String.format("text 2 is %s", watodo.getActionCommand());
			else if (watodo.getSource()==text3)
				string= String.format("text 3 is %s", watodo.getActionCommand());
			else if (watodo.getSource()==pwd)
				string= String.format("Password is %s", watodo.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
			}
		}
}

/*
 private JLabel practicing;
	public GUILesson () {
		super ("Hello!!");
		setLayout (new FlowLayout());
		practicing = new JLabel ("Label Of Lambs");
		practicing.setToolTipText("Hii");
		add(practicing);
	}
------------
 private JLabel mylabel;
	public GUILesson () {
		super ("Calculator");
		setLayout (new FlowLayout());
		mylabel = new JLabel ("Your Calculator");
		mylabel.setToolTipText("For result");
		mylabel.setText("For all people");
		add(mylabel);
		
	}
 
-----------
private JLabel no1;
public GUILesson () {
	super ("The Calc Title");
	setLayout(new FlowLayout());
	no1 = new JLabel ("Calculator Label");
	no1.setToolTipText("The sum");
	add(no1);
}*/