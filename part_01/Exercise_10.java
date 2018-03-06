package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {
        double timeHours = secondsToHours(minutesToSeconds(30, 30));
        double miles = kmToMiles(12);

        System.out.println("The runner avg speed in miles/hr is");
        System.out.println(miles/timeHours);
    }

    public static int minutesToSeconds(int minutes){
        return minutes * 60;
    }

    public static int minutesToSeconds(int minutes, int seconds){
        return (minutes * 60) + seconds;
    }

    public static double secondsToHours(int seconds){
        return (double)seconds/3600;
    }

    public static double kmToMiles(int km){
        return km / 1.609;
    }
}

