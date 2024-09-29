import java.util.*;

public class Main {
    public static void main(String[] args) {
        Volcano volcano = new Volcano("Volcano", 10);

        addEX(volcano);
        
        System.out.println("Current Measurements:");
        volcano.print();

        System.out.println("Volcano Name: " + volcano.getName());
        System.out.println("Count of Measurements: " + volcano.getCount());

        System.out.printf("Average Temperature: " + volcano.getAvg());

        int maxUnderValue = 1500;
        int maxIndex = volcano.getMaxUnderIndex(maxUnderValue);
        System.out.println("Max temperature under " + maxUnderValue + " is at index: " + maxIndex);

        System.out.println("Deleting measurement at index 6.");
        volcano.delete(6);
        volcano.print();

        System.out.println("Fixing measurement at index 2 to 1234.");
        volcano.edit(2, 1234);
        volcano.print();

        System.out.println("Deleting all measurements.");
        volcano.deleteAll();
        volcano.print();
    }

    public static void addEX(Volcano innerV) {
        for (int degreeIndex = 0; degreeIndex < 7; degreeIndex++) {
            int randomInt = new Random().nextInt(2000);
            boolean result = innerV.add(randomInt);
            System.out.println(result ? "Degree " + randomInt + " added successfully!" : "Degree not added, there is an error here :(");
        }
    }
}
