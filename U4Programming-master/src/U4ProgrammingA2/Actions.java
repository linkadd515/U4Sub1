package U4ProgrammingA2;

public interface Actions { // this is where methods are called to preform actions

    public void add(); //  adds a player with relvent data such as selected team first name last name, and puts them in the array list

    public void view(); // shows a list of all the players in a team if there is no playeres there it will prompt the user to add some player to the team

    public void remove(); // this will remove a player and thier data

    public void setFirstName(); //  applys the player's first name

    public void setLastName(); // applys the player's last name

    public void setTeam(); // This adds a player to a selected team

    public void addToArrayList(); // This adds a team team to the list of current teams
}
