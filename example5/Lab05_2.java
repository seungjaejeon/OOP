package example5;
import java.util.ArrayList;
import java.util.Scanner;

class LoginSystem{
	private ArrayList<User> users = new ArrayList<>();
	
	public void create(User user) throws Exception {
		if (this.isValid(user)) {
			users.add(user);
			System.out.println("Create success.");
		}
		else
			throw new Exception();
	}
	
	public boolean isValid(User user) {
		boolean check=true;
		int d_count=0;
		int n_count=0;
		
		if (user.getPassword().length() > 8 || user.getPassword().length() < 2)
		{
			check = false;
		}
		for(int i=0; i<user.getPassword().length(); i++) {
			if(Character.isDigit(user.getPassword().charAt(i))) 
			{
				d_count++;
			}else n_count++;
		}
		if (d_count==0 || n_count==0) {
			check = false;
		}
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUsername().equals(user.getUsername())) {
				check = false;
				}
		}
		
		return check;
	}
}
	class User{
		private String username;
		private String password;
		
		public User(String username, String password){
			this.username=username;
			this.password=password;
		}
		
		public String getUsername() {
			return this.username;
		}
		public String getPassword() {
			return this.password;
		}
	}


	public class Lab05_2 {
		
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			LoginSystem ls = new LoginSystem();
			
			for(int i=0; i<n; i++) {
				try {
					String username = sc.next();
					String password = sc.next();
					
					ls.create(new User(username, password));
				}catch(Exception e) {	
					System.out.println("Create fail");
				}
			}
			sc.close();
		}
	

}	
