package example1;

public class Lab01_2 {
	public static void prime(int n) //determining prime number
	{
		if (n == 2) { //if n=2, n is prime number. so we print n
			System.out.println(n);
			return; //end
		}
		for (int i=2; i < n; i++) //i=2 ~ i=n-1
		{
			if(n % i ==0) { //if there is an i by which n is divided, n is not prime number
				prime(n-1); //it does not print n and recursively returns to n-1.
				return;
			}
		}
		//if there isn't i by which n is divided, n is prime number
		System.out.println(n); //so we print n
		prime(n-1);//recursively with n-1.
	}
	//main
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //Unboxing because input will be of type string
		prime(n); //function call
		
	}
}
