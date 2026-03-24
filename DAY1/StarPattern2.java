import java.util.Scanner;
public class StarPattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<5;i++){
            for(int k=0;k<n-i;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
