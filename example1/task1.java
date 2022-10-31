package example1;

public class Lab01_1 {
		
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);//Unboxing because input will be of type string
		int second = n % 60; //second<60
		int min = n/60 % 60;//min = (n/60)%60
		int hour = n/3600; //min * second < 3600.
		
		System.out.println(hour+":"+min+":"+second); //print result
	}
}
