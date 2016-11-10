/*
	Author Class
	by Javier Reyes
*/

public class Author {

	// Class variables
	private String name;
	private String email;
	private char gender;

	// Class constructors
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	// Class methods
	public String getName() { return this.name; }
	public String getEmail() { return this.email; }
	public char getGender() { return this.gender; }

}