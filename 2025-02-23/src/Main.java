
public class Main {

	public static void main(String[] args) {
		Queue<Time> queue = new Queue<Time>();
		queue.insert(new Time(02, 00, 00));
		queue.insert(new Time(04, 10, 00));
		queue.insert(new Time(04, 20, 00));
		queue.insert(new Time(05, 30, 00));

//		System.out.println(ex2A(queue).toString());
//		System.out.println("STATUS: " + queue.toString());
//
//		reverseQueue(queue); 
//		System.out.println("STATUS: " + queue.toString());
		
		int x = ex2B(queue);
		System.out.println(x + " " + (x + 1));
	}
	
	public static void reverseQueue(Queue<Time> q) {
		q.insert(null);
		
		while (q.head() != null) {
			Time time = q.remove();
			q.insert(time);
		}
		
		q.remove();
	}
	
	public static Time ex2A(Queue<Time> q) {
		q.insert(null);
		
		Time first = q.remove();
		q.insert(first);
		
		Time last = null;
		
		while (q.head() != null) {
			last = q.remove();
			q.insert(last);
		}
		
		q.remove();
		
		
		Time result = differenceAsTime(first, last);
		
		return result;
	
	}
	
	public static Time differenceAsTime(Time t1, Time t2) {
		int firstInSeconds = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
		int lastInSeconds = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();
		
		int resultInSeconds = lastInSeconds - firstInSeconds;
		Time result = new Time(resultInSeconds / 3600, (resultInSeconds % 3600) / 60, resultInSeconds % 60);
		
		return result;
	}
	
	public static int differenceAsSeconds(Time t1, Time t2) {
		int firstInSeconds = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
		int lastInSeconds = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();
		
		int resultInSeconds = lastInSeconds - firstInSeconds;
		
		return resultInSeconds;
	}
	
	public static int ex2B(Queue<Time> q) {
		int index = 1;
		int resultIndex = index;

		q.insert(null);
		
		Time current = null;
		Time previous = null;
		int minSeconds = 0;
		
		while (q.head() != null) {			
			current = q.remove();
			
			if (previous != null) {
				if (differenceAsSeconds(current, previous) < minSeconds) {
					minSeconds = differenceAsSeconds(current, previous);
					resultIndex = index;
				}
			}
			
			previous = current;
			index++;
		}
		
		q.remove();
		return resultIndex;
	}
}
