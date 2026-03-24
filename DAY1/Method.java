import java.util.Scanner;
public class Method{
    static int mul(int a,int b) {
        return a*b;
    }
    static int square(int n){
        return mul(n,n);
    }
    static void print(int n){
        System.out.println(square(n));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
        scanner.close();
    }
}