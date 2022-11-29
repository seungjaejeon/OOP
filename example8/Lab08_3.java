package example8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
public class Lab08_3 implements ActionListener {
	JLabel game = new JLabel("Start Game!");
	JButton rock = new JButton("rock");
	JButton scissors = new JButton("scissors");
	JButton paper = new JButton("paper");
  public Lab08_3() {
    // Create the window	
	 rock.addActionListener(this);
	 scissors.addActionListener(this);
	 paper.addActionListener(this);
    JFrame frame = new JFrame("");
    // Add a layout manager so that the button is not placed on top of the label
    rock.setBounds(50, 110, 100, 40);
    scissors.setBounds(150, 110, 100, 40);
    paper.setBounds(250, 110, 100, 40);
    frame.add(rock);
    frame.add(scissors);
    frame.add(paper);
    
    game.setBounds(170, 40, 200, 40);
    frame.add(game);
    frame.pack();
    frame.setSize(400, 200);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // By default, the window is not visible. Make it visible.
    frame.setVisible(true);
  }
  public static void main(String[] args) {
	  
    Lab08_3 se = new Lab08_3();
    // Schedules the application to be run at the correct time in the event queue.
    
  }
  public void actionPerformed(ActionEvent e) {
	  Random random = new Random();
	  	int com = random.nextInt(3);
	  	String[] computer = {"rock", "scissors", "paper"};
	  	game.setBounds(65, 50, 300, 50);
	    if (e.getSource() == rock) 
	    {
	    	if (computer[com].equals("paper")) game.setText("Computer : "+computer[com]+", You : Rock, Result : Lose");
	    	if (computer[com].equals("rock")) game.setText("Computer : "+computer[com]+", You : Rock, Result : Draw");
	    	if (computer[com].equals("scissors")) game.setText("Computer : "+computer[com]+", You : Rock, Result : Win");
	    }
	    if (e.getSource() == scissors) 
	    {
	    	if (computer[com].equals("paper")) game.setText("Computer : "+computer[com]+", You : Scissors, Result : Win");
	    	if (computer[com].equals("rock")) game.setText("Computer : "+computer[com]+", You : Scissors, Result : Lose");
	    	if (computer[com].equals("scissors")) game.setText("Computer : "+computer[com]+", You : Scissors, Result : Draw");
	    }
	    if (e.getSource() == paper) 
	    {
	    	if (computer[com].equals("paper")) game.setText("Computer : "+computer[com]+", You : Paper, Result : Draw");
	    	if (computer[com].equals("rock")) game.setText("Computer : "+computer[com]+", You : Paper, Result : Win");
	    	if (computer[com].equals("scissors")) game.setText("Computer : "+computer[com]+", You : Paper, Result : Lose");
	    }
  }
}