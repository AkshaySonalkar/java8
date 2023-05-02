package functional_interface;

public class Main {

    public static void main(String[] args) {

        functional_example fe = (a) -> a*a;

        int result = fe.example_abstract_square(10);
        System.out.println(result);

        //default methods
        fe.method();
        fe.method1();

        //static method
        functional_example.method3();
    }
}
