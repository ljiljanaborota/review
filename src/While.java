import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("hello");
            i++;
        }
        /*
        lets ask user if he is tired
        as long as user is not tired we will say lets study java
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("are you tired");
        boolean tired=scan.nextBoolean();
        while(!tired){
            System.out.println("this is great");
            System.out.println("lets study java");
            System.out.println("are you tired");
        }
    }

}
