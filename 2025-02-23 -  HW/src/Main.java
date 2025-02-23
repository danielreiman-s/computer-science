
public class Main {

	public static void main(String[] args) {
		Queue<Job> queue = new Queue<Job>();
        
        queue.insert(new Job(120, "WorkA"));
        queue.insert(new Job(150, "WorkB"));
        queue.insert(new Job(200, "WorkC"));
        queue.insert(new Job(90, "WorkD"));

        enoughTime(queue, 30 * 60);
	}

	public static void enoughTime(Queue<Job> jobs, int totalTime) {
		int currentTime = 0;
		jobs.insert(null);
		while (jobs.head() != null) {
			Job currentJob = jobs.remove();
			
			if (currentTime + currentJob.getDuration() < totalTime) {
				currentTime += currentJob.getDuration();
				
				System.out.println(currentJob.codeWork);
			}
			
			jobs.insert(currentJob);
		}
		jobs.remove();
	}
	
}
