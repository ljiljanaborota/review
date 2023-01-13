package first.review1;

public class WhatIf {
    public static void main(String[] args) {
        int a=10;
        int b=20;
         String c="Hello";
         String d="Java";
        System.out.println(a+b+c+d); //30helloJava
        System.out.println(a+c+d+b);//10helloJava20
        System.out.println(c+d+a+b); //helloJava1020
        System.out.println(c+d+(a+b));// HelloJava30
        // Arithmetic Operations Java follow as Math
        // first + , then - ,then * , then / , then % ,

    }
}
