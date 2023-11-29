class Animal{
    void makeSound(){
        System.out.println("Some Generic Sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Woof! Woof!");
    }
    void wagJail(){
        System.out.println("Jail is wagging!!!");
    }
}


public class method_override {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.wagJail();
    }
}
