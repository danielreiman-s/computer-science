
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
