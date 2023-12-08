package characterBattle.rounds;

import java.util.ArrayList;
import java.util.Queue;
import characterBattle.characters.PlayerCharacter;

/**
 * A subclass of Round that supports a theoretically countable infinity of PlayerCharacters.
 * The math is not exactly optimized, and more characters will lead to slower gameplay.
 * @see Round
 */
public class FreeForAll extends Round{
    private ArrayList<PlayerCharacter> roster; // The characters fighting in a round.
    // Order in the list does not determine the acting order of characters.
    private Queue<PlayerCharacter> queue; // The characters fighting in a round ordered by speed.
    // Order in this list DOES DETERMINE the acting order of characters.

    public FreeForAll(ArrayList<PlayerCharacter> roster) {
        if (roster.size() > 1)
            this.roster = roster;
        else {
            System.out.println("This roster does not have enough characters!");
            return;
        }
    }

    public void queueCharacters() {
        // Just in case a queue already exists, it needs to be reset.
        for (PlayerCharacter character : queue) {
            queue.remove(character);
        }

        // Create a list of lists in which to sort the characters by speed.
        // Characters with different speeds will be separated into different sublists.
        // Characters with the same speed will be put in the same sublist.
        // If a sublist contains more than one character, characters are queued in a random order.
        ArrayList<ArrayList<PlayerCharacter>> charactersToQueue = new ArrayList<>();

        // A baseline speed is needed as a reference for whether a character needs to be before or after another.
        int speedReference;

        // We need to add one character to prevent an IndexOutOfBoundsException
        // Make a new sublist of characters with a speed
        charactersToQueue.add(new ArrayList<>());
        // Add the first character to that sublist as an initial point of reference
        charactersToQueue.get(0).add(roster.get(0));

        // First we need to add the characters to an ordered list (of lists).
        // i = 1 because we already added the first character.
        for (int i = 1; i < roster.size(); i++) {
            PlayerCharacter queueingCharacter = roster.get(i);
            for (int j = 0; j < charactersToQueue.size(); j++) {
                // Since every character in a sublist has the same speed, just get the first character.
                speedReference = charactersToQueue.get(j).get(0).getSpeed();
                // If this character's speed equals the speed of the character at this point in the list,
                if (queueingCharacter.getSpeed() == speedReference) {
                    // add this character to the same list.
                    charactersToQueue.get(j).add(roster.get(i));
                    break;
                }
                // Else if this character's speed is greater than the speed of the character at this point in the list,
                else if (queueingCharacter.getSpeed() > speedReference) {
                    // create a preceding list for this character
                    charactersToQueue.add(0, new ArrayList<>());
                    // add this character to that list
                    charactersToQueue.get(0).add(queueingCharacter);
                    break;
                }
                // Else this character's speed is less than the speed of the character at this point in the list.
                else {
                    // If we've reached the end of the list...
                    if (j == charactersToQueue.size() - 1) {
                        // Make a new list for this slowest character
                        charactersToQueue.add(new ArrayList<>());
                        // Add this slowest character to that list.
                        charactersToQueue.get(j+1).add(queueingCharacter);
                        break;
                    }
                    // Otherwise, we haven't reached the end of the list and can iterate over the loop again.
                }
            }
        }

        // Then, we need to actually add the characters to the queue.
        for (ArrayList<PlayerCharacter> playerCharacters : charactersToQueue) {
            // If the current sublist only has 1 character, then add that character to the queue.
            if (playerCharacters.size() == 1)
                queue.add(playerCharacters.get(0));
            // Else if the current sublist has more than 1 character
            else {
                // Create a list of indexes for which characters have already been queued.
                ArrayList<Integer> queuedIndexes = new ArrayList<>();
                // While there's still characters in this sublist left to queue...
                while (queuedIndexes.size() < playerCharacters.size()) {
                    // Create a random number corresponding to the index of one of the characters.
                    int randomIndex = (int)(Math.random() * playerCharacters.size());
                    // If the character at that index hasn't been queued
                    if (!queuedIndexes.contains(randomIndex)) {
                        // Add that index to the list of queued indexes
                        queuedIndexes.add(randomIndex);
                        // Queue the character at that index
                        queue.add(playerCharacters.get(randomIndex));
                    }
                    // Otherwise, generate another random number.
                }
            }
        }
    }

    @Override
    public void turn() {

    }

    @Override
    public String command(String prompt) {
        return null;
    }

    @Override
    public void endGame() {

    }

    @Override
    public String returnResults() {
        return null;
    }
}