package Week8ArrayList;

import java.util.ArrayList;
import java.util.List;

class Book{
	int bookId;
	String bookName;
	double price;
	
	Book(int bookId,String bookName,double price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	
	void displayDetails() {
		System.out.println("Book-Id is:"+bookId);
		System.out.println("Book-Name is:"+bookName);
		System.out.println("Book-Price is:"+price);
	}
}
public class BookManagmentSystem {
	public static void main(String[] args) {
		List<Book> li = new ArrayList<>();
		Book b1 = new Book(101, "Java", 499);
		Book b2 = new Book(102,"Python", 399);
		Book b3 = new Book(103,"SQL", 299);
		Book b4 = new Book(104,"C++", 599);
		
		li.add(b1);
		li.add(b2);
		li.add(b3);
		li.add(b4);
		
		int quantity = li.size();
		for(int i=0;i<quantity;i++) {
			li.get(i).displayDetails();
			System.out.println("******");
		}
		
		for(int j=0;j<quantity-1;j++) {
			for(int k=0;k<quantity-1;k++) {
				if(li.get(k).price>li.get(k+1).price) {
					Book temp = li.get(k);
					li.set(k, li.get(k+1));
					li.set(k+1, temp);
				}
			}
		}
		System.out.println("After sorting ");
		for(Book b:li) {
			b.displayDetails();
			System.out.println("*-*-*-*");
		}
		for(int w = li.size() - 1; w >= 0; w--) {
			if(li.get(w).bookId==102)
			li.remove(w);
		}
		
		
		System.out.println("After Removing Book ID 102");
		for(Book g:li) {
			g.displayDetails();
		}
		
		System.out.println("5.	Update price of one book ");
		for(int u=0;u<li.size();u++) {
			if(li.get(u).bookName.equals("SQL")) {
				 li.get(u).price = 349;
			}
		}
		for(Book t:li) {
			t.displayDetails();
		}
		
		System.out.println("Search book by name :");
		for(int a=0;a<li.size();a++) {
			if(li.get(a).bookName.contains("Java")) {
				System.out.println("Book found");
			}
		}
//		final list 
		for(Book fb:li) {
			fb.displayDetails();
		}
//for(Book b:li) {
//	b.displayDetails();
//}
		
	}
}
