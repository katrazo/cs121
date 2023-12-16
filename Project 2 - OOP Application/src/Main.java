import characterBattle.characters.*;
import characterBattle.characters.importedCharacters.JSONCharacterImporter;
import characterBattle.rounds.Duel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static ArrayList<PlayerCharacter> availableCharacters = new ArrayList<>();

    public static void main(String[] args) {
        availableCharacters.add(new Remi());
        availableCharacters.add(new Ajax());

        System.out.println("Do you wish to import a character from a JSON file? [yes] [no]");
        importCharacter();

        System.out.println("Free-for-All matches are not yet implemented. Starting a duel.");
        System.out.println("Player 1, please choose your character by the number next to it in brackets.");
        PlayerCharacter player1 = availableCharacters.get(chooseCharacter());
        System.out.println("\nPlayer 2, please choose your character by the number next to it in brackets.");
        PlayerCharacter player2 = availableCharacters.get(chooseCharacter());

        System.out.println();

        Duel battle = new Duel(player1, player2);
        PlayerCharacter character1 = battle.getCharacter1();
        PlayerCharacter character2 = battle.getCharacter2();

        System.out.println("Round start!");
        while (character1.getHp() > 0 && character2.getHp() > 0) {
            battle.setTurns(battle.getTurns() + 1);
            System.out.println("-=-=- Turn " + battle.getTurns() + " -=-=-");
            battle.queueCharacters();
            PlayerCharacter[] order = battle.getOrder();
            System.out.println();
            // If a character was defending on the opponent's turn, stop defending now
            if (order[0].isDefending())
                order[0].toggleDefending();
            System.out.println("It's " + order[0].getName() + "'s turn! What will you do?");
            System.out.println("[attack] [defend] [ability]");
            boolean playerActed = false;
            while (!playerActed) {
                playerActed = battle.turn(userInput.nextLine(), order[0], order[1]);
            }
            if (order[1].getHp() > 0) {
                if (order[1].isDefending())
                    order[1].toggleDefending();
                System.out.println();
                System.out.println("It's " + order[1].getName() + "'s turn! What will you do?");
                System.out.println("[attack] [defend] [ability]");
                playerActed = false;
                while (!playerActed) {
                    playerActed = battle.turn(userInput.nextLine(), order[1], order[0]);
                }
            }
        }
        System.out.println(battle.endGame().getName() + " has won!");
    }

    public static void importCharacter() {
        String askImport = userInput.nextLine().toLowerCase();

        if (askImport.equals("yes")) {
            PlayerCharacter importedCharacter = JSONCharacterImporter.importCharacter();
            if (importedCharacter != null) {
                availableCharacters.add(importedCharacter);
                System.out.println("Your character, " + importedCharacter.getName() + ", has been added to the list.");
            }
            else {
                System.out.println("Process aborted.");
            }
            System.out.println("Do you wish to import an additional character? [yes] [no]");
            importCharacter();
        }
        else {
            System.out.println("Non-yes answer interpreted as no. Moving on.");
        }


    }

    /**
     * This is recursive in case the player input is not recognized as a character selection.
     */
    public static int chooseCharacter() {
        int choice = 0;
        System.out.print("Your options are: ");
        for (int i = 0; i < availableCharacters.size(); i++) {
            System.out.print(availableCharacters.get(i).getName() + "[" + i + "]  ");
        }
        System.out.println();
        try {
            choice = Integer.parseInt(userInput.nextLine());
        } catch (Exception e) {
            System.out.println("That is not an integer. Please try again");
            choice = chooseCharacter();
        }
        if (choice >= availableCharacters.size() || choice < 0) {
            System.out.println("That is not an available character. Please try again.");
            choice = chooseCharacter();
        }
        return choice;
    }
}
