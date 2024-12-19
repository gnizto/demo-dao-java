package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department d = new Department(1, "Books");
		System.out.println(d);
		
		Seller s = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, d);
		
		System.out.println(s);
	}

}
