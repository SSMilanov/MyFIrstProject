package Homework5Cat;

public class Cat extends Pet {
    private boolean hasNails;
    public boolean isHasNails(){
        return hasNails;
    }
    public void setHasNails(boolean hasNails) {
        this.hasNails = hasNails;
    }
    public Cat (String breed, String sex, float weight,byte age, String name, String color, boolean hasTail) {
        super(breed, sex, weight, name, age, color);
        setHasNails(hasTail);
    }
    public void sleep() {
        System.out.println(this.getName() + " is sleeping. Shhhh! " );
    }
}
