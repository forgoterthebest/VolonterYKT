package vacancy;

public class UserInfo {
	protected int id;
	protected String name;
	protected String surname;
	protected String mail;
	protected String password;
	protected UserInfo(int id, String name, String surname, String mail, String password) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.password = password;
	}
	protected String getName() {
		return name + " " + surname;
	}
	protected String getPassword() {
		return password;
	}
	protected int getID() {
		return id;
	}
	protected String getInfo() {
		String info = 
				"Name: "+ name + " " + surname
				+ "\nMail: " + mail;
		return info;
	}
	protected String getMail() {
		return mail;
	}
}