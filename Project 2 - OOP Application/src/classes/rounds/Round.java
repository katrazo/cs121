package classes.rounds;

/**
 * A general framework for a round. Implementations are basically game modes.
 * @see FreeForAll
 * @see Duel
 */
public interface Round {
    public void turn();
    public void endGame();
    public void queueCharacters();

}
