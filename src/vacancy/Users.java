package vacancy;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;

public class Users {
	protected static String e;
	static ArrayList<UserInfo> users = new ArrayList<>();
	static boolean isCrashed = false;
	protected static void Init() throws Exception {
		try {
			Scanner usersData = new Scanner(new File("src/vacancy/usersDatabase.txt"));
			while(usersData.hasNextLine()) {
				users.add(new UserInfo(usersData.nextInt(), usersData.next(), usersData.next(), usersData.next(), usersData.next()));
			}
		}catch(Exception e) {
			throwMessage("Something went wrong.\nError message: " + e.getMessage());
			isCrashed = true;
		}finally {
			isCrashed = false;
		}
	}
	protected static int getIdByName(String name) throws Exception {
		boolean alreadyFind = false;
		int n = 0;
		try {
			while(alreadyFind == true) {
				int i = 0;
				if(users.get(i).getName() == name) { 
					n = users.get(i).getID();
					alreadyFind = true;
				}
			}
			throwMessage("User with name \"" + name +"\" has ID: ");
			return n;
		}catch(Exception e) {
			throwMessage("User with this name doesn't exists. Error: " );
			isCrashed = true;
			return 404;
		} finally{
			
		}
	}
	protected static void writeUsersIntoFile() throws Exception {
		try {
			PrintStream ps = new PrintStream("src/vacancy/usersDatabase.txt");
			for(int i = 0; i<users.size(); i++) {
				int id = users.get(i).getID();
				String name = users.get(i).getName();
				String mail = users.get(i).getMail();
				String password = users.get(i).getPassword();
				ps.println(id+ " " +name+" "+mail+" "+password);
		}ps.close();
		} catch(Exception e) {
			throwMessage("Overwriting finished with result: fail.\nError message: " + e.getMessage());
		}finally {
			throwMessage("Overwriting finished with result: success");
		}
	}
	protected static void throwMessage(String e) {
		Users.e = e;
	}
	protected static String getMessage() {
		return e;
	}
}