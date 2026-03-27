
import java.util.Scanner;
public class EvenLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(evenLength(str));
    }
    static String evenLength(String s){
        StringBuilder res=new StringBuilder();
        String s1="";
        s=s+" ";
        int sp=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x==' '){
                s1=s.substring(sp,i);
                sp=i+1;
                if(s1.length()%2==0)
                    res.append(s1+" ");
            }
        }
        return res.toString().trim();
    }
}
