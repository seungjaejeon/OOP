package example1;

public class Lab01_3 {
	public static void main(String[] args) {
		String number = args[0]; //store args[0] in number
		palindrome (number, 0, number.length()-1);//function call 
		return;
	}
	//function of determine palindrome (string, index1, index2)
	public static Object palindrome (String number, int p, int q)
	{
		int n = Integer.parseInt(number); //Unboxing because input will be of type string
		String nextnumber = Integer.toString(n-1); //store n-1 in nextnumber to recursion
		if (n==0) {return 0;} //if n=0, recursive function ends
		else {
			//if the two numbers are equal
			if (number.charAt(p)==number.charAt(q))
			{
				if (p == q)//odd number
				{
					System.out.println(number); //palindrome is true. so print that number
					return palindrome(nextnumber, 0, nextnumber.length()-1); //recursion nextnumber
					
				}
				else if (p-q == 1)//even number
				{
					System.out.println(number); //palindrome is true. so print that number
					return palindrome(nextnumber, 0, nextnumber.length()-1); //recursion nextnumber
					
				}
				else { //not finished yet
					return palindrome(number, p+1, q-1); //go to next index
				}
			}
			//if the two numbers are different
			else { 
				//Recursive immediately to the next number
				return palindrome(nextnumber, 0, nextnumber.length() - 1);
			}
		}
	}
}
