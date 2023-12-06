package packagesDemo;

// This class will be instantiated by the test class Main
public class NumberGuesser {
    private int numberToGuess;
    private String hint;
    public int numOfGuesses;
    public String taunt;

    // I'm guessing the constructor doesn't count
    public NumberGuesser(int range, String taunt) {
        // Random number from 1-10
        this.numberToGuess = (int)(Math.random() * range + 1);
        this.hint = "Half of the number is " + ((double)numberToGuess / 2);
        this.numOfGuesses = 0;
        this.taunt = taunt;
    }

    // accessible anywhere
    public void guess (int yourGuess) {
        numOfGuesses++;
        System.out.println("You guessed: " + yourGuess);
        if (yourGuess == numberToGuess)
            System.out.println("Darn! You win!");
        else
            System.out.println(taunt);
    }

    // only accessible within this class
    private void giveAnswer() {
        System.out.println("The number to guess was: " + numberToGuess);
    }

    // protected (only accessible by subclasses, interfaces, enums, or other classes in the same package
    protected void showHint() {
        System.out.println(hint);
    }

    // default (no keyword)
    void showNumOfGuesses() {
        System.out.println("You have guessed " + numOfGuesses + " times.");
    }
}
