package example2;
import java.util.Scanner;

class Lab02_3 {
	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			String input = new String(sc.nextLine()); //입력받기(Hex or Bin)
			int dec_value = 0;//decimal_value 선언
			int remain = 0;//remain 선언 (나머지가 들어감)
			char remain_char;//아스키코드를 사용할 캐릭터형 변수 선언
			String result = ""; //결과를 저장할 result문자열 선언
			if (input.equals("Bin")) {//입력값이 Bin과 같을 경우
				dec_value = sc.nextInt();//dec_value에 다음 값 입력받아 저장
				System.out.println("Decimal : "+dec_value);//입력받은 dec_value값 출력해줌
				while(true) {//계산
					if(dec_value%2 == 1)//나머지가 1일 경우
						{result="1"+result;//결과 문자열에 1을 앞으로 추가
						dec_value=(dec_value-1)/2;//dec_value에 2로 나눈 값을 저장						
						}
					else {//나머지가 0일 경우
						result="0"+result;//0을 결과 문자열 앞에 추가해줌
						dec_value = dec_value/2;}//dec_value에 2로 나눈 값을 저장
					if(dec_value==0) break;//반복하다가 dec_value가 0이 되는 순간에 무한루프 탈출
				}
				System.out.println("Binary : "+result);//결과 출력
			}
			else if (input.equals("Hex"))//입력값이 Hex와 같은 경우
			{
				dec_value = sc.nextInt();//dec_value에 값 저장
				System.out.println("Decimal : "+dec_value);//입력받은 dec_value값 출력해줌
				while(true) {
					remain = dec_value%16;//remain에 16으로 나눈 나머지 저장
					dec_value = dec_value / 16;//dec_value 16으로 나눔
					if (remain > 9)//remain값이 9보다 클경우 
					{
						
						remain_char = (char) (remain+55);//아스키코드 A가 숫자 65이므로 remain에 55를 더한 값을 문자형으로 변환한다.
					}
					
					else {
						remain_char = (char) (remain+48);//아스키코드 0이 숫자 48이므로 remain에 48을 더한 값을 문자형으로 변환한다.
					}
					result = remain_char + result;//결과 문자열 앞에 문자를 합쳐준다.
					if (dec_value==0) break;//dec_value가 0이되면 무한루프 탈출
				}
				System.out.println("Hexadecimal : "+result);//결과 출력
			}
		}
	}
}