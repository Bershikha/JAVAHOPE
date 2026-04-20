import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}
public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> isEven=(n)->n%2==0;
        Predicate<Integer> isOdd=isEven.negate();
        System.out.println(isEven.test(99999)); 
        Predicate<Student> isPassed=(s)->s.mark>=40;
        System.out.println(isPassed.test(new Student(45)));
    }
}
