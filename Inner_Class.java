class Outer{
    int x;
    class Inner{
        int y;
    }
}
class Inner_Class{
    public static void main(String[] args) {
        Outer outerobj = new Outer();
        Outer. Inner innerobj = outerobj.new Inner();
        outerobj.x = 10;
        innerobj.y = 25;
        System.out.println("\nValue of X is: "+outerobj.x);
        System.out.println("Value of Y is: "+innerobj.y);
    }
}