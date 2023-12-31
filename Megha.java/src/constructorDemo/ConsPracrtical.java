package constructorDemo;

import java.util.Scanner;

//Encapsulation -> Wrapping up data into single unit
class User {
	private int id;
	private String name;
	private long contact;

	User() {

	}

	User(int id, String name, long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public void setId(int Id) {        //to set a details
		this.id = id; 				  // paramitter and class data same declar for this key
	}

	public int getId() {
		return id;
	}

	public void setName(String name) { 			//name function string name
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public String toString() { 			
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
}
}
public class ConsPracrtical {			
	public static void main(String[] args) {
		User u2 = new User(1, "java", 98654321);
		System.out.println(u2);
		User u3 = new User(2, "selenium", 98654321);
		System.out.println(u3);
		
		
		
		
		
		/*
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter id : "); int
		 id = sc.nextInt();
		 System.out.println("enter name : "); 
		 String name =sc.next(); 
		 User u1 = new User();
		 u1.setId(id);                  // u1.id=13; u1.setName(name);
		 System.out.println(u1.getId()); 
		 System.out.println(u1.getName());
		 User u2 = new User(1, "java", 98654321);
		*/
	}
}
