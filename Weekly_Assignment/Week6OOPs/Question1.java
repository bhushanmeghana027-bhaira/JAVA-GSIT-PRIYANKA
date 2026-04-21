package Week6OOPs;
class Book{
	String title,author;
	static String libraryName ="City library";
	final int ISBN=12345;
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	void setTitle(String title) {
		this.title=title;
	}
	String getTitle() {
		return title;
	}
	void display() {
		System.out.println(this.title+":"+this.author);
	}
	void getDescription() {
		System.out.println("this is a physical book");
	}
	static void showLibrary() {
		System.out.println(libraryName);
	}
}
class EBook extends Book{
	String fileSize;
	
	EBook(String title,String author,String fileSize){
		super(title, author);
		this.fileSize=fileSize;
	}
	void display() {
		System.out.println(this.title+":"+this.author+this.fileSize);
	}
	void getDescription() {
		
		System.out.println("this is a electronic book");
	}
}
public class Question1 {
	public static void main(String[] args) {
		
	
//	question1
	EBook e1 = new EBook("Atomic Habbits","James Clear","5MB");
	e1.display();
	
//	question2 
	e1.getDescription();
	
//	question 3
	EBook.showLibrary();
	
//	question 4 
//	e1.ISBN=2654;
	
//	question 5
	e1.setTitle("Java Programming");
	String titleName = e1.getTitle();
	System.out.println(titleName.toUpperCase());
	System.out.println(titleName.length());
	System.out.println(titleName.contains("Java"));
	
	
	
}
}
