public class StartGame {

    public static DungeonWorld dungeonworld = new DungeonWorld();
    public static Quests quests = new Quests();

    public void StartingGame() {
        int playerHp = 25;
        int playerDam = (int)(Math.random()*2 + 1);

        int playerHplvl2 = 30;
        int playerDamlvl2 = (int)(Math.random()*4 + 1);

        int playerHplvl3 = 40;
        int playerDamlvl3 = (int)(Math.random()*6 + 1);

        int dragon = 50;

        //Welcome screen
        //Your Project Good Luck :)
        System.out.println("Welcome Christopher Sanchez's project"
                + "\n*******************************");
        System.out.println("* Welcome to the world program*");
        System.out.println("*******************************");

        //Starting Menu
        System.out.println("\nWould you like to start?"
                + "\nType yes if you want to start");

        String play = dungeonworld.userInput.nextLine();
        if (play.equals("yes")){


            //maingame loop is put in as a variable so that way it can be played many different times
            //I removed the maingame boolean variable as it just resulted to always true anyway.
            while(true){

                //This is where we put in the first decision of the game that add many different quests
                QuestChoice();

                //Players decision on where to go
                int citydecisions = dungeonworld.userInput.nextInt();
                if(citydecisions == 1){
                    quests.QuestDecision(playerHp);
                }if(citydecisions == 2){
                    quests.BarQuest(playerHp, playerDam, playerHplvl2, playerDamlvl2, playerHplvl3, playerDamlvl3, dragon);
                }else{
                    System.out.print("\nThat is not an option\n\n");
                }


            }//end maingame loop
        }//end start
        else if (play.equals("no")) {
            System.exit(0);
        }
        else{
            System.out.println("An incorrect answer has been entered please try again");
            System.exit(0);
        }
    }

    public void QuestChoice() {
        System.out.print ("You are in the center of a bustling medieval city\n"
                + "There are guards covered in iron armor and equipped with spears at every corner and lookind oddly anxious\n"
                + "there is a bar nearby filled with adventurers who love to tell their epic tales and exploits\n"
                + "(press the number corresponding with each decision)\n"
                + "Would you like to \n"
                + "1.interact with the guards?\n"
                + "2.Go to the bar?\n");
    }
}
