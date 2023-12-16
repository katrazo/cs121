package characterBattle.characters.importedCharacters;

import characterBattle.characters.importedCharacters.JSONCharacter;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * A JSON parser that takes a JSON file and instantiates it as a PlayerCharacter.
 * A template is provided in this package.
 */
public class JSONCharacterImporter {
    static Scanner userInput = new Scanner(System.in);

    public static JSONCharacter importCharacter() {
        // Create gson object to translate JSON
        Gson gson = new Gson();

        // Attempt to create a BufferedReader for the file the user is trying to import.
        System.out.println("Place the JSON file inside the classes.characters.importedCharacters package.");
        System.out.println("Once done, type the name of the file [including \".json\"].");
        System.out.println("At any time, enter \"q\" to abort the process.");
        BufferedReader reader = locateFile();

        if (reader != null)
            return gson.fromJson(reader, JSONCharacter.class);
        else
            return null;
    }

    public static BufferedReader locateFile() {
        // The BufferedReader, initialized to null to resolve compile-time error.
        BufferedReader toReturn = null;
        // User enters the name of the file
        String fileName = userInput.nextLine();

        // If the user wishes to abort, return null.
        if (fileName.equals("q"))
            return null;

        // Otherwise...
        try {
            // Attempt to create a BufferedReader for the file the user entered
            toReturn = new BufferedReader(new FileReader("src/classes/characters/importedCharacters/" + fileName));
        } catch (FileNotFoundException e) {
            // If the file is not found, try again
            System.out.println("File src/classes/characters/importedCharacters/" + fileName + " not found. Please try again.");
            toReturn = locateFile();
        }
        // Finally, return the BufferedReader for the found file.
        return toReturn;
    }
}
