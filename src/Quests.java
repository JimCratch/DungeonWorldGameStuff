public class Quests {

    public static DungeonWorld dungeonworld = new DungeonWorld();
    public static BarQuestStorage barqueststorage = new BarQuestStorage();
    public static Act act = new Act();

    public static void QuestDecision(int playerHp) {
        System.out.println("The guards say that there is a bandit on the loose who has been stealing\n"
                + "much of the peoples money. He then asks you if you would like to help find this bandit?\n"
                + "1.Help find the criminals\n2.back");

        dungeonworld.userInput.nextLine();
        String Answer = dungeonworld.userInput.nextLine();

        if (Answer.equals("2")) {
            System.exit(0);
        }
        else {

            //The Context of the fight
            BanditFightScene();

            //Bandit Health for fight
            int banditHp = 15;
            //Removed banditfight because it would always be true
            while (true) {//start bandit fight
                System.out.print("You are at " + playerHp + "HP \nWhat would you like to do?"
                        + "\n1.Attack\n2.Act\n");

                int combatturn = dungeonworld.userInput.nextInt();
                int playerdmg = (int) (Math.random() * 3 + 1);

                if (combatturn == 1) {//start attack

                    banditHp = banditHp - playerdmg;
                    System.out.println("You attack the bandit and he is now at " + banditHp + " Hp");

                }//end attack

                else {//start act

                    //ask the player what potion will they use
                    act.PotionChoice();

                    //ask the user what will they do with the potion
                    int potion = dungeonworld.userInput.nextInt();
                    if (potion == 1) {//start purple potion

                        act.PurplePotion();

                    }//end purple potion bandit
                    //end purple potion
                    else {//start pink potion

                        act.PinkPotion();

                        //end pink potion
                    }//end pink potion
                }//end act
                int banditdmg = (int) (Math.random() * 3 + 1);
                playerHp = playerHp - banditdmg;
                System.out.println("\nThe bandit attacks you and now\n");

                if (banditHp <= 0) {//start paladin ending
                    System.out.println("The bandit goes down as you land you're last hit\n"
                            + "You've won you're fight and as he goes down the guards wake up and arrest the bandit\n"
                            + "CONGRATULATIONS\nYOU GOT THE PALADIN ENDING\nRESTARTING GAME");

                    //int end = 1; its always end = 1 so its always true therefore no need for the if statement
                    //replay game
                    System.exit(0);
                }//end replay game
                //end paladin ending

                if (playerHp <= 0) {//start death
                    System.out.println("You died\nTry again from the start");
                    System.exit(0);
                }//end death
            }//end bandit fight

        }//end bandit quest
    }

    public static void BanditFightScene() {
        System.out.println("Thank you sir for helping us find this bandit now then here is our plan\n"
                +"We will give you some gold and expensive clothes and then the bandit will come after you where we will the arrest him\n"+
                "\nAs night falls you walk around town and then you see as the bandit\n"
                +"You call out for the guards but it seems he put a sleeping potion in their drink to get them away from you\n"
                +"You then realize that you must fight you're way out of this one");
    }

    public static void BarQuest(int playerHp, int playerDam, int playerHplvl2, int playerDamlvl2, int playerHplvl3, int playerDamlvl3, int dragon) {

        System.out.println("\nAs you go into the bar"
                + "you see many people covered in armor and with enormous weapons\n"
                + "You then also see many spell casters wishing to show off their knowledge.\n"
                + "The barkeeper takes a look at you and then tells you that only adventurers are allowed in the bar\n"
                + "and the if you with to drink here you must go on an adventure.\n"
                + "Do you go on an adventure?\n1.Yes\n2.No");
        int barquest = dungeonworld.userInput.nextInt();


        if (barquest == 1){//start barquest
            //Bar questline
            System.out.println("You leave the bar and the city in order to find an adventure worthy enough to allow you to go into the bar."
                    + "\n As you go out you see a cave that you could enter "
                    + "\nBut you also could go into the magical woods that surely have many magical creatures");

            int baradvent = dungeonworld.userInput.nextInt();



            if (baradvent == 1){
                boolean elves = false;
                boolean vampire = false;

                System.out.println("As you go into the woods you see several slimes surrounding you"
                        +"PREPARE TO FIGHT");
                barqueststorage.slimes(playerHp, playerDam, elves);

                barqueststorage.elfTribe(playerHplvl2, playerDamlvl2, elves, vampire);
            }





            if (baradvent == 2){//start cave bar advent
                boolean room2 = false;
                boolean room3 = false;
                System.out.println("As you go into the cave you see a group of 4 goblins all huddled around the entrance to the next room\n"
                        +"They seem to be distracted playing a game with cards you do not understand\nWhat do you do?\nDo you\n"
                        +"1.Sneak up on them and attack them\n2.Attack them head on\n3.Sneak past them to get through the door \n4.Try to play the game with them");

                barqueststorage.goblinChoice(playerHp, playerDam, room2);


                if (room2){
                    System.out.println("As you enter the second room you see 2 giant orcs standing over you\n"
                            + "They don't look like they could be beaten in any way other than raw brute force\n"
                            + "PREPARE TO FIGHT");

                    barqueststorage.orcChoice(playerHp, playerDam, room2, room3);

                }//end room2

                if(room3){
                    barqueststorage.room3(playerHp, playerDam, dragon);
                }
                if(dragon <= 0){
                    System.out.println("As you come back from you're amazing adventure go to the bar that wouldn't let you in\n"
                            +"As you show the spoils of your adventure, and tell the epic tell you see that they are deeply interested in what you did\n"
                            +"They tell you that they were joking about having to go on an amazing adventure as you all have a great laugh over this joke\n"
                            +"CONGRATULATIONS\nYOU GOT THE\nCAVE BAR ENDING");
                }
            }//end cavebar quest
        }//end bar questline
        System. exit(0);

    }

}
