package pojo;

public class Book {
	private int id;
	private String name, author, subject;
	private float price;
	public Book() {
	}
	
	public Book(int id, String name, String author, String subject, float price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-35s%-20s%-20s%-10.2f", this.id, this.name, this.author, this.subject, this.price );
	}
}
