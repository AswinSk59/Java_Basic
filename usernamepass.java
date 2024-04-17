import java.util.Scanner;
import java.lang.Exception;
class usernameexception extends Exception{
	usernameexception(String msg){
		System.out.println(msg);
	}
}
class passwordexception extends Exception{
	passwordexception(String msg){
		System.out.println(msg);
	}
}
public class usernamepass{
	public static void main(String args[]){
		Scanner reader=new Scanner(System.in);
		String username,password;
		System.out.println("Enter username");
		username=reader.nextLine();
		System.out.println("Enter password");
		password=reader.nextLine();
		int len=username.length();
		try{
			if(len<8)
				throw new usernameexception("Username must be greater than 8 characters");
			else if(!password.equals("admin"))
				throw new passwordexception("Incorrect password");
			else
				System.out.println("Login successfull");
		}
		catch(usernameexception u){
			System.out.println(u);
		}
		catch(passwordexception p){
			System.out.println(p);
		}
	}
}
