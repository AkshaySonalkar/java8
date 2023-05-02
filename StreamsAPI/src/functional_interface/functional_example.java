package functional_interface;

public interface functional_example {

    public int example_abstract_square(int val);

    public default void method(){
        System.out.print("Hello ");
    }

    public default void method1(){
        System.out.print("World !");
    }

    public static void method3(){
        System.out.print("!!");
    }
}
