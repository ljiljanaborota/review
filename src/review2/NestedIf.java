package review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        nested if is one statement inside another if statement
        when we have one condition that depends on another
         */
        boolean vaccine = true;
        int dose = 0;
        if (vaccine) {
            System.out.println("how many doses you have?");


            if (dose == 1) {
                System.out.println("you need a second shot");
            } else {
                System.out.println("you are fully vacinated");
            }

        } else {
            System.out.println("i do not have a vaccine");

        }

    }
}
