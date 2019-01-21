package lab6;

import lab3.Bank;

import java.util.*;

public class Main {

    public static List<Bank> getListOfBanks() {
        return Arrays.asList(
                new Bank("name5", "address5", "ceo5", "webPage5", 19.5, 18.5),
                new Bank("name4", "address4", "ceo4", "webPage4", 19.4, 18.4),
                new Bank("name3", "address3", "ceo3", "webPage2", 19.3, 18.3),
                new Bank("name2", "address2", "ceo2", "webPage3", 19.2, 18.2),
                new Bank("name1", "address1", "ceo1", "webPage4", 19.1, 18.1)
        );
    }

    public static void main(String[] args) {
        List<Bank> arrayBanks = new ArrayList<Bank>(getListOfBanks());
        List<Bank> linkedBanks = new LinkedList<Bank>(getListOfBanks());

        System.out.println("Unsorted lists:");
        System.out.println("Array example");
        printUsingIterator(arrayBanks);
        System.out.println("Linked example");
        printUsingIterator(linkedBanks);

        arrayBanks.sort(Comparator.comparingDouble(Bank::getValueEU));
        linkedBanks.sort(Comparator.comparingDouble(Bank::getValueUSD));

        System.out.println("Sorted lists:");
        System.out.println("Array example");
        printUsingIterator(arrayBanks);
        System.out.println("Linked example");
        printUsingIterator(linkedBanks);
    }

    public static void printUsingIterator(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
