package review6;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        // all changes happens on the same object
        sb.reverse();  //proves that string builder is mutable
        System.out.println(sb); //olleh

        String str=sb.toString();
        str.toUpperCase();// proves that string is immutable
        System.out.println(str);// olleh

    }
}
