package part_05;

import java.util.Random;
import java.util.Scanner;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class FlightBooker{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FlightBooker booker = new FlightBooker();

        System.out.println("Welcome to NomadAir!");
        int option;
        do{
            System.out.println("Menu:");
            System.out.println("1. Reserve a flight.");
            System.out.println("2. Check flight status.");
            System.out.println("3. Exit");
            System.out.print(">> ");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    Flight flight = new Flight();
                    if(booker.reserveFlight(flight) == 3)
                        return;

                case 2:
                    System.out.println("Sorry, feature not yet available. ");
                    break;
                case 3:
                    return;
            }

        }while(option!= 1 );

    }

    public int reserveFlight(Flight flight){
        //Set the flight object departure
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your departure location: ");
        String departureLoc = scanner.nextLine();
        flight.setDepartureLocation(departureLoc);

        //Set the flight object destination
        System.out.print("Now, enter a destination:             ");
        String destination = scanner.nextLine();
        flight.setArrivalLocation(destination);

        RandomData.generateDelayMessage("Scanning", 10);

        //Set flight details using booker
        flight.setFlightCode(RandomData.generateRandomFlightCode());
        int hourDepart = RandomData.generateRandomHour();
        int hourArrive = RandomData.generateRandomHour(hourDepart);
        flight.setDepartTime(hourDepart + ":" + RandomData.generateRandomMinute());
        flight.setArrivalTime(hourArrive + ":" + RandomData.generateRandomMinute());
        flight.setPrice(RandomData.generateRandomPrice());
        System.out.println();

        //SHOW FLIGHT DETAILS TO USER
        System.out.println("We've found a flight for you!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(flight.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        //SHOW MENU TO USER TO BOOK FLIGHT OR GO BACK
        int option;
        //do{
            System.out.println("1. Book flight");
            System.out.println("2. Return to main menu.");
            System.out.print(">> ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    return bookFlight(flight);

                case 2:
                    return -1;
            }

        //}while(option != 1 || option!= 2);

        return -1;
    }

    public int bookFlight(Flight flight){
        RandomData.generateDelayMessage("Booking", 10);
        Scanner scanner = new Scanner(System.in);
        flight.setPrice((int)(flight.getPrice()*1.25));
        System.out.println("----------- WARNING ----------");
        System.out.println("          PRICE UPDATE ");
        System.out.println("------------------------------");
        System.out.println( "This flight is in high demand! \n" +
                            "Its price has risen to $" + flight.getPrice());
        System.out.println();
        int option;
        //do{
            System.out.println("1. Submissively agree with the price change and book anyway.");
            System.out.println("2. Hell nawh!(Return to menu)");
            System.out.print(">> ");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Congratulations you just booked an overpriced ticket!");
                    System.out.println("Thank you for your money!");
                    System.out.println("Enjoy your flight!");
                    break;
                case 2:
                    System.out.println("As you wish, we're the only airline around here anyway...");
                    System.out.println("See you soon ;)");
                    break;
            }
            return 3;
        //} while(option != 1 || option != 2);
    }





}

class Flight{

    private String flightCode;
    private String departureLocation;
    private String arrivalLocation;
    private String departTime;
    private String arrivalTime;
    private int price;
    private String status;


    //Constructor is used to generate a random flight
    public Flight() {
        this.flightCode = RandomData.generateRandomFlightCode();
        this.departureLocation = RandomData.generateRandomCity();
        this.arrivalLocation = RandomData.generateRandomCity(this.getDepartureLocation());
        int hour = RandomData.generateRandomHour();
        int hour2 = RandomData.generateRandomHour(hour);
        int minute = RandomData.generateRandomMinute();
        this.departTime = RandomData.formatHour(hour, minute);
        this.arrivalTime = RandomData.formatHour(hour2, minute);;
        this.price = RandomData.generateRandomPrice();
        this.status = RandomData.generateRandomStatus();
    }

    @Override
    public String toString() {
        return "Flight " + this.flightCode + "\n" +
                "Departure:   " +  this.departureLocation + " at " + departTime + "\n" +
                "Destination: " + this.getArrivalLocation() + " at " + arrivalTime + "\n" +
                "Price: $"+ this.getPrice();

    }


    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class RandomData{

    public static String generateRandomFlightCode(){

        String code = "";
        Random r = new Random();
        int value = r.nextInt(91-64) + 64;
        char letter1 =  (char)value;
        code += letter1;

        value = r.nextInt(91-64) + 64;
        char letter2 =  (char)value;
        code += letter2;
        int number = value = r.nextInt(10000-1000) + 1000;

        code += number;
        return code;

    }

    public static int generateRandomHour(){
        Random r = new Random();
        int hour = r.nextInt(24-0);
        return hour;
    }

    public static int generateRandomHour(int departureTime){
        Random r = new Random();
        int hour = r.nextInt(24-departureTime)+departureTime;
        return hour;
    }


    public static int generateRandomMinute(){
        Random r = new Random();
        int minute = r.nextInt(60-0);
        return minute;
    }

    public static String formatHour(int hour, int minutes){
        return hour+":"+minutes;
    }

    public static int generateRandomPrice(){
        Random r = new Random();
        int price = r.nextInt(1500-99)+50;
        return price;
    }

    public static String generateRandomCity(){
        Random r = new Random();
        int cityCode = r.nextInt(11-0);
        String city;
        switch (cityCode){
            case 1:
                city = "Mexico City";
                break;
            case 2:
                city = "Montreal";
                break;
            case 3:
                city = "Denpasar";
                break;
            case 4:
                city = "Los Angeles";
                break;
            case 5:
                city = "Tokyo";
                break;
            case 6:
                city = "Moscow";
                break;
            case 7:
                city = "New York City";
                break;
            case 8:
                city = "Rio de Janeiro";
                break;
            case 9:
                city = "Buenos Aires";
                break;
            case 10:
                city = "Cape Town";
                break;
            default:
                city = "Mexico City";
                break;
        }

        return city;
    }

    public static String generateRandomCity(String otherCity) {
        Random r = new Random();
        int cityCode;
        String city;
        do {
            cityCode = r.nextInt(11 - 0);

            switch (cityCode) {
                case 1:
                    city = "Mexico City";
                    break;
                case 2:
                    city = "Montreal";
                    break;
                case 3:
                    city = "Denpasar";
                    break;
                case 4:
                    city = "Los Angeles";
                    break;
                case 5:
                    city = "Tokyo";
                    break;
                case 6:
                    city = "Moscow";
                    break;
                case 7:
                    city = "New York City";
                    break;
                case 8:
                    city = "Rio de Janeiro";
                    break;
                case 9:
                    city = "Buenos Aires";
                    break;
                case 10:
                    city = "Cape Town";
                    break;
                default:
                    city = "Mexico City";
                    break;
            }
        } while (city == otherCity);

        return city;
    }

    public static String generateRandomStatus(){
        Random r = new Random();
        String statusString;
        int status = r.nextInt(4 - 0);
        switch (status){
            case 1:
                statusString = "On Time";
                break;
            case 2:
                statusString = "Delayed";
                break;
            case 3:
                statusString = "Cancelled";
                break;
            default:
                statusString = "On Time";
                break;
        }

        return statusString;
    }

    public static void generateDelayMessage(String message, int loops){
        System.out.print(message+" ");
        int counter = 0;
        while(counter < loops){
            try {
                Thread.sleep(300);
                System.out.print(". ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
        System.out.println();
        System.out.println();
    }
}




