package U4ProgrammingA2;

import java.util.Iterator;

public class Team extends Player implements Actions {

    Player player = new Player();

    public void teamPlayer(String firstName, String lastName, String teamName) { // this allows for the vairables contained within to be used by other classes like the team class.
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    @Override
    public void setFirstName() { // This is overriding the current data store for setFirstName and is updating it with the information from the Team class.
        player.setFirstName();
    }

    @Override
    public void setLastName() { // This is overriding the current data store for setLastFirstName and is updating it with the information from the Team class.
        player.setLastName();
    }

    @Override
    public void setTeam() {
        System.out.println("Enter team name"); // This is taking the team name from a user input via a scanner
        this.teamName = InputFactory.SC.next();
    }

    @Override
    public void add() {
        while (ShortStore.listTeam.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void addToArrayList() {
        String deats = (player.firstName + "\t" + player.lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void view() {  // This displays the stored teams. If there isn't any teams stored then it will prompt the user.
        if (ShortStore.listTeam.isEmpty()) {
            System.out.println("You have no teams");
        }
        for (Iterator<String> iterator = ShortStore.listPlayer.iterator(); iterator.hasNext(); ) {
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove() { // It removes a stored player.
        ShortStore.listPlayer.clear();
    }
}
