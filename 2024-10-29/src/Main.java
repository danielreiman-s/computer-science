
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ex3(4));
		System.out.println(ex4(4));
		System.out.println(ex5(20, 5));
		System.out.println(ex6(3, 20));
		System.out.println(ex7(20, 3));
		System.out.println(ex9(200, 0, 0));
	}
	
	public static int ex3(int n) {
		if (n == 0) {
			return 1;
		}
		
		if (n % 2 != 0) {
			return ex3(n - 1) * n;
		}
		
		return ex3(n - 1);
	}
	
	public static int ex4(int n) {
		if (n == 0) {
			return 0;
		}
		
		return ex4(n / 10) + 1;
	}
	
	public static int ex5(int numOne, int numTwo) {
		
		if (numOne == 0) {
			return 0;
		}
		
		numOne -= numTwo;
		
		return ex5(numOne, numTwo) + 1;
	}
	
	public static int ex6(int numOne, int numTwo) {
		if (numOne > numTwo) {
			return numTwo;
		}
				
		return ex6(numOne, numTwo - numOne);
	}
	
	public static boolean ex7(int x, int y) {
		if (x==0) {
			return true;
		}
		
		if (x < y) {
			return false;
		}
				
		return ex7(x - y, y);
	}
	
	public static void ex8() {
		// Question
	}
	
	public static boolean ex9(int num, int countEven, int countOdd) {
		if (num == 0) {
			return (countEven >= 1 && countOdd == 0) || (countOdd >= 1 && countEven == 0);
		}
		
		if ((num % 10) % 2 == 0) {
			return ex9(num / 10, countEven + 1, countOdd);
		} else {
			return ex9(num / 10, countEven, countOdd + 1);
		}
	}
}
