package GUIPractice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class GUIwithJFrame2 extends JFrame {
	/*
	So this is the flowchart for GUI:
	1. initiate the label with a variable
	2. build a constructor
	3. give the name for title
	4. ensure u set the layout for the window
	5. initiate the text that should go into the JLabel variable
	6. you can set hover text if u like
	7. add the label to the JFrame
	===============
	Now in the main class, u need to simply instantiate the object for the class you created for JFrame.
	A. using the object, ensure you set the close operation and the size of the window, and lastly ensure the window visibility is set to true 
	*/
	private JLabel lab;
	
	public GUIwithJFrame2 () {
		super ("A Title");
		setLayout (new FlowLayout());
		
		lab = new JLabel ("This is the text showing");
		lab.setToolTipText("you hovered on me");
		add(lab);
	}

}
