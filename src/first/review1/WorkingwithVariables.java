package first.review1;

public class WorkingwithVariables {
    public static void main(String[] args) {
        //create a variable and store value into it
        //declared a variable and initialized it
        int number=10;

        //declared a variable
        int num; //declarations of a variable happens only once
        num=100; //initialize the variable
        num=200; //reassign the value;
        System.out.println(num); //200
        boolean hungry=false;
        hungry=true;
        String myString="Hello";
        String name="Artem";
        String address="123 test drive";
        //hello Artem
        System.out.println(myString+"  "+name);
        int age=21;
        //Artem is 21 years old
        System.out.println(name +" is "+age+" years old");
        /*
        if we want to battach String to anything:
        string to another string
        string to int
        string to boolean
        string to char
        we use +  act as concatenation(attached)
         */
        //when we have 2 numeric values + act as addition
        String month="December";
        int day=14;
        // 14 december
        System.out.println(day+" "+month); //1december
        char date='1';
        System.out.println(date+month);






    }
}
