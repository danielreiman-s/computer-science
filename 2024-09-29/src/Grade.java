
public class Grade {
	private String apparatus;
	private double score;
	
	public Grade(String apparatus, double score) {
		this.apparatus = apparatus;
		if (score <= 26 && score >= 0) {
			this.score = score;
		} else {
			this.score = 0;
		}
	}
	
	public Grade(Grade orignal) {
		this.apparatus = orignal.getApparatus();
		this.score = orignal.getScore();
	}
	
	public String getApparatus() {
		return apparatus;
	}

	public void setApparatus(String apparatus) {
		this.apparatus = apparatus;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
