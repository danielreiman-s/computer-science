import java.util.*;

public class Main {

	public static void main(String[] args) {
		ex4();
		
		ex7();
	}
	public static void ex7() {
		Athlete a3 = new Athlete("Athlete 03", 2);
		Athlete a4 = new Athlete("Athlete 04", 2);
		
		Group g1 = new Group("Group 1", 2);
		
		if (g1.addAthlete(a3)) {
            System.out.println("New athlete added successfully to Group 01");
		}
		
		if (g1.addAthlete(a4)) {
            System.out.println("New athlete added successfully to Group 01");
		}
		
		for (Athlete athlete : g1.getAthletes()) {
		    if (athlete != null) {
		        System.out.println("Athlete in group: " + athlete.getName());
		    }
		}

		
		if (g1.addGrade("Athlete 03", "Apparatus 01", 7.7)) {
            System.out.println("Grade added successfully for Athlete 03: Apparatus 01");
        } else {
            System.out.println("Failed to add grade for Athlete 03: Apparatus 01");
        }
		
		if (g1.addGrade("Athlete 03", "Apparatus 02", 9.2)) {
            System.out.println("Grade added successfully for Athlete 03: Apparatus 02");
        } else {
            System.out.println("Failed to add grade for Athlete 03: Apparatus 02");
        }
		
		if (g1.addGrade("Athlete 04", "Apparatus 01", 5.3)) {
            System.out.println("Grade added successfully for Athlete 04: Apparatus 01");
        } else {
            System.out.println("Failed to add grade for Athlete 04: Apparatus 01");
        }
		
		if (g1.addGrade("Athlete 04", "Apparatus 02", 6.0)) {
            System.out.println("Grade added successfully for Athlete 04: Apparatus 02");
        } else {
            System.out.println("Failed to add grade for Athlete 04: Apparatus 02");
        }
		
		if (g1.deleteAthlete("Athlete 03")) {
			System.out.println("Athlete 03 has been successfully removed from Group 01");
		}
		
		String bestAthleteName = g1.getBestAthleteName();
		System.out.println("Best athlete in Group 01 is: " + bestAthleteName);

		int numberOfAthletesAboveGrade = aboveGrade(6.0, g1.getAthletes());
		System.out.println(numberOfAthletesAboveGrade);
	}
	
	public static void ex4() {
		Athlete a1 = new Athlete("Athlete 01", 6);
		Athlete a2 = new Athlete("Athlete 02", 6);
		
        if (a1.addGrade("Parallel Bars", 9.5)) {
            System.out.println("Grade added successfully for Athlete 01: Parallel Bars");
        } else {
            System.out.println("Failed to add grade for Athlete 01: Parallel Bars");
        }
        
        if (a1.addGrade("Vault", 8.7)) {
            System.out.println("Grade added successfully for Athlete 01: Vault");
        } else {
            System.out.println("Failed to add grade for Athlete 01: Vault");
        }

        if (a1.addGrade("Floor Exercise", 9.0)) {
            System.out.println("Grade added successfully for Athlete 01: Floor Exercise");
        } else {
            System.out.println("Failed to add grade for Athlete 01: Floor Exercise");
        }
        
        if (a1.addGrade("Rings", 8.9)) {
            System.out.println("Grade added successfully for Athlete 01: Rings");
        } else {
            System.out.println("Failed to add grade for Athlete 01: Rings");
        }
        
        if (a1.addGrade("High Bar", 9.1)) {
            System.out.println("Grade added successfully for Athlete 01: High Bar");
        } else {
            System.out.println("Failed to add grade for Athlete 01: High Bar");
        }

        if (a1.addGrade("Pommel Horse", 8.8)) {
            System.out.println("Grade added successfully for Athlete 01: Pommel Horse");
        } else {
            System.out.println("Failed to add grade for Athlete 01: Pommel Horse");
        }

        if (a2.addGrade("Parallel Bars", 9.3)) {
            System.out.println("Grade added successfully for Athlete 02: Parallel Bars");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Parallel Bars");
        }

        if (a2.addGrade("Vault", 8.5)) {
            System.out.println("Grade added successfully for Athlete 02: Vault");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Vault");
        }

        if (a2.addGrade("Floor Exercise", 9.2)) {
            System.out.println("Grade added successfully for Athlete 02: Floor Exercise");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Floor Exercise");
        }

        if (a2.addGrade("Rings", 8.8)) {
            System.out.println("Grade added successfully for Athlete 02: Rings");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Rings");
        }

        if (a2.addGrade("Uneven Bars", 9.0)) {
            System.out.println("Grade added successfully for Athlete 02: Uneven Bars");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Uneven Bars");
        }

        if (a2.addGrade("Balance Beam", 8.7)) {
            System.out.println("Grade added successfully for Athlete 02: Balance Beam");
        } else {
            System.out.println("Failed to add grade for Athlete 02: Balance Beam");
        }
        
        boolean isA1BetterThanA2 = a1.isBetter(a2);
        
        if (isA1BetterThanA2) {
        	System.out.println("Athlete 01 is better than Athlete 02");
        } else {
        	System.out.println("Athlete 02 is better than Athlete 01");
        }
       
        System.out.println(a1.getName() + " Average: " + a1.average());
        System.out.println(a2.getName() + " Average: " + a2.average());
                
        a2.deleteGrade("Vault");
        a2.deleteGrade("Floor Exercise");

        boolean allAboveA1 = a1.allGradesAbove(8);
        System.out.println("All grades for a1above 8.0: " + allAboveA1);
        boolean allAboveA2 = a2.allGradesAbove(8);
        System.out.println("All grades for a2 above 8.0: " + allAboveA2);
        
        Athlete[] athletesCopy = new Athlete[2];
        
        athletesCopy[0] = new Athlete(a1);
        athletesCopy[1] = new Athlete(a2);
        
        double avgGrade = 6.0;
        int athletesAboveAvg = aboveGrade(avgGrade, athletesCopy);
        System.out.println("Number of athletes above the average grade: " + athletesAboveAvg);
	}
	
	public static int aboveGrade(double score, Athlete[] athletes) {
		int total = 0;
		
		for (int i=0; i<athletes.length; i++)
			total += athletes[i] != null ? (athletes[i].average() > score ? 1 : 0) : 0;
		
		return total;
	}
	
	public static boolean hasAthleteWithAvgAbove(Group group, double score) {
		for (int athleteIndex = 0; athleteIndex < group.getCount(); athleteIndex++) {
			if (group.getAthletes()[athleteIndex].average() > score) {
				return true;
			}
		}
		
		return false;
	}
}
