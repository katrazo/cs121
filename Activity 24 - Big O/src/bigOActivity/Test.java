package bigOActivity;

public class Test {
    public static void main(String[] args) {
        BigO bigO = new BigO();

        System.out.println("\nThis method prints once:");
        bigO.printOnce("phrase");

        System.out.println("\nThis method prints n times. n is 5. It will print 5 times.");
        bigO.printNTimes(5);

        System.out.println("\nThis method prints n² times. n is 5. It will print 25 times.");
        bigO.printNSquaredTimes(5);
    }
}
