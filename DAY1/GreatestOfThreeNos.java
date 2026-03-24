import java.util.Scanner;
public class GreatestOfThreeNos{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest number is: "+a);
        }
        else if(b>a && b>c){
            System.out.println("Greatest number is: "+b);
        }
        else{
            System.out.println("Greatest number is: "+c);
        }
        scanner.close();
    }
}