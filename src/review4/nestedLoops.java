package review4;

public class nestedLoops {
    public static void main(String[] args) {
        // loop inside another loop
        for (int i = 1; i <=3; i++) { // outer loop
            System.out.println(i);
            for (int j = 1; j <=4; j++) { // inner loop
                System.out.println(j);
            }
        }  //outer loop controls numbers of executions for inner loop
        for (int i = 1; i < 5; i++) {
            System.out.println("hello");
            for (int j = 1; j <=2; j++) {
                System.out.println("bye");

            }

        }
    }
}
