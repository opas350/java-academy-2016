/*
	Test Class
	by Javier Reyes
*/

class TestBook {

	public static void main(String[] args) {

		// Objects initializations
		Author author = new Author("Baldor", "1234@msn.com", 'm');
		Book algebra = new Book("Algebra", author, 99.99);

		// Testing the object methods
		System.out.println("Book: " + algebra.getName());
		System.out.println("Author: " + algebra.getAuthor());
		System.out.println("Price: $" + algebra.getPrice());
		System.out.println("Qty: " + algebra.getQty());
		// Changing price
		algebra.setPrice(150.99);
		System.out.println("New price: $" + algebra.getPrice());
		System.out.println("\ntoString Method: \n" + algebra.toString());
	}

	// The diagram didn't show method implementations for the Author class, that 
	// could result that the class variables won't be accessible for the class TestBook or Book
	// without some implementation like the one shown on getAuthor() on Book class.
	// one way to fix this is by the inheritance property, in which the Book class inherits the 
	// class variables and methods from author.
}

