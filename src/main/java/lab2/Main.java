package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input sentence to find \"info\"");
        System.out.println(new Scanner(System.in).nextLine().contains("info")
                ? "Sentence contains \"info\""
                : "Sentence don\'t contains \"info\"");
    }
}
