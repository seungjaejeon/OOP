package example6;
import java.io.BufferedReader;
import java.io.FileReader;
//movie reservation
public class Lab06_3 {
		public static void main(String[] args) {
		try{
		String filePath = "C:\\Users\\wjstm\\eclipse-workspace\\OOP\\src\\example6\\reservation.txt";//파일 위치 저장
		BufferedReader reader = new BufferedReader(//버퍼리더
				new FileReader(filePath)
				);
		String str;
		while((str = reader.readLine()) != null) {//읽기가 끝날 때 까지
			String bit[] = str.split(" ");//한줄 띄어쓰기 기준으로 스플릿
			customer c = new customer(bit[0], Integer.parseInt(bit[1]), Integer.parseInt(bit[2]));//객체생성
			c.print();//출력
		}
		reader.close();//버퍼 닫기
		}
	catch(Exception e){//예외처리
		System.out.println("File Not Found.");
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
