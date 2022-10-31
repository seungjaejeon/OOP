package example4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Lab04_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String[][] arr = new String[n][5];
		HashMap<String, Double> Math= new HashMap<>();
		HashMap<String, Double> Science = new HashMap<>();
		HashMap<String, Double> English = new HashMap<>();
		HashMap<String, Integer> counter = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<5; j++)
			{
				arr[i][j] = sc.next();
			}
		}
		for(int i=0; i<n; i++)
		{
			if(Math.containsKey(arr[i][1])) {
				Math.put(arr[i][1], (double)Math.get(arr[i][1])+(double)Integer.parseInt(arr[i][2]));
				Science.put(arr[i][1], (double)Science.get(arr[i][1])+(double)Integer.parseInt(arr[i][3]));
				English.put(arr[i][1], (double)English.get(arr[i][1])+(double)Integer.parseInt(arr[i][4]));
				counter.put(arr[i][1], counter.get(arr[i][1]));
				
			}
			else {
			Math.put(arr[i][1], (double) Integer.parseInt(arr[i][2]));
			Science.put(arr[i][1], (double) Integer.parseInt(arr[i][3]));
			English.put(arr[i][1], (double) Integer.parseInt(arr[i][4]));
			counter.put(arr[i][1], 1);
			}
		}
		int sub = sc.nextInt();
		switch(sub) {
		case 0:
			for(String keys: Math.keySet()) {
				Math.put(keys, (1.0*Math.get(keys))/counter.get(keys));
				Double maxValue =  Collections.max(Math.values());
				if(Math.get(keys).equals(maxValue)) {
					System.out.println(keys);
				}
			}
			break;
		case 1:
			for(String keys: Science.keySet()) {
				Science.put(keys, (1.0*Science.get(keys))/counter.get(keys));
				Double maxValue =  Collections.max(Science.values());
				if(Science.get(keys).equals(maxValue)) {
					System.out.println(keys);
				}
			}
			break;
		case 2:
			for(String keys: English.keySet()) {
				English.put(keys, (1.0*English.get(keys))/counter.get(keys));
				Double maxValue =  Collections.max(English.values());
				if(English.get(keys).equals(maxValue)) {
					System.out.println(keys);
				}
			}
			break;
		}
	}
}
