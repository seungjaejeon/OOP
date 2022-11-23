package example7;
import java.util.Scanner;

interface Calculation{
	public void area();
}
class Circle implements Calculation{
	int radius;
	public void area() {
		System.out.printf("Circle area:%.2f", Math.PI*radius*radius);
		System.out.println();
	}
}
class Triangle implements Calculation{
	int sideA;
	int sideB;
	int sideC;
	public void area() {
		double s = (double)(sideA+sideB+sideC)/2;
		System.out.printf("Triangle area:%.2f", Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)));
		System.out.println();
	}	
}
class Rectangle implements Calculation{
	int sideA;
	int sideB;
	public void area() {
		System.out.println("Rectangle area:"+ sideA*sideB);
	}
}
public class Lab07_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		Circle cir = new Circle();
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		while(start) {
			int shape = sc.nextInt();
			switch(shape) {
			case 0:
				cir.radius = sc.nextInt();
				cir.area();
				break;
			case 1:
				tri.sideA = sc.nextInt();
				tri.sideB = sc.nextInt();
				tri.sideC = sc.nextInt();
				tri.area();
				break;
			case 2:
				rec.sideA = sc.nextInt();
				rec.sideB = sc.nextInt();
				rec.area();
				break;
			case -1:
				sc.close();
				start = false;
				break;
			}
		}
	}
}

