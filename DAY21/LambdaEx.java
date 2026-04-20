@FunctionalInterface
interface Math {
    int add(int a,int b);    
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class LambdaEx {
    public static void main(String[] args) {
        Math addFunc=new Math() {
            public int add(int a,int b) {
                return a+b;
            }
        };
        System.out.println(addFunc.add(30,13));
    }
}