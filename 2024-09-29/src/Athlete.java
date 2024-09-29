
public class Athlete {
	private String name;
	private Grade[] grades;
	private int count;
	
	public Athlete(String name, int size) {
		this.name = name;
		this.grades = new Grade[size];
		this.count = 0;
	}

	public Athlete(Athlete a1) {
		this.name = a1.getName();
		this.grades = new Grade[a1.getGrades().length];
		for (int gradeIndex=0;gradeIndex<grades.length;gradeIndex++) {
			Grade[] a1Grades = a1.getGrades();
			this.grades[gradeIndex] = new Grade(a1Grades[gradeIndex]);
		}
		this.count = a1.getCount();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public boolean addGrade(String apparatus, double score) {
		if (this.grades.length > this.count) {
			this.grades[count] = new Grade(apparatus, score);
			this.count++;
			
			return true;
		}
		
		return false;
	}
	
	public boolean deleteGrade(String name) {
		
		for (int i=0; i<this.count; i++) {
			if (this.grades[i].getApparatus().equals(name)) {
				this.grades[i] = null;
				sortNull(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	public void sortNull(int index) {
		if (index >= 0 && index <=count) {
			for (int i=index; i<=this.count; i++) {
				grades[i] = grades[i + 1];
			}
			grades[count - 1] = null;
			count--;
		}
	}
	
	public double average() {
		if (this.count > 0) {
			int sum = 0;
			for (int i = 0; i<= this.count; i++) {
				sum += grades[i].getScore();
			}
			
			return (double) sum / count;
		}
		return -1;
	}
	
	public boolean allGradesAbove(double num) {
		for (int i=0; i<=this.count;i++)
			if (this.grades[i].getScore() < num)
				return false;
		
		return true;
	}
	
	public boolean isBetter(Athlete a2) {
		for (int i=0; i<=this.count; i++) {
			String a1CurrentApparatus = this.grades[i].getApparatus();
			double a1CurrentGrade = this.grades[i].getScore();

			for (int y=0; y<a2.getCount(); y++) {
				String a2CurrentApparatus = a2.getGrades()[y].getApparatus();
				double a2CurrentGrade = a2.getGrades()[y].getScore();

				if (a1CurrentApparatus.equals(a2CurrentApparatus)) {
					if (a1CurrentGrade < a2CurrentGrade) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
