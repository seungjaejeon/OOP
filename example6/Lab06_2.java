package example6;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;
public class Lab06_2 {
	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);//스캐너
		String filePath = "C:\\Users\\wjstm\\eclipse-workspace\\OOP\\src\\example6\\phonebook.txt";//파일 위치 저장
		BufferedReader reader = new BufferedReader(new FileReader(filePath));//버퍼리더
		HashMap<String, String> book = new HashMap<>();//해쉬맵
		String key;//키
		String number;//번호
		String str;//한 줄
		while((str = reader.readLine()) != null) {//다 읽을 때까지
			String bit[] = str.split(" ");//읽은 한 줄을 띄어쓰기 기준으로 스플릿
				book.put(bit[0], bit[1]);//해쉬맵에 put
				System.out.println("create.");//생성되었음을 나타내는 create
		}
		reader.close();//reader 닫기
		while(true) {//처리
			int type = sc.nextInt();//수행할 작업 입력
			switch(type)
			{
			case 1://found
				key = sc.next();
				if(book.containsKey(key))
				{
					number = book.get(key);
					System.out.println("Name : " + key + ", Phone number : " + number);
				}
				else {
					System.out.println("Not found.");}
				break;
			case 2://update
				key = sc.next();
				number = sc.next();
				if(book.containsKey(key)) {
					book.put(key, number);
					System.out.println("update.");
				}
				else {
					System.out.println("Not found.");
				}
				break;
			case 3://삭제
				key = sc.next();
				if(book.containsKey(key)) {
					book.remove(key);
					System.out.println("delete.");
				}
				else {System.out.println("Not found.");}
					break;
				case -1://종료
					sc.close();
					System.exit(0);
					break;
				default: 
					System.exit(0);
					break;
				}
			}
		}
	catch(Exception e){//예외처리
		System.out.println("File Not found!");
	}
	}
}