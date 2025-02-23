
public class Job {
	int duration;
	String codeWork;
	
	public Job(int duration, String codeWork) {
		this.duration = duration;
		this.codeWork = codeWork;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCodeWork() {
		return codeWork;
	}

	public void setCodeWork(String codeWork) {
		this.codeWork = codeWork;
	}

	public String toString() {
		return "Job [duration=" + duration + ", codeWork=" + codeWork + "]";
	}
	
}
