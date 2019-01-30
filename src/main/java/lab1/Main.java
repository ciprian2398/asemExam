package lab1;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, i;

        System.out.println("Input digits one by one. 0 for stop.");
        do {
            i = scanner.nextInt();
            sum += i;
        } while (i != 0);

        System.out.println("sum = " + sum);
    }
}
