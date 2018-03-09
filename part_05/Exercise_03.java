package part_05;


import java.util.Scanner;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Exercise_03{

    public static void main(String[] args) {
        FlightStatusChecker flightStatusChecker = new FlightStatusChecker();
        Flight flights[] = new Flight[3];
        for (int i = 0; i < flights.length; i++){
            flights[i] = new Flight();
        }

        System.out.println("So.. you bought a plane ticket and you want to check the flight status.");
        System.out.println("But oh oh! you don't remember the flight details");
        System.out.println("No problem, we can print the statuses of all the flights!");
        System.out.println();
        RandomData.generateDelayMessage("Checking status of all flights", 5);
        flightStatusChecker.checkFlightStatus(flights);
        System.out.println();
        System.out.println("You want to check your flight by using the flight number? No problem");
        System.out.println("Lets say your flight Number is " + flights[1].getFlightCode());
        RandomData.generateDelayMessage("Checking status of flight " + flights[1].getFlightCode(), 5);
        System.out.println("It's status is " + flights[1].getStatus());
        System.out.println();
        System.out.println("And if all else fails, you can just check the flight by searching the \n" +
                            "Departure, Destination, Departure time and Arrival time");

        System.out.println( "So lets say you want to find out the status of the flight that goes from \n" +
                            flights[0].getDepartureLocation() + " at " + flights[0].getDepartTime() + " to " +
                            flights[0].getArrivalLocation() + " at " + flights[0].getArrivalTime());
        System.out.println("");
        RandomData.generateDelayMessage("Checking status of such flight", 5);
        System.out.print("Its status is ");
        flightStatusChecker.checkFlightStatus(flights[0].getDepartureLocation(),
                flights[0].getArrivalLocation(),
                flights[0].getDepartTime(),
                flights[0].getDepartTime(),
                flights);


    }

}

class FlightStatusChecker{

    public void checkFlightStatus(Flight[] flights){
        //Shows the status of all flights
        for (Flight x: flights) {
            System.out.println("Flight Number: " + x.getFlightCode() + " | Status : " + x.getStatus());
        }

    }

    public void checkFlightStatus(String flightCode, Flight[] flights){

        int i = 0;
        while(flightCode != flights[i].getFlightCode()){
            i++;
        }

        System.out.println("Flight Number: " + flights[i].getFlightCode() + " | Status : " + flights[i].getStatus());


    }

    public void checkFlightStatus(String departure, String destination, String departureTime, String arrivalTime, Flight[] flights){

        int i = 0;
        while(  departure != flights[i].getDepartureLocation() &&
                departureTime != flights[i].getDepartTime() &&
                arrivalTime != flights[i].getArrivalTime() &&
                destination != flights[i].getArrivalLocation()){
            i++;
        }

        System.out.println("Flight Number: " + flights[i].getFlightCode() + " | Status : " + flights[i].getStatus());
    }






}