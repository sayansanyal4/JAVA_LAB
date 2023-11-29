class student{
    int roll;
    String name;
    String dept;
    student(){
        System.out.println("I am a CSE Student ");
    }
    student(int roll,String name, String dept){
        this.dept=dept;
        this.roll= roll;
        this.name=name;
        System.out.println("Student name : "+name);
        System.out.println("Roll No. : "+roll);
        System.out.println("Department : "+dept);
    }
}


public class construct_overload {
    public static void main(String[] args) {
        student st = new student();
        student st1 = new student(215,"Sayan Sanyal","CSE1");
    }
    
}
