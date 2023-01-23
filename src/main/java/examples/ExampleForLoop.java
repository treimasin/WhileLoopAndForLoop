package examples;

public class ExampleForLoop {

    public void example1() {

        // count 1 - 10
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }

    }

        public void displayUserNames(){
            String[] arrayOfUserNames = {"Kristo", "Dimka", "Lauren", "Madis"};
            for (String userName: arrayOfUserNames) {
                System.out.println("Hello " + userName + "!");
            }
    }

        public void displayProductList() {
            Product[] arrayOfProducts = {
            new Product("Rice", 20.45),
            new Product("Ipad", 888.888),
            new Product("Apple Watch", 5.45),
            new Product("Book", 546.45),
            new Product("Apple", 1856.45),
            };
            for (int counter = 0; counter < arrayOfProducts.length; counter++){
                System.out.println(arrayOfProducts[counter].name + " - " + arrayOfProducts[counter].price);

            }

    }
}



