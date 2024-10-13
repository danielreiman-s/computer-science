
public class Group {
	String name;
	Athlete[] athletes;
	int count;
	
	public Group(String name, int size) {
		this.name = name;
		this.athletes = new Athlete[size];
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Athlete[] getAthletes() {
		return athletes;
	}


	public void setAthletes(Athlete[] athletes) {
		this.athletes = athletes;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean addAthlete(Athlete a) {
		if (count < athletes.length) {
			this.athletes[count] = new Athlete(a);
			count++;
			return true;
		}
		
		return false;
	}
	
	public boolean deleteAthlete(String name) {
		
		for (int i=0; i<this.athletes.length;i++) {
			if (athletes[i] != null) {
				if (athletes[i].getName().equals(name)) {
					athletes[i] = null;
					
					sortNull(i);
					
					this.count--;
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void sortNull(int index) {
		if (index >= 0 && index <=count) {
			for (int i=index; i<this.count - 1; i++) {
				athletes[i] = athletes[i + 1];
			}
			athletes[count - 1] = null;
			count--;
		}
	}
	
	public String getBestAthleteName() {
		Athlete bestAthlete = athletes[0];
		
		for (int athleteIndex = 1; athleteIndex < athletes.length; athleteIndex++) {
			if (this.athletes[athleteIndex] != null) {
				if (athletes[athleteIndex].average() > bestAthlete.average()) {
					bestAthlete = athletes[athleteIndex];
				}
			}
 		}
		
		return bestAthlete.getName();
	}
	
	public boolean addGrade(String athleteName, String apparatus, double score) {
		Athlete a = null;
		
		for (int athleteIndex = 0; athleteIndex < athletes.length; athleteIndex++) {
			if (athletes[athleteIndex] != null && athletes[athleteIndex].getName().equals(athleteName)) {
				a = athletes[athleteIndex];
				break;
			}
		}
		
		return a != null ? a.addGrade(apparatus, score) : false;
	}
}
