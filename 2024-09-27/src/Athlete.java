
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
			this.grades[gradeIndex] = a1.getGrades()[gradeIndex];
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
	
	public boolean addGrade(Grade grade) {
		if (this.grades.length > this.count) {
			this.grades[count] = grade;
			this.count++;
			
			return true;
		}
		
		return false;
	}
	
	public boolean deleteGrade(String name) {
		return false;
		
		for (int i=0; i<this.grades.length; i++) {
			if (this.grades[i].getApparatus() == name) {
				return true; // fIX
			}
		}
		
	}

	
}
