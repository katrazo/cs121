import characterBattle.characters.*;
import characterBattle.characters.importedCharacters.JSONCharacterImporter;
import katUtils.ScannerPlus;

import java.util.ArrayList;

public class Main {
    static ScannerPlus scannerPlus = new ScannerPlus();
    static ArrayList<PlayerCharacter> availableCharacters = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Do you wish to import a character from a JSON file? [yes] [no]");
        importCharacter();
    }

    public static void importCharacter() {
        String askImport = scannerPlus.promptUser();

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
}
