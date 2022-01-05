package com.bridgelab.addressbook;
import java.util.*;


public class AddressBook {

	public static void main(String[] args) {
	System.out.println("welcome to address book");
	Person arrayOne=new Person("Akshata", "Hasabi", "Yaragatti", "Bangalore", "Karnatak", 591129, 1234567891, "akshata@gmail.com");
	Person arrayTwo=new Person("Vinayak", "Rajaput", "Savadatti", "Bangalore", "Karnatak", 591126, 987235456, "vinayak@gmail.com");
	
	//creating array list
	ArrayList<Person> list=new ArrayList<Person>();
	
	//adding persons details into the list
	list.add(arrayOne);
	list.add(arrayTwo);
	
	//printing the array elements
	for(Person elements : list) {
		System.out.println("Print the Array:"+ elements);
	}	
  }
}
