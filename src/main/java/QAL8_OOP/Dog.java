package QAL8_OOP;

public class Dog {
    //instance variable - characteristics of any future object that will be created.
    private String breed;
    private String sex;
    private float weight;
    private String name;
    private byte age;
    private String color;


    //setters and getters


    public void setBreed(String breed) {
        if (!breed.isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Error: breed is mandatory!");
        }
    }

    public void setWeight(float weight) {
        if (weight >= 0){
            this.weight = weight;
        }else {
            System.out.println("Error: weight is mandatory!");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age >= 0) {
            this.age = age;
        }else{
            System.out.println("Error: Age is mandatory!");
        }
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }
    }

    //constructor
    public Dog(String breed, String sex, float weight, String name, byte age, String color) {
        setBreed(breed);
     //   setSex(sex);
        setWeight(weight);
    }


    //method - actions that any future objects that will be created can do.
    public void bark(){
        System.out.println( this.name + " is barking! ");
    }
    public void eat() {
        System.out.println(this.name + " is Eating...");
    }


    }

