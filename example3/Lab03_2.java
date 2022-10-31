package example3;

import java.util.Scanner;

public class Lab03_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int credit=0;//학점
		double gpa=0;//GPA
		String name[] = new String[n];//이름 저장할 배열 선언
		subject[][] s = new subject[n][];//클래스 배열 선언
		
		for(int i=0; i<n; i++) {//모든 값 입력받기
			s[i] = new subject[5];//배열 할당
			name[i] = sc.next();//이름 입력받기
			for(int j=0; j<5; j++)//값 모두 입력받기
			{
					String sub_name = sc.next();
					String score = sc.next();
					credit = sc.nextInt();
					s[i][j] = new subject(sub_name, score, credit);
			}
		}
		
		for(int i=0; i<n; i++) {//gpa계산 및 출력
			gpa=0;//초기화
			credit=0;//초기화
			
			for(int j=0; j<5; j++)
			{
				gpa = gpa + s[i][j].show();//성적*학점을 모두 더함
				credit= credit + s[i][j].credit;//학점을 모두 더함
			}
			gpa=gpa/credit;//두 값을 나누고 gpa에 저장
			System.out.printf("Name:%s, GPA:%.2f",name[i],gpa);//출력
			System.out.println();
		}
		
		
	}
}
class subject{
	String name;
	String score;
	int credit;
	double grade;
	private double GPA=0;
	subject(String name, String score, int credit) {//생성자 과목 이름, 성적, 학점
		this.name = name;
		this.credit = credit;
		this.score = score;
		if(this.score.equals("A+"))//성적 점수로 변환하기
		{
			grade = 4.5;
		}else if(this.score.equals("A")) {
			grade = 4;
		}else if(this.score.equals("B+")) {
			grade = 3.5;
		}else if(this.score.equals("B")) {
			grade = 3;
		}else if(this.score.equals("C+")) {
			grade = 2.5;
		}else if(this.score.equals("C")) {
			grade = 2;
		}else if(this.score.equals("D+")) {
			grade = 1.5;
		}else if(this.score.equals("D")) {
			grade = 1;
		}else if(this.score.equals("F")) {
			grade = 0;
		}
	}
	double show() {
		return this.grade*this.credit;//성적과 학점을 곱한것을 반환
	}
}