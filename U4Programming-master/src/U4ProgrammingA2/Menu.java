package U4ProgrammingA2;

import static U4ProgrammingA2.InputFactory.SC;

public class Menu { // This is the main menu interface that is dispalyed to the user.

    private String sInput;

    public Menu() {
        int iInput;
        Player player = new Player();
        Team team = new Team();
        do { // This allwos the user to select an option within the menu. if the number is a decimal then the input will be void.
            System.out.println("Select from the following:\n" + "1. Add Player         \t4. Add Team\n" + "2. View Player       \t5. View Team\n" + "3. Delete Player    \t6. Delete Team\n" + "7. Create Tournament" + "0. Exit\n");
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Whole numbers only");
                InputFactory.SC.next();
            }
            iInput = InputFactory.SC.nextInt();
            if (iInput == 1) { // This is where the user selects an input.
                player.add();
                break;
            } else if (iInput == 2) {
                player.view();
                break;
            } else if (iInput == 3) {
                player.remove();
                break;
            } else if (iInput == 4) {
                team.add();
                break;
            } else if (iInput == 5) {
                team.view();
                break;
            } else if (iInput == 6) {
                team.remove();
                break;
            }
        } while (iInput != 0);
    }

    public static void eventType() {
        int iInput = 4;
        do {
            System.out.println("One event or Five\n" + "1. One Event\n" + "2. Five Events"); // This is where you choose an option for events.
            try  // this will try to take an intiger input if the input is a non intiger it will throw an error and got to the catch lower down and request the data be input again
            {
                iInput = SC.nextInt();
            }
            catch (Exception e){
                System.out.println("Please input a 1 or 2");
                InputFactory.SC.next();
            }
        } 
        while (iInput < 0 || iInput > 2);
        if (iInput != 1) {
            Event.singleOrFiveEvents = 5;
        }
        individualOrTeam();
    }

    public static void individualOrTeam() {
        int iInput = 4;
        do {
            System.out.println("Individual event or Team\n" + "1. Individual\n" + "2. Team");
            try
            {
                iInput = SC.nextInt();
            }
            catch (Exception e){
                System.out.println("Please input a 1 or 2");
                InputFactory.SC.next();
            }
        } 
        while (iInput < 0 || iInput > 2);
        if (iInput != 1) {
            Event.individualOrTeam = 2;
        }
        sportingOrAcademic();
    }

    public static void sportingOrAcademic() {
        int iInput = 4;
        do {
            System.out.println("Sporting or Academic\n" + "1. Sporting\n" + "2. Aacademic");
            try
            {
                iInput = SC.nextInt();
            }
            catch (Exception e){
                System.out.println("Please input a 1 or 2");
                InputFactory.SC.next();
            }
        } 
        while (iInput < 0 || iInput > 2);
        if (iInput != 1) {
            Event.sportingOrAcademic = 2;
        }
    }

    public static String collate() {
        return "";
    }
}
