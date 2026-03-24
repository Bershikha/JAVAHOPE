import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=5;i>0;i--){
            /*for(int k=n-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=2*(i-1)+1;j>0;j--) {
                System.out.print("*");
            }
            */
           for(int k=0;k<n-i;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*(i-1)+1;j++) {
                System.out.print("*");
            }
                
            System.out.println();
        }
    }
    }

