package mobilePhone;
import java.util.*;

public class MobilePhone {
	ArrayList<Contacts> list = new ArrayList<Contacts>();
	public void printContacts(){
		for(int i=0;i<list.size();i++){
			Contacts c = list.get(i);
			System.out.println("Name:"+c.getName()+"Number"+c.getNumber());
		}
	}
	public void addContact(Contacts c){
		list.add(c);
		System.out.println("Contact"+c.getName()+" "+c.getNumber()+"is added to the directory");
	}

	public void updateContact(Contacts c){
		for(Contacts d:list){
			if(d.getName().equals(c.getName())){
				d.setName(c.getName());
				d.setNumber(c.getNumber());
			}
		}
		System.out.println("Contact"+c.getName()+c.getNumber()+"is updated successfully");
	}

	public void deleteContact(Contacts c){
		int position = getIndex(c);
		if(position!=-1)
			list.remove(position);
	}

	public boolean findName(String name){
		for(Contacts c:list){
			if(c.getName().equals(name)) return true;
		}
		return false;
	}

	public boolean find(Contacts c){
		for(Contacts d:list){
			if(d.getName().equals(c.getName()))
				if(d.getNumber().equals(c.getNumber())) return true;
		}
		return false;
	}

	public int getIndex(Contacts c){
		for(int i=0;i<list.size();i++){
			if(c.getName().equals(list.get(i).getName()) && c.getNumber().equals(list.get(i).getNumber()))
				return i;
		}
		return -1;
	}
}
