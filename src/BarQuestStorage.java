public class BarQuestStorage {

    public static DungeonWorld dungeonworld = new DungeonWorld();

    public static void slimes(int playerHp, int playerDam, boolean elves){


        int slime1 = 5;
        int slime2 = 5;
        int slime3 = 5;
        int slimeHit = (int)(Math.random()*2 + 1);

        System.out.println("You are at "+playerHp+"HP \nWhat would you like to do?"
                +"\n1.Attack");


        int combatturn = dungeonworld.userInput.nextInt();

        if(combatturn == 1){//Player attacks
            System.out.println("Please pick a slime to hit\n1. Slime One\n2. Slime Two\n3. Slime Three");
            int pSlimeHit = dungeonworld.userInput.nextInt();
            if (pSlimeHit ==1){
                slime1= slime1-playerDam;
                System.out.print("Slime 1 is at "+slime1+" health ");
            }if (pSlimeHit ==2){
                slime2 = slime2-playerDam;
                System.out.print("Slime 2 is at "+slime2+" health ");
            }if (pSlimeHit ==3){
                slime3 = slime3-playerDam;
                System.out.print("Slime 3 is at "+slime3+" health ");
            }

        }//end attack

        if(combatturn != 1){
            System.out.println("You stand there and do nothing");
        }

        playerHp = playerHp-slimeHit;
        playerHp = playerHp-slimeHit;
        playerHp = playerHp-slimeHit;

        if(playerHp <= 0){//start death
            System.out.println("You died\nTry again from the start");
            System. exit(0);
        }//end death

        if(slime1<=0 && slime2<=0 && slime3<=0){
            elves = !elves;
        }//
    }

    public static void elfTribe(int playerHplvl2, int playerDamlvl2, boolean elves, boolean vampire){

        boolean elfFight = false;
        int elf1 = 10;
        int elf2 = 10;
        int elf3 = 10;
        int elf4 = 10;

        System.out.println("As you walk further into the forest you see a tribe full of elves having fun\n"
                +"What would you like to do \n1.interact with them \n2.fight them \n3.walk past them");

        int elfChoice = dungeonworld.userInput.nextInt();
        while(!elves){
            if(elfChoice == 1){
                System.out.println("As you go up to the elves they seem to take a liking to you and you start prtying with them\n"
                        +"You seem to have lots of fun with the elves and they give you plenty of food\nThey allow you to fall asleep in one of their tents\n"
                        +"What would you like to do\n1.Stay with them and leave in the morning \n2.Stay with them forever\n3.Attack them in the night\n4.leave right now");

                int elfTribeChoice = dungeonworld.userInput.nextInt();
                if(elfTribeChoice == 1){

                    System.out.println("As you sleep in the elven tents, you wake up bright and early in order to get a head start on the adventure that will come soon");
                    vampire = !vampire;
                    elves = true;
                }
                if(elfTribeChoice == 2){
                    System.out.println("As you stay with the elves you decide to stay with them as you eventually become the chief of their tribe\n"
                            +"CONGRATULATIONS YOU GOT THE ELVEN ENDING");
                    System. exit(0);
                }
                if(elfTribeChoice == 3){
                    elfFight = !elfFight;
                    while(elfFight){//start elf fight
                        System.out.println("You are at "+playerHplvl2+"HP \nWhat would you like to do?"
                                +"\n1.Attack\n2.act");

                        int combatturn = dungeonworld.userInput.nextInt();


                        if(combatturn == 1){//Player attacks
                            int pElfHit = dungeonworld.userInput.nextInt();

                            if (pElfHit ==1){
                                elf1= elf1-playerDamlvl2;
                                System.out.print("Elf 1 is at "+elf1+" health");
                            }if (pElfHit ==2){
                                elf2 = elf2-playerDamlvl2;
                                System.out.print("Elf 2 is at "+elf2+" health");
                            }if (pElfHit ==3){
                                elf3 = elf3-playerDamlvl2;
                                System.out.print("Elf 3 is at "+elf3+" health");
                            }if (pElfHit ==4){
                                elf4 = elf4-playerDamlvl2;
                                System.out.print("Elf 4 is at "+elf4+" health");
                            }
                        }//end attack
                    }//end elf fight
                }
            }
            if(elfChoice == 2){//fight elves
                elfFight = !elfFight;
                while(elfFight){//start elf fight
                    System.out.println("You are at "+playerHplvl2+"HP \nWhat would you like to do?"
                            +"\n1.Attack\n2.act");


                    int combatturn = dungeonworld.userInput.nextInt();



                    if(combatturn == 1){//Player attacks
                        int pElfHit = dungeonworld.userInput.nextInt();

                        if (pElfHit ==1){
                            elf1= elf1-playerDamlvl2;
                            System.out.print("Elf 1 is at "+elf1+" health");
                        }if (pElfHit ==2){
                            elf2 = elf2-playerDamlvl2;
                            System.out.print("Elf 2 is at "+elf2+" health");
                        }if (pElfHit ==3){
                            elf3 = elf3-playerDamlvl2;
                            System.out.print("Elf 3 is at "+elf3+" health");
                        }if (pElfHit ==4){
                            elf4 = elf4-playerDamlvl2;
                            System.out.print("Elf 4 is at "+elf4+" health");
                        }
                    }//end attack
                    if(combatturn == 2){//start act
                        System.out.println("You try and apologize to the elves and \n"
                                +"they happen to forgive you but force you to leave");

                        elfFight = !elfFight;
                        vampire = !vampire;
                    }//end act

                    if(elf1 <=0 && elf2 <=0 && elf3 <=0 && elf4 <=0){
                        elfFight = !elfFight;
                        vampire = !vampire;
                    }
                }//end elf fight

            }
            if(elfChoice == 3){//walk past elves
                System.out.println("You ignore the elves and continue to press on forward");
                vampire = !vampire;
            }



            if(elfChoice > 3 || elfChoice < 1){
                System.out.println("That is not an option");
            }
        }
    }//end elfTribe

    public static void vampirePalace(int playerHplvl3, int playerDamlvl3) {
        int vampireSpawn1 = 5;
        int vampireSpawn2 = 5;
        int vampireSpawn3 = 5;
        int vampireSpawn4 = 5;

        int kingVampire = 40;

        System.out.println("As you walk across the forest you see a giant mansion with a mysterious aura coming off of it\n"
                +"Would you like to \n1.go into the mansion \n2.ignore it and move on");

        int vampireChoice = dungeonworld.userInput.nextInt();


        if(vampireChoice == 1){
            while(vampireChoice ==1 ){
                System.out.println("You are at "+playerHplvl3+"HP \nWhat would you like to do?"
                        +"\n1.Attack\n2.act");


                int combatturn = dungeonworld.userInput.nextInt();



                if(combatturn == 1){//Player attacks

                    System.out.println("Please choose a target to");
                    int pVampHit = dungeonworld.userInput.nextInt();

                    if (pVampHit ==1){
                        vampireSpawn1= vampireSpawn1-playerDamlvl3;
                        System.out.print("Vampire spawn 1 is at "+vampireSpawn1+" health");
                    }if (pVampHit ==2){
                        vampireSpawn2 = vampireSpawn2-playerDamlvl3;
                        System.out.print("Vampire spawn 2 is at "+vampireSpawn2+" health");
                    }if (pVampHit ==3){
                        vampireSpawn3 = vampireSpawn3-playerDamlvl3;
                        System.out.print("Vampire spawn 3 is at "+vampireSpawn3+" health");
                    }if (pVampHit ==4){
                        vampireSpawn4 = vampireSpawn4-playerDamlvl3;
                        System.out.print("Vampire spawn 4 is at "+vampireSpawn4+" health");
                    }if (pVampHit ==4){
                        kingVampire = kingVampire-playerDamlvl3;
                        System.out.print("The Vampire King is at "+kingVampire+" health");
                    }
                }//end attack
                if(combatturn == 2){//start act
                }
            }
        }
        if(vampireChoice == 2){
            System.out.println("");
        }
        if(vampireChoice > 2 || vampireChoice <= 0){
            System.out.println("That is not an option. Please select again");
        }
    }

    public static void goblinChoice( int playerHp, int playerDam, boolean room2){

        int gob1 = 5;
        int gob2 = 5;
        int gob3 = 5;
        int gob4 = 3;
        int gobHit = (int)(Math.random()*2 + 1);


        int goblinchoice = dungeonworld.userInput.nextInt();
        switch(goblinchoice){

            case 1:// surprise the goblins
                System.out.println("As you sneak past the goblins you manage to sneak attack and knock him out 1\n"
                        +"but the other goblins realize you're presence Prepare to fight NOW\n");





                boolean surGobFight = true;
                while (surGobFight){

                    //Goblin Hp and damage

                    if(gob1 <= 0){

                    }


                    if(gob2 <= 0){

                    }


                    if(gob3 <= 0){

                    }

                    System.out.print("You are at "+playerHp+"HP \nWhat would you like to do?"
                            +"\n1.Attack\n2.Act\n");
                    int playerdam = (int)(Math.random()*5 + 1);

                    int combatturn = dungeonworld.userInput.nextInt();

                    switch(combatturn){//start combatturn





                        case 1://Player attacks

                            System.out.println("\nWhich enemy would you like to hit?\n"
                                    +"1.goblin 1\n2.goblin 2 \n3.goblin 3");

                            int pGobHit = dungeonworld.userInput.nextInt();
                            switch(pGobHit){//where the player chooses which goblin to hit




                                //hit gob1
                                case 1:
                                    System.out.println(+playerdam);
                                    gob1= gob1-playerdam;
                                    System.out.print("Goblin 1 is at "+gob1+" health");
                                    break;

                                //hit gob2
                                case 2:
                                    gob2 = gob2-playerdam;
                                    System.out.print("Goblin 2 is at "+gob2+" health");
                                    break;

                                //hit gob3
                                case 3:
                                    gob3 = gob3-playerdam;
                                    System.out.print("Goblin 3 is at "+gob3+" health");
                                    break;

                            }//end gobhit
                            break;//end player attack


                        case 2://start act

                            System.out.println("You see that many of the goblins eyeing\n"
                                    +" the gold you have strapped to you're wiast\n"
                                    +"Do you \n1.give them gold? \n2.back");

                            int gobaction = dungeonworld.userInput.nextInt();
                            if (gobaction==1){


                            }
                            break;//end act

                    }//end combatturn

                    if (surGobFight){//
                        int gobdmg1=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 1 did "+gobdmg1+" damage to you.\nYou are now at "+playerHp+"Hp");




                        int gobdmg2=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 2 did "+gobdmg2+" damage to you.\nYou are now at "+playerHp+"Hp");

                        int gobdmg3=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 3 did "+gobdmg3+" damage to you.\nYou are now at "+playerHp+"HP");

                        int gobdmg4=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 3 did "+gobdmg4+" damage to you.\nYou are now at "+playerHp+"HP");
                    }//end goblin hits
                    else{

                        System.out.print("\nYou give the goblins gold and \n"
                                +"they let you pass to the next room");
                    }
                    if(gob1<=0 && gob2<=0 & gob3<=0){

                        room2 = !room2;
                        surGobFight = !surGobFight;


                    }
                    if(playerHp <= 0){//start death
                        System.out.println("You died\nTry again from the start");
                        System. exit(0);
                    }//end death
                }// end gobcavefight

                break;//end sneak&fight scenario


            case 2:
                System.out.println("As you go into the room you surprise one of the goblins\n"
                        +"causing them to be slightly injured\n Prepare to fight NOW!");


                boolean gobcavefight = true;
                while (gobcavefight = true){

                    System.out.print("You are at "+playerHp+"HP \nWhat would you like to do?"
                            +"\n1.Attack\n2.Act\n");


                    int combatturn = dungeonworld.userInput.nextInt();
                    switch(combatturn){//start combatturn
                        case 1://Player attacks
                            System.out.println("\nWhich enemy would you like to hit?\n"
                                    +"1.goblin 1\n2.goblin 2 \n3.goblin 3\n4.goblin 4");

                            int pgobhit = dungeonworld.userInput.nextInt();
                            switch(pgobhit){//where the player chooses which goblin to hit
                                //hit gob1
                                case 1:

                                    System.out.println(+playerDam);
                                    gob1= gob1-playerDam;
                                    System.out.print("Goblin 1 is at "+gob1+" health");
                                    break;

                                //hit gob2
                                case 2:
                                    gob2 = gob2-playerDam;
                                    System.out.print("Goblin 2 is at "+gob2+" health");
                                    break;

                                //hit gob3
                                case 3:
                                    gob3 = gob3-playerDam;
                                    System.out.print("Goblin 3 is at "+gob3+" health");
                                    break;

                                case 4:
                                    gob4 = gob4-playerDam;
                                    System.out.print("Goblin 4 is at "+gob4+" health");
                                    break;
                            }//end gobhit
                            break;//end player attack




                        case 2://start act

                            System.out.println("You see that many of the goblins eyeing\n"
                                    +" the gold you have strapped to you're wiast\n"
                                    +"Do you \n1.give them gold? \n2.back");

                            int gobaction = dungeonworld.userInput.nextInt();
                            if (gobaction==1){
                                gobcavefight = !gobcavefight;
                            }
                            break;//end act

                    }//end combatturn

                    if (gobcavefight){
                        int gobdmg1=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 1 did "+gobdmg1+" damage to you.\nYou are now at "+playerHp+"Hp");

                        int gobdmg2=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 2 did "+gobdmg2+" damage to you.\nYou are now at "+playerHp+"Hp");

                        int gobdmg3=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 3 did "+gobdmg3+" damage to you.\nYou are now at "+playerHp+"HP");

                        int gobdmg4=gobHit;
                        playerHp = playerHp-gobHit;
                        System.out.print("\nGoblin 3 did "+gobdmg4+" damage to you.\nYou are now at "+playerHp+"HP");
                    }//end goblin hits

                    if(gob1<=0 && gob2<=0 & gob3<=0 && gob4<=0){
                        room2 = !room2;
                        gobcavefight = !gobcavefight;
                    }
                    if(playerHp <= 0){
                        System.out.println("You died\nTry again from the start");
                        System. exit(0);
                    }


                }//end gobcavefight loop
                break;//end
            case 3:

                break;

            case 4:
                System.out.println("The goblins decide to let you play and they allow you to play\n"
                        +"You all have fun playing the game and end up not leaving the cave due to how much fun you were having\n"
                        +"CONGRATULATIONS\nYOU GOT THE\nFUNNY ENDING");
                System. exit(0);
                break;


        }// end the goblin choice

    }

    public static void orcChoice( int playerHplvl2, int playerDamlvl2, boolean room2, boolean room3){

        int orc1 = 10;
        int orc2 = 10;
        int orcHit = (int)(Math.random()*4 + 1);

        while (room2 = true){

            System.out.print("You are at "+playerHplvl2+"HP \nWhat would you like to do?"
                    +"\n1.Attack\n2.Act\n");


            int combatturn = dungeonworld.userInput.nextInt();



            /*
             *choose which orc to attack
             *how much damage will be done to the orc
             */
            if(combatturn==1){//Player attacks
                System.out.println("\nWhich enemy would you like to hit?\n"
                        +"1.orc 1\n2.orc 2");

                int pOrcHit = dungeonworld.userInput.nextInt();
                if (pOrcHit ==1){
                    orc1= orc1-playerDamlvl2;
                    System.out.print("Orc 1 is at "+orc1+" health");
                }if (pOrcHit ==2){
                    orc2 = orc2-playerDamlvl2;
                    System.out.print("Orc 2 is at "+orc2+" health");
                }//end orchit

            }//end combat turn
            if(combatturn==1){//start act

                System.out.println("The orcs do not seem to be much for talking\n"
                        + "but you see that they look like they are incredibly hungry\n"
                        + "You could feed them the goblins or your weapons.WHAT WOULD YOU LIKE TO FEED THEM\n"
                        + "1.The Goblins\n 2.Your weapon");

                int eat = dungeonworld.userInput.nextInt();

                if(eat == 1){
                    System.out.println("You lure the orcs to the previous room with the Goblins\n"
                            + "They eat the goblins and are now much stronger");

                    orc1 = 25;
                    orc2 = 25;
                }if(eat == 2){
                    System.out.println("You throw you're weapon on the ground.\n"
                            + "As soon as you throw it the orcs starts trying to eat you're weapon\n"
                            + "By the time they finish eating the weapon they have taken quite a bit of damage from it");

                    orc1 = orc1-5;
                    orc2 = orc2-5;
                }
            }//end act
        }//combat turn end


        //orcs hitting the player
        playerDamlvl2 = playerDamlvl2-orcHit;
        System.out.println("orc 1 hit you\n You are now at "+playerHplvl2+"hp");
        playerDamlvl2 = playerDamlvl2-orcHit;
        System.out.println("orc 2 hit you\n You are now at "+playerHplvl2+"hp");

        if(playerHplvl2 <= 0){//start death
            System.out.println("You died\nTry again from the start");
            System. exit(0);
        }//end death

        if(orc1<=0 && orc2<=0){
            room2 = !room2;
            room3 = !room3;
        }//close room2 open room3
    }//end room2

    public static void room3 (int playerHplvl3, int playerDamlvl3, int dragon){
        int dragonHit = (int)(Math.random()*7 + 1);;

        boolean dragonSword = false;
        boolean runDragon = false;

        if(dragonSword == true){
            dragonSword(playerHplvl3, playerDamlvl3, dragon, dragonSword);
        }



        System.out.println("As you enter the final room of the dungeon\n"
                + "you see a massive dragon towering over you with dark red scales\n"
                + "The dragon causes the room to get hotter as he prepares to deal with this intruder\n"
                + "PREPARE TO FIGHT\n\n");

        System.out.println("You are at "+playerHplvl3+"HP \nWhat would you like to do?"
                +"\n1.Attack\n2.Act\n");


        int combatturn = dungeonworld.userInput.nextInt();



        if(combatturn == 1){//Player attacks
            dragon= dragon-playerDamlvl3;
            System.out.print("The Dragon is at "+dragon+" health");
        }//end attack

        if (combatturn == 2){//start action
            boolean lookDragon = true;

            if (lookDragon == true){//start lookDragon
                System.out.println("As you look at the dragon you are confused as to what to do\n"
                        + "Then you happen to notice that the dragon has a sword lodged in its back\n"
                        + "That sword must be the key to killing the dragon!");

                lookDragon = !lookDragon;
                runDragon = !runDragon;
            }//end lookDragon

            if (runDragon == true){

                System.out.println("You run towards the dragon and get to start climbin on its back\n"
                        + "You're close to the sword 1 more turn should do it!");
            }
        }//end act

        playerHplvl3 = playerHplvl3-dragonHit;
        System.out.println("The dragon swings its claw at you\n"
                +"You are now at "+playerHplvl3+"hp");

        if(playerHplvl3 <= 0){//start death
            System.out.println("You died\nTry again from the start");
            System. exit(0);
        }//end death

    }//end room3

    public static void dragonSword (int playerHplvl3, int dragon, int dragonHit, boolean dragonSword){

        int dragonSwordHit = (int)(Math.random()*10 + 3);

        System.out.println("You are at "+playerHplvl3+"HP \nWhat would you like to do?"
                +"\n1.Attack");


        int combatturn = dungeonworld.userInput.nextInt();

        if(combatturn == 1){//Player attacks
            dragon= dragon-dragonSwordHit;
            System.out.print("The Dragon is at "+dragon+" health");
        }//end attack

        if(combatturn != 1){
            System.out.println("You stand there and do nothing");
        }

        playerHplvl3 = playerHplvl3-dragonHit;
        System.out.println("The dragon swings its claw at you\n"
                +"You are now at "+playerHplvl3+"hp");

        if(playerHplvl3 <= 0){//start death
            System.out.println("You died\nTry again from the start");
            System. exit(0);
        }//end death
    }

}
