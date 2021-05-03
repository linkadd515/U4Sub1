package U4ProgrammingA2;

import java.util.Iterator;

public class Player implements Actions { //This adds a player to an individual team with their First and Last names and adds them together for a team name

    protected String firstName;

    protected String lastName;

    protected String teamName;

    int count = 0;

    public void player(String firstName, String lastName) { // This implements the variables from the Actions class and allows for the users to input data.
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public void setFirstName() { // Allows the user to input a player's first name
        System.out.println("Enter first name"); 
        this.firstName = InputFactory.SC.next();
    }

    @Override
    public void setLastName() { // Allows the user to input a player's last name
        System.out.println("Enter last name"); 
        this.lastName = InputFactory.SC.next();
    }

    @Override
    public void setTeam() { // This sets the team name.
        this.teamName = firstName + lastName; 
    }

    @Override
    public void addToArrayList() { // This adds the data to an array.
        String deats = (firstName + "\t" + lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void add() { // This requests the first name last name and set team methods then adds them to the array list.
        while (ShortStore.listPlayer.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void view() {
        if (ShortStore.listPlayer.isEmpty()) {
            System.out.println("Add players first");
        }
        System.out.println("list" + ShortStore.listPlayer);
        Iterator itr = ShortStore.listPlayer.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void remove() {
        ShortStore.listPlayer.clear();
    }
}
