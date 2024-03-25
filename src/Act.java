public class Act {

    public static DungeonWorld dungeonworld = new DungeonWorld();

    public static void PotionChoice() {
        System.out.println("You see that the bandit has many vials arounds them of 2 colors\npurple and pink\n"
                +"Which vial do you grab?\n1.purple\n2.pink");

    }

    public static void PurplePotion() {
        System.out.println("\nYou grab the purple potion\nWho do you give it to?\n1.the guards\n2.the bandit");
        int purplepotion = dungeonworld.userInput.nextInt();
        if(purplepotion==1){//give purple potion to guards
            System.out.println("You give the purple potion to the guard and\n"
                    +"you see him fall into an even deeper sleep\nit seems that was the sleeping potion");
        }//end purplepotion guard
        else {//start purple potion bandit
            System.out.println("\nYou grab the bandit in order to pour it down their throat and he falls asleep\n"
                    + "You wait for the guards to wake up and they arrest the bandit"
                    + "\nCONGRATULATIONS\nYOU WON\nYOU GOT THE GUARDIAN ENDING\n\n\n\n\n"
                    + "RESTARTING");


            int end = 1;
            if (end == 1) {//replay game
                System.exit(0);
            }//end replay game
        }
    }

    public static void PinkPotion() {
        //ask the user what will they do with the purple potion
        System.out.println("You run past the bandit while grabbing the pink potion\n"
                +"Who would you like to give it to\n1.the bandit\n2.the guards");
        int pinkPot = dungeonworld.userInput.nextInt();


        if(pinkPot==1){//tell what will happen if the user gives the pink potion to the bandit
            System.out.println("\nYou grab the bandit in order to pour it down their throat\n"
                    +"You pour the potion down the bandits throat and you see that it does nothing\n"
                    +"It seems that potion was the awakening potion");
        }//end telling what will happen if the user gives the pink potion to the bandit


        else{//start pink potion guards
            System.out.println("You run over to one of the guards to give them the potion\n"
                    +"The guard then arrests the bandit\nCONGRATULATIONS\nYOU WON\nYOU GOT THE ARRESTED ENDING\n"
                    +"RESTARTING GAME");

            //int end = 1; its always end = 1 so its always true therefore no need for the if statement
            System. exit(0);

        }//end replay game
    }
}
