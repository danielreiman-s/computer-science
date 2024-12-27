
public class Person {
	String firstName;
	String lastName;
	
	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}