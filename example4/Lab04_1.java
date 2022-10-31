package example4;

import java.util.HashMap;
import java.util.Scanner;

public class Lab04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hash = new HashMap<>();
		String[] arr = new String[10];
		int count = 0;
		for(int i=0; i<10; i++)
		{
			arr[i] = sc.next();
		}
		for(int i=0; i<10; i++) {
			if(hash.containsKey(arr[i])) {
				count = hash.get(arr[i]);
				hash.put(arr[i], count + 1);
			}
			else hash.put(arr[i], 1);
		}
		for(String key : hash.keySet()) {
			if(hash.get(key).equals(count+1)) {
				if(count+1>5) {
					System.out.println(key);
					break;
				}else {
					System.out.println("There is no the number that is more than half.");
					break;
					}
			}
		}
	}
}
