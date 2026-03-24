import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
