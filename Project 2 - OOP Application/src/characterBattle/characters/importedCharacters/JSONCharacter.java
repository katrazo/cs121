package characterBattle.characters.importedCharacters;

import characterBattle.characters.PlayerCharacter;

public class JSONCharacter extends PlayerCharacter {


    public JSONCharacter(String name, int hp, int power, int baseDefense, int speed, double critChance, String abilityName, int abilityPower) {
        super(name, hp, power, baseDefense, speed, critChance, abilityName, abilityPower);
    }

    @Override
    public void ability(PlayerCharacter target) {
        attack(target, abilityPower);
    }
}
