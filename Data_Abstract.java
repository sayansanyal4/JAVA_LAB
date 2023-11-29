abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}


public class Data_Abstract {
    public static void main(String[] args) {
        Shape s;
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        s=c;
        s.draw();
        s=r;
        s.draw();
    }
}
