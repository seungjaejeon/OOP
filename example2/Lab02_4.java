package example2;

import java.util.Scanner;
public class Lab02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int first_input = input;
		int sum = 0;
		if (first_input>=100)
		{
			System.out.println("This number is greater than or equal to 100.");
			return;
		}
		System.out.print(first_input);
		while(true)
		{
			sum += input;
			if((sum + input+first_input)>99)break;
			
			System.out.print(" + ");
			input += first_input;
			System.out.print(input);
			
		}
		System.out.print(" = "+(sum));
		
	}
}
