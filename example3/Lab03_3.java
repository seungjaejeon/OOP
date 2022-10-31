package example3;

import java.util.Scanner;

//movie reservation
public class Lab03_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//소비자의 수
		String name;
		int movie;
		int pol;
		customer[] c = new customer[n];//객체 생성
		
		for(int i=0; i<n; i++)
		{
			name = sc.next();
			movie = sc.nextInt();
			pol = sc.nextInt();
			c[i] = new customer(name, movie, pol);//생성자
		}
		for(int i=0; i<n; i++)
		{
			c[i].print();//출력
		}
	}
}
class customer{
	private String name;//소비자 이름
	private int movie;
	private String movie_name;//영화이름
	private int policies;//정책
	private int discount;//할인결과
	public customer(String name, int movie, int policies)//생성자
	{
		this.name = name;
		this.movie = movie;
		this.policies = policies;
	}
	public String whatmovie() {//이름 확인
		switch(this.movie) {
		case 0:
			this.movie_name = "Avatar";
			break;
		case 1:
			this.movie_name = "TopGun";
			break;
		case 2:
			this.movie_name = "Avengers";
			break;
	}
		return this.movie_name;
	}
	
	public int discount() {//할인율 확인
		switch(this.policies)
		{
		case 0:
			this.discount = 12000;
			break;
		case 1:
			this.discount = 12750;
			break;
		case 2:
			this.discount = 13500;
			break;
		case -1:
			this.discount = 15000;
			break;
		}
		return this.discount;
	}
	public void print() {//출력
		System.out.println("Name : " + this.name + ", Movie : " + this.whatmovie()+ ", Price : " + this.discount());
		
	}
}
