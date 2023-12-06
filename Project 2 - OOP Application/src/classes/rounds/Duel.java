package classes.rounds;

import classes.characters.PlayerCharacter;

import java.util.Arrays;

/**
 * An implementation of Round that is specifically meant for and optimized for two players.
 * Whereas the FreeForAll mode uses complex list manipulation, the duel is optimized with simple math for two players.
 * @see Round
 */
public class Duel implements Round{
    private PlayerCharacter character1; // The first character in a duel. Does not mean they act first.
    private PlayerCharacter character2; // The second character in a duel. Does not mean they act second.
    private PlayerCharacter[] order = new PlayerCharacter[2]; // Characters are placed into this array every turn based on attack order.

    public Duel(PlayerCharacter character1, PlayerCharacter character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    public void queueCharacters() {
        // If there was an order before, it must be cleared.
        Arrays.fill(order, null);

        // If the characters have the same speed
        if (character1.getSpeed() == character2.getSpeed()) {
            // Generate a random number, 1 or 2
            int random = (int)(Math.random() * 2 + 1); // Random integer from 1 to 2
            // If the random number is 1, character1 goes first
            if (random == 1) {
                order[0] = character1;
                order[1] = character2;
            }
            // If the random number is 2, character2 goes first
            else { // random == 2
                order[0] = character2;
                order[1] = character1;
            }
        }
        // If character1 is faster, character 1 goes first
        else if (character1.getSpeed() > character1.getSpeed()) {
            order[0] = character1;
            order[1] = character2
        }
        // Else, character 2 is faster, so they go first
        else {
            order[0] = character2;
            order[1] = character1;
        }
    }
}
