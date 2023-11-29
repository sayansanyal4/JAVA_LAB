class student{
    static int roll;
    static String name;
    static void learn(){
        System.out.printf("\n %s is Learning JAVA Language \n",name);
    }
}

class Static_Keyword{
    public static void main(String[] args) {
        student.roll =215;
        student.name = "Sayan Sanyal";
        student.learn();
    }
}