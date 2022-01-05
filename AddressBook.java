package com.bridgelab.addressbook;
import java.util.*;


public class AddressBook {

	public static void main(String[] args) {
	System.out.println("welcome to address book");
	Person arrayOne=new Person("Akshata", "Hasabi", "Yaragatti", "Bangalore", "Karnatak", 591129, 1234567891, "akshata@gmail.com");
	Person arrayTwo=new Person("Vinayak", "Rajaput", "Savadatti", "Bangalore", "Karnatak", 591126, 987235456, "vinayak@gmail.com");
	Person arrayThree=new Person();
	arrayThree.setFirstName("Basavaraj");
	arrayThree.setLastName("Hasabi");
	arrayThree.setAddress("Dharwad");
	arrayThree.setCity("Bangalore");
	arrayThree.setState("Karnataka");
	arrayThree.setZip(12345);
	arrayThree.setPhoneNumber(456851136);
	
	//creating array list
	ArrayList<Person> list=new ArrayList<Person>();
	
	//adding persons details into the list
	list.add(arrayOne);
	list.add(arrayTwo);
	
	//add new persons details
	
	list.add(arrayThree);
	
	//printing the array elements
	for(Person elements : list) {
		System.out.println("Print the Array:"+ elements);
	}
	System.out.print("After adding the persons contacts:"+list);
  }
}
