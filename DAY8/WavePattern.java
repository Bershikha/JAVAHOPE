import java.util.Scanner;
public class WavePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(wave(str));
    }
    static String wave(String s){
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0)
                res1.append(s.charAt(i));
            else
                res2.append(s.charAt(i)); 
        }
        return res1.toString() + res2.toString();

    }
}
