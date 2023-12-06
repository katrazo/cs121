package packagesDemo;

// This class uses a main() method to instantiate a NumberGuesser Object and test access to its methods.
public class Main {
    public static void main(String[] args) {
        NumberGuesser myGame = new NumberGuesser(10,"Haha! Try again!");

        // **Public Access** (works everywhere)
        myGame.guess(5);

        // **Protected Access** (works inside the same package OR a subclass/interface of the superclass)
        /* To clarify, the subclass/interface inherits private variables for itself; the protected keyword
         * allows those subclasses to DIRECTLY INTERACT WITH (AN INSTANCE OF) THE SUPERCLASS!
         * As such, you probably won't need this keyword. Probably.
         */
        myGame.showHint();

        // [just to further advance the code demonstration]
        myGame.guess(6);

        // **Default Access** - private-package (works inside the same package)
        myGame.showNumOfGuesses(); // 2

        // **Private Access** (works only in the class that declared it)
        /* Throws compile-time error due to lack of access
         * myGame.giveAnswer();
         */

        String test = myGame.taunt; // works because myGame.taunt is public
        // String test2 = myGame.hint; // does not work because myGame.hint is private
        int test2 = myGame.numOfGuesses; // works because myGame.numOfGuesses is public
        // int test = myGame.numberToGuess; // does not work because myGame.numberToGuess is private
    }
}
