public class Student {
    static void change(Student s){
        s.marks=20;
        System.out.println("Inside Method:"+s.marks);
    }
    private int marks;
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks=50;
        change(s1);
        System.out.println("Outside Method :"+s1.marks);
    }
}
