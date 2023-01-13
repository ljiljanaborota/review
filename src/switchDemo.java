public class switchDemo {
    public static void main(String[] args) {
        /*
        WORLD CUP AND PROVIDE WINNERS
         */
         int  worldCup = 2022;
         switch(worldCup){
             default:  // default can be anywhere,but is preferable at the end,its same as if or else if
                 System.out.println("winner is unknown");
             case 2022:
                 System.out.println("winner is Argentina");
                 break;
             case 2018:
                 System.out.println("winner is France");
               break;
             case 2014:
                 System.out.println("winner is Germany");
                 break;
         }
    }
}
