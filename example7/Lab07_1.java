package example7;

import java.util.Scanner;

public class Lab07_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KB kb = new KB();
		IBK ibk = new IBK();
		NH nh = new NH();
		boolean start = true;
		while(start) {
			switch(sc.nextInt()) {
			case 0:
				int method = sc.nextInt();
				if(method==0) {
					kb.deposit(sc.nextInt());
				}
				else if(method==1) {
					kb.withdraw(sc.nextInt());
				}
				break;
			case 1:
				method = sc.nextInt();
				if(method==0) {
					ibk.deposit(sc.nextInt());
				}
				else if(method==1) {
					ibk.withdraw(sc.nextInt());
				}
				break;
			case 2:
				method = sc.nextInt();
				if(method==0) {
					nh.deposit(sc.nextInt());
				}
				else if(method==1) {
					nh.withdraw(sc.nextInt());
				}
				break;
			case -1:
				kb.info();
				ibk.info();
				nh.info();
				sc.close();
				start = false;
				break;
			}
				
			}
		}
	}
interface BankFunc{
	public void withdraw(int money);
	public void deposit(int money);
	public void info();
}
class KB implements BankFunc{
	int balance = 0;
	public void deposit(int money) {
		if(balance-money<0) {
			System.out.println("lack of balance.");
			return;
		}
		balance -= money;
	}
	public void withdraw(int money) {
		balance += money;
	}
	public void info() {
		System.out.println("Bank name : KB, balance : " + balance);
	}
}


class IBK implements BankFunc{
	int balance = 0;
	public void deposit(int money) {
		if(balance-money<0) {
			System.out.println("lack of balance.");
			return;
		}
		balance -= money;
	}
	public void withdraw(int money) {
		balance += money;
	}
	public void info() {
		System.out.println("Bank name : IBK, balance : " + balance);
	}
}


class NH implements BankFunc{
	int balance = 0;
	public void deposit(int money) {
		if(balance-money<0) {
			System.out.println("lack of balance.");
			return;
		}
		balance -= money;
	}
	public void withdraw(int money) {
		balance += money;
	}
	public void info() {
		System.out.println("Bank name : NH, balance : " + balance);
	}
}


