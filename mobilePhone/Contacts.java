package mobilePhone;

public class Contacts {
	private String name;
	private String number;
	public Contacts(String name, String number){
		this.name = name;
		this.number = number;
	}
	public Contacts() {

	}
	public String getName(){
		return this.name;
	}
	public String getNumber(){
		return this.number;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setNumber(String number){
		this.number = number;
	}
}
