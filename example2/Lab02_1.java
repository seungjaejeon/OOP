package example2;
import java.io.*;
class Lab02_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String input = br.readLine();//입력받기
		int n_count = 0;//숫자 카운트를 위한 변수
		int e_count = 0;//영어 카운트를 위한 변수
		if (input.length() <= 8 && input.length()>=2) //길이 비교
		{
			for(int i=0; i<input.length();i++)//input의 길이만큼 반복
				{
				if(Character.getNumericValue(input.charAt(i))>=0 && Character.getNumericValue(input.charAt(i))<=9)//각자리마다 만약 그 숫자가 0~9사이라면
				{
					n_count++;//숫자 카운트 1 증가
				}
				else {e_count++;}//아니라면 영어 카운트 1 증가
				}
			if (n_count > 0 && e_count > 0)//두 카운트가 모두 0보다 클 경우에 
			{
				System.out.println("Valid password");//맞다는 메시지 출력
			}
			else {System.out.println("Invalid password");//그 외의 상황에서 틀렸다는 메시지 출력
			
			}
		}
		else {System.out.println("Invalid password");}//길이 조건에 부합할경우 틀렸다는 메시지 출력
	}
}