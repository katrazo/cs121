package characterBattle.characters;

public class Remi extends PlayerCharacter {
    public Remi() {
        super(  "Remi",
                70,
                23,
                10,
                90,
                35,
                "Heal",
                30
        );
    }

    /**
     * Heals Remi for 30 hp.
     */
    @Override
    public void ability(PlayerCharacter target) {
        // Target doesn't matter, included for proper implementation of superclass
        this.hp += 30;
        System.out.println("Remi used Heal! 30 points of HP are now restored, making her current HP " + hp + "!");
    }
}
