import examples.ExampleForLoop;
import examples.ExampleWhileLoop;

public class Main {
    public static void main(String[] args) {
        ExampleForLoop exampleForLoop = new ExampleForLoop();
        exampleForLoop.example1();
        exampleForLoop.displayUserNames();
        exampleForLoop.displayProductList();

        System.out.println("==== While Loop Stuff====");
        ExampleWhileLoop exampleWhileLoop = new ExampleWhileLoop();
        exampleWhileLoop.example1();
        exampleWhileLoop.exampleCount1to10();



    }

}
