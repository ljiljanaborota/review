package review6;

public class Garden {
    void hello(){
        String name="adem"; // local variable
        System.out.println("hello "+name);
    }
    public static void main(String[] args) {
        //static String str; cannot use static for local variable
        //System.out.println(name); error since local variable name is not visible
        Flower flower1=new Flower();
        System.out.println(Flower.pretty);// correct way accesing static varable
        flower1.name="hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;// not correct way to acces static
        // variable,but it is posible
        System.out.println("hibiscus pretty? "+flower1.pretty);
        System.out.println(flower1.price);
        //flower1.size-error because size didn't define
        // in flower class

        //accessing method of Flower class
        flower1.bloom();
        flower1.grow();
        flower1.smell();
        System.out.println("creating second object of the flower class");



        Flower flower2=new Flower();
        flower2.name="rose";
        flower2.color="blue";

        flower2.bloom();
        flower2.grow();
        flower2.smell();


        Flower flower3=new Flower();

    }
}
