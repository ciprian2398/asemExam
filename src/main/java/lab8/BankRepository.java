package lab8;

import lab3.Bank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private File file;

    public void init() {
        try {
            file = new File("banks.ser");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("File \"banks.ser\" not found");
        }
    }

    public void create() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }
    }

    public void writeAll(List<Bank> bankList) {
        try {
            FileOutputStream fileOutputStream =  new FileOutputStream(file,false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bankList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Bank> readAll() {
        List<Bank> bankList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            bankList = (ArrayList<Bank>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.out.println("File \"banks.ser\" do not exist.");
        } catch (IOException e) {
        }
        return bankList;
    }
}
