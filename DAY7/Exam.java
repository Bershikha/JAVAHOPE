import java.util.*;
import java.lang.*;
 class Exam{
    public static void main(String args[]){
        Scanner sc=new(Scanner(System.in));
        String str=sc.nextLine()+" ";
        int l=str.length();
        int count=0;
        for(int i=0;i<l-1;i++){
            char x=str.CharAt(i);
            char y=str.CharAt(i+1);
            if(y==' '&&Character.isLetter(x))
                count++;
            System.out.println(count);
        }
    }
}