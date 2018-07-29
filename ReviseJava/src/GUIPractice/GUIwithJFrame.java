package GUIPractice;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIwithJFrame extends JFrame {
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
	
	private JLabel onelab;
	
	public GUIwithJFrame () {
		super ("Me is Title");
		setLayout(new FlowLayout());
		
		onelab = new JLabel ("Hi there, welcome to JLabel text");
		onelab.setToolTipText("You are hovering boss");
		add(onelab);
	}
	

}

/*
private JLabel lab1;
	
	public GUIwithJFrame () {
		super ("SreeS");
		setLayout(new FlowLayout());
		
		lab1 = new JLabel ("The box is created");
		lab1.setToolTipText("you just hovered on me!");
		add(lab1);
	}
 */
/*
 * private JLabel mylab1;
	
	public GUIwithJFrame () {
		super ("M the title");
		setLayout (new FlowLayout());
		
		mylab1 = new JLabel ("This is a sentence on the window");
		mylab1.setToolTipText("U hovering on text!");
		add(mylab1);
	}
 */