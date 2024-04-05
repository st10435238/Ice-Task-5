
public class Student {


	private int _ID;
	private String _name;
	private String _surname;
	private String _userName;
	private String _password;
	
	public Student (int ID, String name, String surname , String username , String password){
		this._ID = ID;
		this._name = name;
		this._surname = surname; 
		this._userName = username;
		this._password = password; 
	}
	public int getID() {
		return _ID;
	}
	public void setID(int ID) {
		this._ID = ID;
	}
		
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	
	public 	String getSurname() {
        return _surname;
    }
	public void setSurname(String surname) {
		this._surname = surname;
	}
	
	public String getUserName() {
		return _userName;
	}
	public void setUserName(String username) {
		this._userName = username;
	}
	
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		this._password = password;
	}
	public void OutputDetails() {
	
		System.out.println("Name: " + this.getName());
	    System.out.println("Surname: " + this.getSurname());
	    System.out.println("ID: " + this.getID());
	    System.out.println("Username: " + this.getUserName());
	    System.out.println("Password: " + this.getPassword());
	}
}

