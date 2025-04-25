package src;

public class Flight {
    private String flightNum;                 // מספר טיסה
    private Node<Passenger> passengers;       // רשימת נוסעים
    private int capacity;                     // קיבולת מקסימלית
    private int km;                           // מרחק טיסה
    private Queue<Passenger> waiting;         // תור ממתינים

    // בונה
    public Flight(String flightNum, int capacity, int km) {
        this.flightNum = flightNum;
        this.capacity = capacity;
        this.km = km;
        this.passengers = null;
        this.waiting = new Queue<>();
    }

    // getters ו-setters
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Node<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Node<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Queue<Passenger> getWaiting() {
        return waiting;
    }

    public void setWaiting(Queue<Passenger> waiting) {
        this.waiting = waiting;
    }
}

