package review4;

public class ForLoop {
    public static void main(String[] args) {
        // this is best loop to use if you know how many times will
        // break and continue

        for (int i = 2; i <=20; i+=5) {
            System.out.println(i);
            if(i==12){
                System.out.println("i is equal to 12 - i am breaking my loop");
                break;  //stop/break the loop stop printing when come to 12
            }
        }
        // continue skips current iteration
        for (int i = 1; i <=10; i++) {
            if(i%3==0){
                System.out.println(i);
                continue; // java goes back to the beginning of the loop and skips rest of the code that is
                // inside loop body
            }
            System.out.println("hello");
            System.out.println("how are you");
            System.out.println("hope you well");
        }
    }
}
