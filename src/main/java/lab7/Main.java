package lab7;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //divided by 0
        try{
            int a = 1;
            a/=0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        // sqrt form -         NOT THROWN
        try{
            double a = Math.sqrt(-1.0);
        }catch (Exception e){
            e.printStackTrace();
        }

        // iaobe
        try{
            List a = new LinkedList();
            a.get(1);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        // char instead digit
        try{
            int a = Integer.valueOf("asd");
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        // null reference
        try{
            String a = null;
            a.trim();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        // Own method
        try{
            throwMyOwnException();
        }catch (MyOwnException e){
            e.printStackTrace();
        }
    }

    private static void throwMyOwnException() throws MyOwnException {
        throw new MyOwnException();
    }
}

class MyOwnException extends Exception{
    @Override
    public String getMessage() {
        return "My message";
    }
}