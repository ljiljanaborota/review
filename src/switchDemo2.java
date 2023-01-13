import java.util.Scanner;

public class switchDemo2 {
    public static void main(String[] args) {
         // ask user to enter browser based on browser  execute code
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favourite browser");
        String browser=scan.nextLine();

        switch(browser){

            case "chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser in unknown - no execution");


        }



    }
}
