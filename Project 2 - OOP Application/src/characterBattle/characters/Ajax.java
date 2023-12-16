package characterBattle.characters;

public class Ajax extends PlayerCharacter {
    public Ajax() {
        super(  "Ajax",
                80,
                28,
                15,
                43,
                25,
                "Fiery Strike",
                40
        );
    }

    /**
     *
     * @param target Ajax attacks the target for 40 power ignoring their defense entirely.
     */
    @Override
    public void ability(PlayerCharacter target) {
        target.setHp(target.getHp() - 40);
        System.out.println("Ajax used Fiery Smash on " + target.getName() + " for 40 hp ignoring their defense!");
        System.out.println(target.getName() + "'s HP is now " + target.getHp() + "!");
    }
}
