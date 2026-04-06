public class Wrap{
    public static Integer test(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args){  
        Integer b=Integer.valueOf("12345"); //return type->subject(Integer)
        Integer c=Integer.parseInt("0987"); //return type->int(int)
        int a=b.intValue(); //unboxing
        System.out.println(b);
        System.out.println(c);
        Integer x=128;
        x=130;
        Integer y=128;
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}