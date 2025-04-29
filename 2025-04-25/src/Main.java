
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void ex1A(Flight[] flights, Passenger passenger) {
		int minKM = 0;
		Flight f = null;
		
		int minDistance  = 20_000 - passenger.getKm();
		for (int fIndex = 0; fIndex < flights.length; fIndex++) {
			Flight currentFlightCheck = flights[fIndex];
			
			int flightKM = currentFlightCheck.getKm();
			
			if (flightKM >= minDistance && flightKM < minKM) {
				minKM = flightKM;
				f = currentFlightCheck;
			}
		}
		
		if (f != null) {
			if (getNodeCount(f.getPassengers()) < f.getCapacity()) {
				passenger.setPermPass(true);
				passenger.setKm(passenger.getKm() + minKM);

				f.getPassengers().setNext(new Node<Passenger>(passenger));
			} else {
				f.getWaiting().insert(passenger);
			}
		}
	}
	
	public static int getNodeCount(Node<Passenger> passengers) {
		Node<Passenger> temp = passengers;
		int count = 0;
		
		while (temp.getNext() != null) {
			count++;
			
			temp = temp.getNext();

		}
		
		return count;
	}
	public static void goToLastNode(Node<Passenger> passengers) {
		
		while (passengers.getNext() != null) {
			passengers = passengers.getNext();
		}
		
	}
}
