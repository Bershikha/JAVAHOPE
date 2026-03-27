import java.util.Scanner;

public class SecSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(secSmall(str));
    }
    static String secSmall(String s){
        String small="";
        String sesmall="";
        String s2="";
        int sp=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x==' '){
                s2=s.substring(sp,i);
                if(s2.length()>0 && s2.length()<small.length()){
                    sesmall=small;
                    small=s2;
                }
            }
        }
        return sesmall;
    }
}
