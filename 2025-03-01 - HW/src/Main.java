// Version 01
public class Main {

	public static void main(String[] args) {

	}
	
	public static boolean ex1(int sum, Queue<Integer> q) {
		q.insert(null);
		boolean result = false;
		while (q.head() != null) {
			int x = q.remove();
			if (hasPairSum(x, sum, q)) {
				result = true;
			}
			q.insert(x + 1);
		}
		return result;
	}

	public static boolean hasPairSum(int num, int sum, Queue<Integer> q) {
		q.insert(null);
		boolean result = false;

		while (q.head() != null) {
			int x = q.remove();
			if (x + num == sum) {
				result = true;
			}
			q.insert(x);
		}
		
		q.remove();

		return result;
	}


}

// Version 2
public class Main {

  public static void main(String[] args) {
    Queue<Integer> q = new Queue<Integer>();
    q.insert(1);
    q.insert(2);
    q.insert(3);
    q.insert(4);

    System.out.println(q);

    System.out.println(ex1(10, q));

    System.out.println(q);
  }

  public static boolean ex1(int sum, Queue<Integer> q) {
    boolean result = false;
    Queue<Integer> tempQueue = new Queue<>();
    
    while (!q.isEmpty()) {
      int x = q.remove();
      
      if (hasPairSum(x, sum, q)) {
        result = true;
      }
      
      tempQueue.insert(x);
    }
    
    while (!tempQueue.isEmpty()) {
      q.insert(tempQueue.remove());
    }
    
    return result;
  }

  public static boolean hasPairSum(int num, int sum, Queue<Integer> q) {
    Queue<Integer> tempQueue = new Queue<>();
    boolean result = false;
    
    while (!q.isEmpty()) {
      int x = q.remove();
      
      if (x + num == sum) {
        result = true;
      }
      
      tempQueue.insert(x);
    }
    
    while (!tempQueue.isEmpty()) {
      q.insert(tempQueue.remove());
    }
    
    return result;
  }
}

