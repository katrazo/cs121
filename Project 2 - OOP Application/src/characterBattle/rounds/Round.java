package characterBattle.rounds;

import characterBattle.characters.PlayerCharacter;

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
     * @return true if user command was accepted as an action, false if not
     * @see PlayerCharacter
     */
    public abstract boolean command(String input, PlayerCharacter actor, PlayerCharacter target);

    public int getTurns() {
        return turns;
    }
    public void setTurns(int turns) {
        this.turns = turns;
    }

    /**
     * Causes a character to act, presumable in order of the queue.
     * @return true if the character acted, false if not
     */
    public abstract boolean turn(String command, PlayerCharacter actor, PlayerCharacter target);

    /**
     * Declares a winner and stops the recursive action of turns.
     */
    public abstract PlayerCharacter endGame();

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
