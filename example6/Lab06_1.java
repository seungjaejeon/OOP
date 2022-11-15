package example6;
import java.io.BufferedReader;
import java.io.FileReader;
public class Lab06_1 {
public static void main(String[] args) {
		try {
			String filePath = "C:\\Users\\wjstm\\eclipse-workspace\\OOP\\src\\example6\\arithmetic.txt";//파일 경로 저장
			   BufferedReader reader = new BufferedReader(//객체 생성
			            new FileReader(filePath)
			        );
			        String str;
			        while ((str = reader.readLine()) != null) {//파일을 전부 읽을 때 까지
			            System.out.print(str);//읽은 한 줄 출력
			            String[] bit = str.split(" ");//한 줄을 띄어쓰기 기준으로 스플릿
			            int a = Integer.parseInt(bit[0]);//a에 첫번째 값 저장
			            int b = Integer.parseInt(bit[2]);//b에 두번째 값 저장
			            if(bit[1].equals("+")) {//+일때 더하기 연산
			            	System.out.println(" = " + (a+b));
			            }
			            else if(bit[1].equals("*")) {// 곱하기 연산
			            	System.out.println(" = " + (a*b));
			            }
			            else if(bit[1].equals("/")) {// 나누기 연산
			            	System.out.printf(" = %.2f" ,((double)a/(double)b));
			            	System.out.println();
			            }
			            else if(bit[1].equals("-")) {//-연산
			            	System.out.println(" = " + (a-b));
			            }
			        }
			 
			        reader.close();//reader 닫기
		}
		catch(Exception e) {//예외처리
			System.out.println("File Not found!");
		}
		
}
	
}
