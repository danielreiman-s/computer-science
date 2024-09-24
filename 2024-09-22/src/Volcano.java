public class Volcano {
	private String name;
	private int[] degrees;
	private int count;
	
	public Volcano(String name, int size) {
		this.name = name;
		this.degrees = new int[size];
		this.count = 0;
	}
	
	public Volcano(Volcano original) {
		this.name = original.name;
		this.degrees = new int[original.getDegrees().length];
		this.degrees = original.getDegrees();
		this.count = original.count;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int[] getDegrees() {
		return this.degrees;
	}
	
	public boolean add(int measurmentValue) {		
		if (this.count < this.degrees.length) {
			this.degrees[this.count] = measurmentValue;
			this.count++;
			return true;
		}
		return false;
	}
	
	public void delete(int index) {
		if (index < this.count && index >= 0) {
			this.degrees[index] = 0;
			
			this.count -= index == 0 ? 0 : -1;
		}
		sortZeros(this.degrees);
	}
	
	public void sortZeros(int[] array) {
		int index = 0;
		for (int i=1; i<array.length; i++) {
			if (array[i] != 0) {
				array[index++] = array[i];
			}
		}
		
		while (index < array.length) {
			array[index++] = 0;
		}
	}
	
	public void deleteAll() {
		for (int i = 0; i < this.degrees.length; i++) {
			delete(i);
		}
		
		this.count = 0;
	}
	
	public void edit(int atIndex, int newValue) {
		if (atIndex <= this.degrees.length) {
			this.degrees[atIndex] = newValue;
		}
	}
	
	public double getAvg() {
		int sum = 0;
		
		for (int i=0; i < this.degrees.length; i++) {
			sum += this.degrees[i];
		}
		
		return (double) sum / this.count;
	}
	
	public int getMaxUnderIndex(int value) {
		int max = 0;
		for (int i=0; i<this.degrees.length;i++) {
			for (int y=0; y<this.degrees.length; y++) {
				int currentValue = this.degrees[i];
				
				if (currentValue > value) {
					break;
				}
				
				if (currentValue > this.degrees[y]) {
					max = currentValue;
				}
			}
		}
		
		return max;
	}
	
	public void print() {
		for (int i=0; i<this.degrees.length;i++) {
			System.out.println((i + 1) +") " + this.degrees[i]);
		}
	}
	
	public String toString() {
		return "Count: " + this.count + " | Total Array Length: " + this.degrees.length;
	}
}
