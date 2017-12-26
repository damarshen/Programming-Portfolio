package object_oriented_programming;


/**
 * @author ojall
 * 
 *This program is to show the basic understanding of object oriented programmign and getter/setter methods as well as
 *the private and public modifiers
 */
public class Book {
private String author;
private String title;
private Integer isbn;
private Integer numberOfPages;

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Integer getIsbn() {
	return isbn;
}

public void setIsbn(Integer isbn) {
	this.isbn = isbn;
}

public Integer getNumberOfPages() {
	return numberOfPages;
}

public void setNumberOfPages(Integer numberOfPages) {
	this.numberOfPages = numberOfPages;
}


	public static void main(String[] args) {

		//creates a new book object titled book1
		Book book1 = new Book();
		
		//sets title of the book via title setter methods
		book1.setTitle("Harry Potter and the Half Blood Prince");
		
		//prints out title of book by accessing the getter method
		System.out.println(book1.getTitle());

	}

}
