class Polygon{
    void perimeter(int side){
        int peri = 4*side;
        System.out.println("The perimeter of square :"+peri);
    }
    void perimeter(int l,int b){
        int peri = 2*(l+b);
        System.out.println("The perimeter of rectangle :"+peri);
    }
    void perimeter(int s1,int s2,int s3){
        int peri = s1+s2+s3;
        System.out.println("The perimeter of triangle :"+peri);
    }
}


public class method_overload {
    public static void main(String[] args) {
        Polygon square = new Polygon();
        Polygon rectangle = new Polygon();
        Polygon triangle = new Polygon();
        square.perimeter(4);
        rectangle.perimeter(4,5);
        triangle.perimeter(7, 8, 9);
    }
}
