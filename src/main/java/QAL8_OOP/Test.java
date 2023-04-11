package QAL8_OOP;

public class Test {
    public static void main(String[] args) {
        Dog frenchBuldog = new Dog ("French Buldog","male",10.5f,"Johny",(byte) 2,"red");

        frenchBuldog.bark();
        frenchBuldog.eat();

        Dog sharo = new Dog("German Shepard","Female", 45.3f, "Sharo", (byte) 12, "Black");
        sharo.setWeight(40.0f);
        sharo.setAge((byte) 13);


    }
}
