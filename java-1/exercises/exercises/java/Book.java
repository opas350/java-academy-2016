/*
	Book Class
	by Javier Reyes
*/

public class Book {

	// Class variables
	private String name;
	private double price;
	private int qty = 0;
	private Author author;

	// Class constructors
	Book(String name, Author author,  double price) {

		this.name = name;
		this.author = author;
		this.price = price;
	}

	Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	// class methods
	public String getName() {return this.name; }
	public String getAuthor() { return this.author.getName(); }
	public double getPrice() { return this.price; }
	public void setPrice(double price) { this.price = price; }
	public int getQty() { return this.qty; }
	public void setQty(int qty) { this.qty = qty; }

	@Override
	public String toString() { return "Book: " + this.name + "\nprice: $" + this.price; }

}