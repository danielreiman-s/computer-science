
public class Main {

	public static void main(String[] args) {	
		// Exercise 2
		Node<Person> p1 = new Node<Person>(new Person("Someone", "One"));
		Node<Person> p2 = new Node<Person>(new Person("Someone", "Two"));
		Node<Person> p3 = new Node<Person>(new Person("Someone", "Three"));
		
		p1.setNext(p2);
		p2.setNext(p3);
		
		// Exercise 3 + 4
		System.out.println("Before insertGuests: " + p1.toString());
		System.out.println("After insertGuests: " + insertGuests(p1));
	}
	public static Node<Person> insertGuests(Node<Person> head) {
		Node<Person> newHead = head;
		Node<Person> dummyNewHead = new Node<Person>(null); // Exercise 5 using a dummy Node
		Node<Person> current = dummyNewHead;
		int guestCount = 1;
		
		while (newHead != null) {
			Node<Person> guest = new Node<Person>(new Person("guest" , "g" + String.valueOf(guestCount)));
			current.setNext(guest);
		
			current = current.getNext();
			
			Node<Person> guestInfo = new Node<Person>(newHead.getValue());
			current.setNext(guestInfo);
			current = current.getNext();

			newHead = newHead.getNext();
			guestCount++;
		}
		
		return dummyNewHead.getNext();
	}
}
