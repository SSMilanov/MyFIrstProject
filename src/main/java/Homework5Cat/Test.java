package Homework5Cat;

public class Test {

    public static void main(String[] args) {
    Cat brownie = new Cat ("mixed","male",12,(byte) 6,"Brownie","brown",false);

    brownie.eat();
    brownie.clean();
    brownie.sleep();
    brownie.setAddress(new Address("Sofia","Bulgaria", "Somewhere in Lyulin" ));
    }
}
