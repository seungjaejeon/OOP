package example8;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Lab08_2 implements ActionListener {
	JLabel today = new JLabel("Day of Week");
	JLabel future = new JLabel("Passed days");
	JButton but = new JButton("Calculate");
	static JTextField input1 = new JTextField(20);
	static JTextField input2 = new JTextField(20);
	static JLabel result = new JLabel();
  public Lab08_2() {
    // Create the window	
	 but.addActionListener(this);
    JFrame frame = new JFrame("Day");
    // Add a layout manager so that the button is not placed on top of the label
    frame.setLayout(new FlowLayout());
    // Add a label and a button
    frame.add(today);
    frame.add(input1);
    frame.add(future);
    frame.add(input2);
    frame.add(but);
	frame.add(result);
    // Arrange the components inside the window
    frame.pack();
    frame.setSize(300, 200);
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // By default, the window is not visible. Make it visible.
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    Lab08_2 se = new Lab08_2();
    // Schedules the application to be run at the correct time in the event queue.
 
  }
  public void actionPerformed(ActionEvent e) {
	  	String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	  	
	  	int today = Integer.parseInt(input1.getText());
	  	int future = Integer.parseInt(input2.getText());
	  	String sen = "Today is " + week[today%7] + " and the future day is " + week[(today+future)%7];
	    if (e.getSource() == but) result.setText(sen);
  }
}