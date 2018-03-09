package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class SoccerLeague{

    String name;

    public static void main(String[] args) {

        SoccerLeague league = new SoccerLeague();
        Team leonTeam = league.createTeam("Leon F.C.", "Leon, Mexico");
        leonTeam.hireNewPlayer("Luis Montes", "Midfielder", 10, false);

    }

    public Team createTeam(String name, String city){
        Team team = new Team();
        team.setName(name);
        team.setCity(city);
        System.out.println("Creating new team");
        System.out.println("Team name is : " + team.getName() + " from " + team.getCity());
        return team;
    }

    public static void setTeamRecord(Team team, int wins, int loses, int ties){

        team.setLoses(loses);
        team.setTies(ties);
        team.setWins(wins);

        System.out.println("Team " + team.getName() + " has " + team + " wins, "
                + loses + " loses and " + ties + "ties");

    }


}

class Team{
    private String name;
    private String city;
    private int wins, loses, ties;

    public Player hireNewPlayer(String name, String position, int number, boolean injured){
        Player player = new Player();
        player.setName(name);
        player.setPosition(position);
        player.setInjured(injured);
        player.setNumber(number);
        System.out.println(this.name + " just hired a new player!\nHis name is " + name + " and is a " + position + ". " +
                "\nHe will be using the number " + number + " on his back.");
        return player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
}

class Player{
    private String name;
    private String position;
    private int number;
    private boolean isInjured;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }
}
