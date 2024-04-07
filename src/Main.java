import java.util.Scanner;
/**
 * The Main class contains methods to calculate Fibonacci numbers using recursion.
 */
public class Main {
    /**
     * This method calculates the nth Fibonacci number.
     * It uses a recursive approach where the base cases are when n is 0 or 1.
     * For n greater than 2, it returns the sum of the previous two Fibonacci numbers.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
