
public class Main {

	public static void main(String[] args) {
		int[] array = {9, 10, 100, 120};
		System.out.println(ex14(array, 2, 0));
		System.out.println(ex15(array, 2, 0));
		System.out.println(ex16(array, 2, 0));
		System.out.println(ex17(array, 0));
		System.out.println(ex18(array, 0));

	}
	
	public static boolean isPrime (int num, int d) {
		if (d < 2 || num % d == 0) {
			return false;
		}
		
		if (d * d > num) {
			return true;
		}
		
		return isPrime(num, d+1);
	}
	
	public static int ex14(int[] array, int i, int currentI) {
		if (currentI <= i) {
			return ex14(array, i,currentI + 1) + array[currentI];
		} else {
			return 0;
		}
	}
	
	public static int ex15(int[] array, int i, int currentI) {
		if (currentI > i) {
			return 0;
		}
		
		if (array[currentI] >= 0) {
			return ex15(array, i,currentI + 1) + 1;
		} else {
			return ex15(array, i,currentI + 1);
		}
	}
	
	public static int ex16(int[] array, int num, int currentI) {
		if (array[currentI] == num) {
			return currentI;
		}
		
		if (array.length > currentI + 1) {
			return ex16(array, num, currentI + 1);
		} else {
			return -1;
		}
	}
	
	public static boolean ex17(int[] array, int currentI) {
		if (array.length > (currentI + 1)) {
			if (array[currentI] > array[currentI + 1]) {
				return false;
			}
			
			return ex17(array, currentI + 1);
		} else if (array.length == currentI + 1){
			return true;
		}
		
		return false;
	}
	
	public static boolean ex18(int[] array, int currentI) {
		if (!isPrime(array[currentI], 2)) {
			return true;
		}
		
		if (currentI == array.length - 1) {
			return false;
		}
		
		return ex18(array, currentI + 1);
	}
}
