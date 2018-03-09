package part_05;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class BaseballTeams {

    private String name;
    private String league;
    private char division;
    static int numOfPlayers;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public static int getNumOfPlayers() {
        return numOfPlayers;
    }

    public static void setNumOfPlayers(int numOfPlayers) {
        BaseballTeams.numOfPlayers = numOfPlayers;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}


class TeamConstructor {

    public static void main(String[] args) {

        BaseballTeams blueJays = new BaseballTeams();
        BaseballTeams indians = new BaseballTeams();
        BaseballTeams reds = new BaseballTeams();
        BaseballTeams rockies = new BaseballTeams();

        BaseballTeams[] league = new BaseballTeams[4];
        league[0] = blueJays;
        league[1] = indians;
        league[2] = reds;
        league[3] = rockies;



        blueJays.setName("Blue Jays");
        blueJays.setDivision('E');
        blueJays.setLeague("AL");

        indians.setName("Indians");
        indians.setLeague("AL");
        indians.setDivision('C');

        reds.setName("Red Socks");
        reds.setLeague("NL");
        reds.setDivision('C');

        rockies.setName("Rockies");
        rockies.setLeague("NL");
        rockies.setDivision('W');

        BaseballTeams.numOfPlayers=32;

        for (BaseballTeams team: league) {
            System.out.println("The " + team.getName() + " have " + BaseballTeams.numOfPlayers + " " + "players");
            System.out.println("The " + team.getName() + " are in the " + team.getLeague());
        }




    }

}