package example2;
import java.util.Scanner;
public class Lab02_2 {
    public static void main(String[] args) {
    	//행렬을 2차원 배열로 생각하여 진행
        int[][] arr = new int[100][100];//첫번째 행렬
        int[][] arr2 = new int [100][100];//두번째 행렬
        int[][] arr_result = new int [100][100];//결과 행렬
        int A,B,C,temp=0;//A,B,C,temp 선언
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();//A입력
        B=sc.nextInt();//B입력
        C=sc.nextInt();//C입력
        for(int i=0; i<A; i++) {
        	for(int j=0; j<B; j++)
        		{arr[i][j] = sc.nextInt();//첫번째 행렬 값 입력
            }
        	}
        for(int i=0; i<B; i++) {
        	for(int j=0; j<C; j++)
        		{arr2[i][j] = sc.nextInt();//두번째 행렬 값 입력
            }
        	}
        for(int i=0; i<A; i++) {
        	for(int j=0; j<C; j++) {
        		for(int k=0; k<B; k++)
        		{
        			//결과 행렬은 A*C의 행렬이다. temp에 합을 저장해준다.
        			temp += arr[i][k] * arr2[k][j];
        		}
						arr_result[i][j] = temp;//temp를 저장
						temp = 0;//temp 초기화
        	}
        }
        
        for(int i=0; i<A; i++) {
        	for(int j=0; j<C; j++)
        		{System.out.print(arr_result[i][j]+" ");//결과 행렬 출력
            }System.out.println("");//줄바꿈
        	}
        }
    }