package review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

int num=10;
num=11;
       // non primitive data type variable= scanner
        Scanner keyboard=new Scanner(System.in);  // we named this scanner keyboard which represents whole scanner

        System.out.println("please enter your age");
        int age=keyboard.nextInt(); // for integer values

        System.out.println("are you tired");
        boolean tired=keyboard.nextBoolean(); //for boolean values

        System.out.println("what is your name");
        String name=keyboard.next(); //for string until space whole sentences

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);


    }
}
