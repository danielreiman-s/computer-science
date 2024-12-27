
public class Main {

	public static void main(String[] args) {		
		Node<Person> p1 = new Node<Person>(new Person("Someone", "One"));
		Node<Person> p2 = new Node<Person>(new Person("Someone", "Two"));
		Node<Person> p3 = new Node<Person>(new Person("Someone", "Three"));
		
		p1.setNext(p2);
		p2.setNext(p3);
		
		System.out.println(p1.toString());
		System.out.println(insertGuests(p1));
	}
	public static Node<Person> insertGuests(Node<Person> head) {
		Node<Person> newHead = head;
		Node<Person> dummyNewHead = new Node<Person>(null);
		int guestCount = 1;
		
		while (newHead.hasNext()) {
			Node<Person> guest = new Node<Person>(new Person("guest" , String.valueOf(guestCount)));
			dummyNewHead.setNext(guest);
			Node<Person> guestInfo = new Node<Person>(newHead.getValue());

			dummyNewHead.setNext(guestInfo);

			newHead = newHead.getNext();
			guestCount++;
		}
		
		return dummyNewHead.getNext();
	}
}
