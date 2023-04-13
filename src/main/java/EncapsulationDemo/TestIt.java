package EncapsulationDemo;

public class TestIt {
    public static void main(String[] args) {

        Person lora = new Person("Lora", 15);
        Person alex = new Person("Alex", 8);

        Product coffee = new Product("Coffee", 8);
        Product tea = new Product("Tea", 2);

        lora.buyProduct(tea);
        alex.buyProduct(coffee);
        lora.buyProduct(coffee);

        lora.printItemsFromTheBag();
        alex.printItemsFromTheBag();
    }
}
