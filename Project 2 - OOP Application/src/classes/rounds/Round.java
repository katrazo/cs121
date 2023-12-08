package classes.rounds;

import classes.characters.PlayerCharacter;

/**
 * A general framework for a round. Implementations are basically game modes.
 * @see FreeForAll
 * @see Duel
 */
public abstract class Round {
    private PlayerCharacter winner; // The character that wins the round.
    private int turns = 0; // The number of turns accumulated throughout a round.

    /**
     * Calls the scanner and returns the line.
     * @param prompt The prompt to give a user.
     * @return The line that the user enters, to be used in commands like PlayerCharacter.act()
     * @see PlayerCharacter
     */
    public abstract String command(String prompt);

    /**
     * Causes the characters to act in order of the queue.
     */
    public abstract void turn();

    /**
     * Declares a winner and stops the recursive action of turns.
     */
    public abstract void endGame();

    /**
     * Orders characters, be it in a queue or in an array.
     */
    public abstract void queueCharacters();

    /**
     * Not dissimilar from toString() as it concatenates data from the end of a round.
     * @return Data from the round, like the turns elapsed and the winner.
     */
    public abstract String returnResults();
}
