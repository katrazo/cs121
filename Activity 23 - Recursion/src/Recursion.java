public class Recursion {
    public void countDown(int num) {
        if (num == 0) {
            System.out.printf("Blast Off!%n");
        }
        else {
            System.out.printf("%d...",num);
            countDown(num-1);
        }
    }

    public void alphaBackwards(char letter) {
        if (letter == 'a')
            System.out.printf("%s%n",String.valueOf(letter));
        else {
            System.out.printf("%-2c",letter);
            alphaBackwards((char)(letter - 1));
        }
    }
}
