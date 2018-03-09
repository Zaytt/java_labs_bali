package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;
        // Get the current second within the minute within the hour
        int secondsWithinHour = (int)(totalSeconds % 3600);
        int currentSecond = secondsWithinHour % 60;
        // Get total minutes
        long totalMinutes = totalSeconds/60;
        // Get the current minute in the hour
        int currentMinute = (int)(totalMinutes % 60);
        // Get the total hours
        long totalHours = totalMinutes/60;
        // Get the current hour
        //This is the current hour in GMT
        int gmtTime = (int)(totalHours%24);

        //Apply the timezone difference
        int currentHour = gmtTime + (int)timeZoneChange;

        //This is the hour int the desired time zone keeping it in a 24 hour
        currentHour = (currentHour < 0) ? 24-Math.abs(currentHour) : currentHour;


        //Create a string to show "+" in the time when positive time zone adjustment
        String timeZ = (timeZoneChange > 0 ) ? "+"+timeZoneChange : ""+timeZoneChange;

        // Display results using a 12 hour clock, include AM or PM
        System.out.print("Time in GMT" + timeZ + " : " );

        //AM or PM
        String ampm = (currentHour/12 > 0) ? "P.M." : "A.M.";

        System.out.println(zeroFormat(currentHour%12) + ":" + zeroFormat(currentMinute )+ ":" +
                zeroFormat(currentSecond) +" " + ampm);

    }

    //Just adds a zero before de hour if it is less than 2 digits.
    public static String zeroFormat(int time){
        String newTime = (time < 10 ) ? "0"+time : ""+time;
        return newTime;
    }
}
