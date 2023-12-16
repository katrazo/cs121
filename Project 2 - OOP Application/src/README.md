# Character Battle 2: OOP Application
The first character battle was a success, but it was lacking in many areas. Consider this project an attempt to overhaul that project in every way possible.

**Be sure to check class and method documentations for more information.**

The FreeForAll is incomplete. I did not budget my time well enough.
Duels work though.

---
## Directory Breakdown:
### characterBattle
contains all data required to operate the project aside from what's in **Main**, which of course runs the project.
#### characters
The `characters` package contains the abstract PlayerCharacter that all specific characters are based upon.

Additionally, this package contains an `importedCharacters` package that contains files enabling users to import their own characters from JSON files. I figured this would be far more efficient than using a Scanner or JOptionPane to get the values from the user one-by-one. Additionally, this framework allows users to share their favorite characters with one another. A template is provided.
The `JSONCharacter` class is a buffer between `PlayerCharacter` and `JSONCharacterImporter` because PlayerCharacter cannot be instantiated.

#### rounds
The `rounds` package contains the abstract Round class that all specific round types are based upon. Consider each subclass of `Round.java` to be its own game mode.
- **The `Duel` class** is optimized for a two-player battle. Code is optimized to support only two players and provides the most cohesive experience.
- **The `FreeForAll` class** is designed to support a countable infinity of characters. The code is less optimized, and processing times will grow substantially as more characters are added. The benefit of this game mode is having more than two players.

## Other notes

How you assign stats to your own characters is all up to you. JSON characters can only use abilities to target other characters

---
Project made by Kat Razo with IntelliJ IDEA.