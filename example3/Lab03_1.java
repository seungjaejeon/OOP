package example3;

import java.util.Scanner;

public class Lab03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] shape = new String[n];
		int[][] length = new int[n][3];
		//값을 모두 입력받기.
		for (int i = 0; i < n; i++) {
			shape[i] = sc.next();//shape
			if (shape[i].equals("triangle")) {//삼각형 입력받기
				for (int j = 0; j < 3; j++) {
					length[i][j] = sc.nextInt();
				}

			} else if (shape[i].equals("rectangle")) {//직사각형 입력받기
				for (int j = 0; j < 2; j++) {
					length[i][j] = sc.nextInt();
				}
			} else if (shape[i].equals("circle")) {//원 입력받기
				length[i][0] = sc.nextInt();
			}	
		}
		int shape_number = sc.nextInt();//input a shape number to print
		switch(shape_number) {
			case 0://triangle
				for(int i=0; i<n; i++)
				{
					if(shape[i].equals("triangle")) {//삼각형일때만 계산 및 출력
						double s = (length[i][0]+length[i][1]+length[i][2])/2;
						double area = Math.sqrt(s*(s-length[i][0])*(s-length[i][1])*(s-length[i][2]));
						System.out.printf("Triangle area:%.2f", area);
						System.out.println();
					}
				}
				break;
			case 1://rectangle
				for(int i=0; i<n; i++)
				{
					if(shape[i].equals("rectangle")) {//직사각형일때만 계산 및 출력
						System.out.printf("Rectangle area:%d", length[i][0]*length[i][1]);
						System.out.println();
					}
				}
				break;
			case 2://circle
				for(int i=0; i<n; i++)
				{
					if(shape[i].equals("circle")) {//원일때만 계산 및 출력
						
						System.out.printf("Circle area:%.2f", Math.PI*length[i][0]*length[i][0]);
						System.out.println();
					}
				}
				break;
			case 3://all shapes
				for(int i=0; i<n; i++)//전체의 도형에 대해 각각 게산후 출력
				{
					if(shape[i].equals("triangle")) {
						double s = (length[i][0]+length[i][1]+length[i][2])/2;
						double area = Math.sqrt(s*(s-length[i][0])*(s-length[i][1])*(s-length[i][2]));
						System.out.printf("Triangle area:%.2f", area);
						System.out.println();
					}
					else if(shape[i].equals("rectangle")) {
						System.out.printf("Rectangle area:%d", length[i][0]*length[i][1]);
						System.out.println();
					}
					else if(shape[i].equals("circle")) {
						System.out.printf("Circle area:%.2f", Math.PI*length[i][0]*length[i][0]);
						System.out.println();
					}
				}
				break;
	}
	}
}
