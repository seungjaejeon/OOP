package example7;
import java.util.ArrayList;
import java.util.Scanner;
interface PublicTransportMethod{
	public void riding(Passenger p);
	public void quit(Passenger p);
	public void passengersInfo();
}
class Passenger{
	private String name;
	
	public Passenger(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}
}
class Subway implements PublicTransportMethod{
	ArrayList<String> subway = new ArrayList<>();//리스트 생성
	public void riding(Passenger p) {//리스트에 추가
		subway.add(p.getName());
	}
	public void quit(Passenger p) {//리스트에서 삭제
		subway.remove(p.getName());
	}
	public void passengersInfo() {//출력
		System.out.println("##Subway##");
		System.out.println("Number of passenger : "+ subway.size());
		for(int i=0; i<subway.size(); i++)
			System.out.println(subway.get(i));
	}

}
class Bus implements PublicTransportMethod{
	ArrayList<String> bus = new ArrayList<>();//리스트 생성
	public void riding(Passenger p) {//리스트에 추가
		bus.add(p.getName());
	}
	public void quit(Passenger p) {//리스트에서 삭제
		bus.remove(p.getName());
	}
	public void passengersInfo() {//출력
		System.out.println("##Bus##");
		System.out.println("Number of passenger : "+ bus.size());
		for(int i=0; i<bus.size(); i++)
			System.out.println(bus.get(i));
	}
}

public class Lab07_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		Bus bus = new Bus();
		Subway sub = new Subway();
		while(start) {
			Passenger pas = new Passenger(sc.next());//객체생성
			int method;
			if(pas.getName().equals("-1")) {
				sub.passengersInfo();
				bus.passengersInfo();
				start = false;
				break;//반복문 탈출
				}
			int transport = sc.nextInt();//교통수단 입력받기
			if(transport == 0) {//지하철이용
				method = sc.nextInt();
				if(method == 0) {//탑승
					sub.riding(pas);
				}
				else if(method==1) {//하차
					sub.quit(pas);
				}
			}
			else if(transport == 1) {//버스이용
				method = sc.nextInt();
				if(method == 0) {//탑승
					bus.riding(pas);
				}
				else if(method==1) {//하차
					bus.quit(pas);
				}
			}
			
		}
		sc.close();//스캐너 닫기
	}
}
