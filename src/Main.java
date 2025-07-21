import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();

        System.out.println("Sum of two numbers: " + sumOfTwoNumbers(n, m));
    }

    public static int sumOfTwoNumbers(int n, int m){
        int sum = n + m;
        return sum;
    }

    public static int diffOfTwoNumbers(int n, int m){
        int diff = n + m;
        return diff;
    }
}
