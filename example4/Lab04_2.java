package example4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Lab04_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> map = new HashMap<>();
		int n = sc.nextInt();
		HashMap<Integer, Integer> count = new HashMap<>();		
		String[][] input = new String[n][3];
		int[][] list = new int [n][2];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<3; j++)
			{
				input[i][j] = sc.next();
			}
		}
		for(int i=0; i<n; i++)
		{
			list[i][0] = Integer.parseInt(input[i][1]);
			list[i][1] = Integer.parseInt(input[i][2]);
		}
	for(int i=0; i<n; i++)
	{
		if(map.containsKey(list[i][1])) {
			map.put(list[i][1], (double)map.get(list[i][1])+(double)list[i][0]);
			count.put(list[i][1], count.get(list[i][1]) + 1);
			
		}
		else {
			map.put(list[i][1], (double)list[i][0]);
			count.put(list[i][1], 1);
			
		} 
	}	
	for(Integer keys : map.keySet())
		{
			map.put(keys, (map.get(keys)*1.0)/count.get(keys));
		}
	
	Double maxValue = Collections.max(map.values());
	
	for(Integer keys : map.keySet())
	{
		if(map.get(keys).equals(maxValue)) {
			System.out.println(keys);
		}
	}
}
}
