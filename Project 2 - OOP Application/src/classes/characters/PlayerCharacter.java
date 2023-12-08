package classes.characters;

/**
 * A blueprint class on which specific classes.characters are built.
 * The idea is that specific classes.characters will use the PlayerCharacter constructor with very specific arguments.
 */
public abstract class PlayerCharacter {
    String name; // The name of a character. Serves as a sort of unique identifier.
    private int hp; // The Health Points assigned to a character.
    // The opposing character's power is negatively applied to this value when they choose a regular attack.
    private int power; // The power of a character's regular attack.
    // The opposing character's HP has this value negatively applied to their health on a regular attack.

    private int baseDefense; // The character's base defense value.
    // This differs from actual defense for cases where the character is actively defending.
    private int actualDefense; // The character's true defense value.
    // This value is subtracted from the opposing character's attack power before said attack power is applied to this character's HP.
    private boolean isDefending; // Stores whether the character is defending, an action which increases their defense by 50% for one turn.

    private int speed; // The priority of attacking first.
    // Between multiple classes.characters, they act in descending order of speed.
    private double critChance; // A percentage chance to double the character's power on a regular attack.
    // For example, "0.55" is a 55% chance to double the character's power on an attack.

    private String abilityName; // The name of a character's special ability.
    private String abilityPower; // The power of an ability. This can be applied in more ways than one.
    // See each character subclass for more.

    public PlayerCharacter(String name, int hp, int power, int baseDefense, int speed, double critChance, String abilityName, String abilityPower) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.baseDefense = baseDefense;
        this.speed = speed;
        this.critChance = critChance;
        this.abilityName = abilityName;
        this.abilityPower = abilityPower;
    }


    // -=-=- Getters and Setters -=-=-


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getBaseDefense() {
        return baseDefense;
    }
    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }
    public int getActualDefense() {
        return actualDefense;
    }
    public void setActualDefense(int actualDefense) {
        this.actualDefense = actualDefense;
    }
    public boolean isDefending() {
        return isDefending;
    }
    public void setDefending(boolean defending) {
        isDefending = defending;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getCritChance() {
        return critChance;
    }
    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }
    public String getAbilityName() {
        return abilityName;
    }
    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }
    public String getAbilityPower() {
        return abilityPower;
    }
    public void setAbilityPower(String abilityPower) {
        this.abilityPower = abilityPower;
    }


    // -=-=- Special Methods -=-=-

    /**
     * A regular attack by this character against an opponent.
     * Subtracts the attack's power (after critical hit chance, after opponent's defense) from the opponent's hp.
     * @param opponent the character being targeted by the attack
     * @return the damage applied to the opponent's hp
     */
    public int attack(PlayerCharacter opponent) {
        int damage = power;
        if (critChance <= Math.random())
            damage *= 2;
        damage -= opponent.getActualDefense();
        if (damage < 0)
            damage = 0;
        opponent.setHp(opponent.getHp() - damage);
        return damage;
    }

    /**
     * Toggles whether the character is actively defending.
     * If the character actively defends, their actual defense is 1.5 times their base defense.
     * If the character stops defending, their actual defense reverts to their base defense.
     * @return whether the character is *now* actively defending
     */
    public boolean toggleDefending() {
        if (!isDefending) {
            isDefending = true;
            actualDefense = (int) (baseDefense * 1.5);
        }
        else {//isDefending
            isDefending = false;
            actualDefense = baseDefense;
        }
        return isDefending;
    }

    /**
     * The character's special ability, which is influenced by their abilityPower.
     * @param target A character might use their ability on themselves, or they may use it on an opponent.
     */
    public abstract void ability(PlayerCharacter target);

    /**
     * Paired with User Input to make a character choose an action.
     * @param command the action to attempt, if the command matches an action
     * @param target the PlayerCharacter to target the action with
     * @return true if an action was enacted, false if the command didn't match any action
     * @see classes.rounds.Round
     * @see classes.rounds.FreeForAll
     * @see classes.rounds.Duel
     */
    public boolean act(String command, PlayerCharacter target) {
        command = command.toLowerCase();
        if (command.equals("attack")) {
            int damageDone = attack(target);
            System.out.println(this.name + " attacked " + target + " for " + damageDone + " damage!");
            System.out.println(target + "'s HP is now " + target.getHp() + "!");
        }
        else
            return false;
        return true;
    }
}