package classes.characters.importedCharacters;

import classes.characters.PlayerCharacter;

public class JSONCharacter extends PlayerCharacter {


    public JSONCharacter(String name, int hp, int power, int baseDefense, int speed, double critChance, String abilityName, String abilityPower) {
        super(name, hp, power, baseDefense, speed, critChance, abilityName, abilityPower);
    }

    @Override
    public void ability(PlayerCharacter target) {

    }
}
