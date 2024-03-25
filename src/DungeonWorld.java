import java.util.Scanner;

public class DungeonWorld {

    public static StartGame startgame = new StartGame();
    public static Quests quests = new Quests();
    public static Act act = new Act();
    public static BarQuestStorage barqueststorage = new BarQuestStorage();
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {//start main

        startgame.StartingGame();

    }//end main

    public static void banditQuest(int playerHp){//bandit questline

        quests.QuestDecision(playerHp);

    }

    public static void barQuest(int playerHp, int playerDam, int playerHplvl2, int playerDamlvl2, int playerHplvl3, int playerDamlvl3, int dragon){//Bar questline

        quests.BarQuest(playerHp, playerDam, playerHplvl2, playerDamlvl2, playerHplvl3, playerDamlvl3, dragon);

    }

    public static void slimes(int playerHp, int playerDam, boolean elves){

        barqueststorage.slimes(playerHp, playerDam, elves);

    }

    public static void elfTribe(int playerHplvl2, int playerDamlvl2, boolean elves, boolean vampire){

        barqueststorage.elfTribe(playerHplvl2, playerDamlvl2, elves, vampire);

    }

    public static void vampirePalace(int playerHplvl3, int playerDamlvl3){

        barqueststorage.vampirePalace(playerHplvl3, playerDamlvl3);

    }

    public static void goblinChoice( int playerHp, int playerDam, boolean room2){

        barqueststorage.goblinChoice(playerHp, playerDam, room2);

    }

    public static void orcChoice( int playerHplvl2, int playerDamlvl2, boolean room2, boolean room3){

        barqueststorage.orcChoice(playerHplvl2, playerDamlvl2, room2, room3);

    }

    public static void room3 (int playerHplvl3, int playerDamlvl3, int dragon){

        barqueststorage.room3(playerHplvl3, playerDamlvl3, dragon);

    }

    public static void dragonSword (int playerHplvl3, int dragon, int dragonHit, boolean dragonSword){

        barqueststorage.dragonSword(playerHplvl3, dragon, dragonHit, dragonSword);

    }

}//end public class