package review2;

public class IfElseIf {
    public static void main(String[] args) {
        /*
         when we have more condition to test
         if(boolean condition){
         code A;
         } else if (boolean condition){
         code B;
         } else if (boolean condition){
         code C;
         }
         */
        /* check homework

        if you completed more than 25 ->great job
        if you completed more than 20 ->good job
        if you completed more than 10 ->ok job
        if you completed more than 5 ->not good job

         */
        int homework = 30;
        if (homework > 5) {
            System.out.println("not good job");
        } else if (homework > 10) {
            System.out.println("ok job");
        } else if (homework > 20) {
            System.out.println("good job");
        } else if (homework > 30) {
            System.out.println("great job");

        }

        System.out.println("------------------");
        String browser = "opera";
        if (browser.equals("chrome")) {
            System.out.println("test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("test cases executed on firefox browser");
        }else { // when none  of the condition are true, code comes to else block
            System.out.println("Browser is not supported");
        }
    }
}
