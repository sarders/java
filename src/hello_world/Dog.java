package hello_world;

public class Dog extends Animal {

    private int eyes;
    private int leg;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int leg, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.leg = leg;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("Dog.chew() called");
    }
    public void eat(){
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }


}
