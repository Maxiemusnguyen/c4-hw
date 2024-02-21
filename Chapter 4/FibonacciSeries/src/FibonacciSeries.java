public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 30; // Number of values to print in the Fibonacci series
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("First " + n + " values in the Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
