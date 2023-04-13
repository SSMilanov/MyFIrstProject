package Homework5Cat;

public class Pet {
    private String breed;
    private String sex;
    private float weight;
    private String name;
    private byte age;
    private String color;
    private Address Address;

    //Setters and Getters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println(" Error Breed is mandatory ");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()){
           this.sex = sex;
        }
        else {
            System.out.println(" Error Sex is mandatory ");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }
        else {
            System.out.println(" Error Invalid weight");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println(" Error Name is mandatory  ");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
    } else {
            System.out.println("Error: invalid age");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: color is mandatory");
        }
    }

    public Homework5Cat.Address getAddress() {
        return Address;
    }

    public void setAddress(Homework5Cat.Address address) {
        this.Address = address;
    }

    public Pet(String breed, String sex, float weight, String name, byte age, String color){
        setBreed(breed);
        setSex(sex);
        setWeight(weight);
        setName(name);
        setAge(age);
        setColor(color);
    }

    public void eat(){
        System.out.println(this.name + " is eating! do not Pet! ");
    }
    public void clean(){
        System.out.println(this.name + " is cleaning itself, be careful! ");
    }

    public void pet(){
        System.out.println(this.name + " Purrs -Purr -Purr ");
    }
}

