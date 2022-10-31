package example4;
import java.util.HashMap;
import java.util.Scanner;
public class Lab04_4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		HashMap<String, String> book = new HashMap<>();
		int type = sc.nextInt();
		System.out.println(book);
		switch(type)
		{
		case 0:
			String key = sc.next();
			String number = sc.next();
			if(book.containsKey(key))
			{
				System.out.println("Already exist name");
			}
			else {
				book.put(key, number);
				System.out.println("create.");
			}
			break;
		case 1:
			key = sc.next();
			if(book.containsKey(key))
			{
				number = book.get(key);
				System.out.println("Name : " + key + ", Phone number : " + number);
			}
			else {System.out.println("Not found.");}
			break;
		case 2:
			key = sc.next();
			number = sc.next();
			if(book.containsKey(key)) {
				book.put(key, number);
				System.out.println("update");
			}
			else {
				System.out.println("Not found.");
			}
			break;
		case 3:
			key = sc.next();
			if(book.containsKey(key)) {
				book.remove(key);
				System.out.println("delete.");
			}
			else {System.out.println("Not found.");}
			break;
		case -1:
			System.exit(0);
			break;
		}
	}
	}
}