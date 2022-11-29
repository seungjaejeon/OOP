package example8;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Lab08_1 implements ActionListener {
	JLabel sec = new JLabel("Seconds");
	JButton but = new JButton("Calculate");
	static JTextField input = new JTextField(20);
	static JLabel result = new JLabel();
  public Lab08_1() {
    // Create the window	
	 but.addActionListener(this);
    JFrame frame = new JFrame("cal");
    // Add a layout manager so that the button is not placed on top of the label
    frame.setLayout(new FlowLayout());
    // Add a label and a button
    frame.add(sec);
    frame.add(input);
    frame.add(but);
	frame.add(result);
    // Arrange the components inside the window
    frame.pack();
    frame.setSize(400, 200);
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // By default, the window is not visible. Make it visible.
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    Lab08_1 se = new Lab08_1();
    // Schedules the application to be run at the correct time in the event queue.
 
  }
  public void actionPerformed(ActionEvent e) {
	  	int sec = Integer.parseInt(input.getText());
	    int hour = sec/3600;
	    int min = (sec%3600)/60;
	    sec = (sec%3600)%60;
	    String sen = "Time : "+hour+":"+min+":"+sec;
	    if (e.getSource() == but) result.setText(sen);
  }
}