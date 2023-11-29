class Animal{
    String genre = "Any Genre";
    void eat(){
        System.out.println("Animal eats Food");
    }
}

class Dog extends Animal{
    String genre = "Vertebrates";
    void eat(){
        System.out.println("Bone");
    }
    void display(){
        super.eat();
        System.out.println(super.genre);
        this.eat();
        System.out.println(this.genre);
    }
}


public class Super_Keyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
