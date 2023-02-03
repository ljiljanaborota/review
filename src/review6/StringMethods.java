package review6;

public class StringMethods {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str.length()); //5
        System.out.println(str.toUpperCase()); //HELLO
        System.out.println(str.charAt(1));// e
        String newString=str.concat(" friends");
        System.out.println(newString);// hello friends
        System.out.println(str); // hello
        str=str.toLowerCase();
        System.out.println(str);

        // check if lenght of the String is more than o
       boolean empty= str.isEmpty();
        System.out.println(empty);

        String str1="  review b15   ";
        // remove any leading or trailing white spaces
       String newStr1= str1.trim();
        System.out.println(str1);
        System.out.println(newStr1);


    }


}
