package bigOActivity;

public class BigO {

    // Runs in O(1) time.
    public void printOnce(String input) {
        System.out.println(input);
    }

    // Runs in O(n) time.
    public void printNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("phrase");
        }
    }

    //Runs in O(n²) time.
    public void printNSquaredTimes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("phrase²");
            }
        }
    }
}
