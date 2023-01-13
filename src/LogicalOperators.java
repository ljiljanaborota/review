public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed = true;

        boolean loginButtonClickable = false;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("test case passed");
        } else {
            System.out.println("test case failed");
        }
        System.out.println("-------------logical or------------");
        boolean dashboard = false;
        String message = "hello";
        if (dashboard || message.equals("hello")) {
            System.out.println("user is logged in");
        } else {
            System.out.println("user is not logged in");
        }
        System.out.println("--------logical not----------");
        boolean b = true;
        System.out.println(!true);

        boolean agreeCheckboxSelected = false;
        if (!agreeCheckboxSelected) {
        }
        System.out.println("i am clicking on submit button");

        boolean boo=!false;
        System.out.println(boo);
    }

}
