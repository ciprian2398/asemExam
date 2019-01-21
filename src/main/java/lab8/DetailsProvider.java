package lab8;

import lab3.Bank;

import java.util.Scanner;

public class DetailsProvider {
    private Scanner scanner;

    public DetailsProvider() {
        this.scanner = new Scanner(System.in);
    }

    public int getAPosition() {
        return exchangeByInt("Position: ");
    }

    public Bank getABank() {
        Bank bank = new Bank();
        bank.setName(exchangeByString("\tBank Name: "));
        bank.setAddress(exchangeByString("\tBank Address: "));
        bank.setCeo(exchangeByString("\tBank CEO :"));
        bank.setWebPage(exchangeByString("\tBank Web Page: "));
        bank.setValueEU(exchangeByDouble("\tBank Value EU: "));
        bank.setValueUSD(exchangeByDouble("\tBank Value USD: "));
        return bank;
    }

    private String exchangeByString(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    private double exchangeByDouble(String message){
        System.out.print(message);
        return scanner.nextDouble();
    }

    private int exchangeByInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
