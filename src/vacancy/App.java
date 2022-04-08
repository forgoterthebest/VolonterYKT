package vacancy;
public class App {
	public static void main(String[] args) throws Exception {
		new UI();
	}

	protected static void Register(String mail, String name, String surname, String password) {
		int newID = 0;
		for(int i = 0;i < Users.users.size(); i++) {
			newID++;
		}
		Users.users.add(new UserInfo(newID, name, surname, mail, password));
	}
	protected static void Login(String mail, String password) {
		for(int i = 0; i < Users.users.size();i++) {
			if(Users.users.get(i).getMail() != mail && Users.users.get(i).getPassword() != password) {
				
			}else if(Users.users.get(i).getMail() == mail && Users.users.get(i).getPassword() == password) {
				
			}
		}
	}
}
