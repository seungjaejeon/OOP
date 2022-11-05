package example5;
import java.util.Scanner;

class Bank{
	private int balance=0;
	
	public void withdraw(int money) throws Exception {
		if(this.balance-money<0)
			throw new Exception();
		else{
			this.balance -= money;
		}
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void printBalance() {
		System.out.println("Balance: "+this.balance);
	}
}
public class Lab05_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		int type = sc.nextInt();
		
		while(type != -1) {
			try {
				if(type==0) {
					int money = sc.nextInt();
					bank.deposit(money);
				}
				else if(type==1) {
					int money = sc.nextInt();
					bank.withdraw(money);
				}
				else if(type==2) {
					bank.printBalance();
				}
				type = sc.nextInt();
			}catch(Exception ex) {
				System.out.println("lack of balance");
				type = sc.nextInt();
			}
		}
		sc.close();
	}
}
