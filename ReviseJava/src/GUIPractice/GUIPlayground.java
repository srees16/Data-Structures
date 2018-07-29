package GUIPractice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class GUIPlayground {
	
	public static void main(String[] args) {
		/*
		 * Here is the flowchart for JOptionPane:
		 * 1. start with string variable to show input box and enter text you wanna ask
		 * 2. repeat step 1 for as many variables as you want
		 * 3. change the input of string variable to integer by parsing it
		 * 4. repeat step 3 for all the variables you gave in step 2
		 * 5. write a simple operation you wanna execute (in plain java)
		 * 6. ensure you show dialogue box n setup position of the box n the content
		
		String fn = JOptionPane.showInputDialog("Enter A");
		String sn = JOptionPane.showInputDialog("Enter B");
		String tn = JOptionPane.showInputDialog("Enter C");
		
		int a = Integer.parseInt(fn);
		int b = Integer.parseInt(sn);
		int c = Integer.parseInt(tn);
		int s = a * b/b*c;
		
		JOptionPane.showMessageDialog(null, "The Sum Is " + s, "Sum", JOptionPane.PLAIN_MESSAGE);
		*/
		/*
		String a = JOptionPane.showInputDialog("give a");
		String b = JOptionPane.showInputDialog("give b");
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		double p = x/y;
		JOptionPane.showMessageDialog(null, "Sum is " + p, "Sum", JOptionPane.PLAIN_MESSAGE);
		
		GUIwithJFrame theobj = new GUIwithJFrame ();
		theobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theobj.setSize(275,300);
		theobj.setVisible(true);
		
		GUIwithJFrame2 newobj = new GUIwithJFrame2 ();
		newobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newobj.setSize(200,300);
		newobj.setVisible(true);
		*/
		/*
		FullGUI goat = new FullGUI ();
		goat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		goat.setVisible(true);
		goat.setSize(400,200);
		
		MoreGUIFull dog = new MoreGUIFull ();
		dog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dog.setVisible(true);
		dog.setSize(300,400);
		*/
		String s1 = JOptionPane.showInputDialog("Enter A");
		String s2 = JOptionPane.showInputDialog("Enter B");
		
		double x = Integer.parseInt(s1);
		double y = Integer.parseInt(s2);
		double s = x/y;
		
		JOptionPane.showMessageDialog(null, "Sum is " + s, "Calc", JOptionPane.INFORMATION_MESSAGE);

	}

}