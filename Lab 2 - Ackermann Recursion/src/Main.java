public class Main {
    static int calls = 0;

    public static void main(String[] args) {
        int result = ackermann(3, 2);
        System.out.println("-=-=- Ackermann Problem Solved. Answer = " + result + ". Calls = " + calls + " -=-=-");
    }

    public static int ackermann(int m, int n) {
        calls++;
        System.out.println("called ackermann(" + m + "," + n + ")");
        if (m == 0) {
            System.out.println("m == 0; Ackermann problem solved, returning n(" + n + ")+1=" + (n+1));
            return n + 1;
        }
        else if (n == 0) {
            System.out.println("n == 0; calling ackermann(m-1,1) which is ackermann(" + (m-1) + ",1)");
            return ackermann(m-1, 1);
        }
        else {
            System.out.println("neither m nor n == 0; calling ackermann(m-1, ackermann(m,n-1)) which is ackermann(" + (m-1) + ", ackermann(" + m + "," + (n-1) + "))");
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
