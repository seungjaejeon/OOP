package example1;

import javax.swing.*; //to use GUI

public class Lab01_4 {
	public static void main(String[] args)
	{
		String newday_str = ""; //string variable
		String today_str = ""; //string variable
		String today = JOptionPane.showInputDialog("Enter today's day of the week"); //takes input through GUI
		int today_n = Integer.parseInt(today); //Unboxing because input will be of type string
		String passed = JOptionPane.showInputDialog("Enter the number of days passed since today"); //takes input through GUI
		int passed_n = Integer.parseInt(passed); //Unboxing because input will be of type string
		passed_n = passed_n % 7; //Save the remainder divided by 7
		
		// Add the days past and today, then divide by 7 and store the remainder as newday_n
		int newday_n = (today_n + passed_n) % 7; 
		// Use a switch to determine the day of the week through the input today_n
		switch (today_n) {
		case 0: 
			today_str = "Sunday";
			break;
		case 1:	
			today_str = "Monday";
			break;
		case 2:
			today_str = "Tuesday";
			break;
		case 3:
			today_str = "Wednesday";
			break;
		case 4:
			today_str = "Thursday";
			break;
		case 5:
			today_str = "Friday";
			break;
		case 6:
			today_str = "Saturday";
			break;
		}
		// Use a switch to determine the day of the week through the input newday_n
		switch (newday_n) {
		case 0: 
			newday_str = "Sunday";
			break;
		case 1:	
			newday_str = "Monday";
			break;
		case 2:
			newday_str = "Tuesday";
			break;
		case 3:
			newday_str = "Wednesday";
			break;
		case 4:
			newday_str = "Thursday";
			break;
		case 5:
			newday_str = "Friday";
			break;
		case 6:
			newday_str = "Saturday";
			break;
		}
		//print result
		System.out.printf("Today is %s and the future day is %s", today_str,newday_str);
		//Display result on GUI
		JOptionPane.showMessageDialog(null, "Today is " + today_str + " and the future day is " + newday_str);
		
		System.exit(0);
	}
	
}
