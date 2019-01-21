package lab8;

import java.util.Scanner;

public class View {
    private BankController controller;

    public View(BankController controller) {
        this.controller = controller;
    }

    public void initUI() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.print("/app> ");
            input = scanner.next();
            processInput(input);
        }while (!input.equalsIgnoreCase("exit"));
    }

    private void processInput(String input) {
        switch (input) {
            case "create": controller.create(); break;
            case "print": controller.print(); break;
            case "insert": controller.insert(); break;
            case "modify": controller.modify(); break;
            case "delete": controller.delete(); break;
            case "process": controller.process(); break;
            case "help": printMenu(); break;
            case "exit": System.exit(0);
        }
    }

    private static void printMenu() {
        System.out.println(
                "==========MENU============\n" +
                "create\t Create file.\n" +
                "print\t Print from file.\n" +
                "insert\t Insert an element.\n" +
                "modify\t Change an element.\n" +
                "delete\t Delete an element.\n" +
                "process\t Process elements.\n" +
                "exit\t Exit from program.\n");
    }
}
