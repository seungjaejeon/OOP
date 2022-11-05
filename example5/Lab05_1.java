package example5;
import java.util.HashMap;
import java.util.Scanner;
class PhoneBook{
	private HashMap<String, String> people = new HashMap<>();

	public void create(String name, String phoneNumber) throws Exception {
		String pNumber = people.get(name);
		if(pNumber==null) {
			people.put(name, phoneNumber);
			System.out.println("create.");
		}
		else
			throw new Exception();
	}

	public void read(String name) throws Exception {
		String phoneNumber = people.get(name);
		if(phoneNumber!= null)
			System.out.println("Name : "+name+", Phone number : "+phoneNumber);
		else
			throw new Exception();
	}

	public void update(String name, String phoneNumber) throws Exception {
		String pNumber = people.get(name);
		if(pNumber!=null) {
			people.put(name, phoneNumber);
			System.out.println("update.");
		}
		else
			throw new Exception();
	}

	public void delete(String name) throws Exception {
		String phoneNumber = people.get(name);
		if(phoneNumber!= null) {
			people.remove(name);
			System.out.println("delete.");
		}
		else
			throw new Exception();
	}
}
public class Lab05_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBook phoneBook = new PhoneBook();
		
		int type = sc.nextInt();
		
		while(type!=-1) {
			try {
				if(type==0) {
					String name = sc.next();
					String phoneNumber = sc.next();
					phoneBook.create(name, phoneNumber);
				}
				else if(type==1) {
					String name = sc.next();
					phoneBook.read(name);
				}
				else if(type==2) {
					String name = sc.next();
					String phoneNumber = sc.next();
					phoneBook.update(name, phoneNumber);
				}
				else if(type==3) {
					String name = sc.next();
					phoneBook.delete(name);
				}
				type = sc.nextInt();
			}catch(Exception e) {
				if(type==0){
					System.out.println("Already exist name.");
					}
					else if(type==1||type==2||type==3)
					{System.out.println("Not found.");}
					type = sc.nextInt();
			}
		}	
		sc.close();
	}
}


