import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static int aboveGrade(double score, Athlete[] athletes) {
		int total = 0;
		
		for (int i=0; i<athletes.length; i++)
			total += athletes[i].average() > score ? 1 : 0;
		
		return total;
	}
}
