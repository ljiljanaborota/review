package review6;

public class MoreStringMethod {
    public static void main(String[] args) {
        String myString="today is february 2";
        // splits this string around matches of the given regular expression
       String[] strArray= myString.split(" ");
       for(String s:strArray){
           System.out.println(s);
       }
        System.out.println("========================");
        System.out.println(myString); //today is february 2
       String newStr=myString.substring(9);
        System.out.println(newStr);
        newStr=myString.substring(9,17);
        System.out.println(newStr); //february
       int index= newStr.indexOf('b');
        System.out.println();
        String anotherStr="today is thursday";
        index=anotherStr.indexOf("thursday");
        System.out.println("index of thursday = "+index);

    }
}
