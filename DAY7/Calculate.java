public class Calculate {
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    double add(double n1,double n2){
        return n1+n2;
    }  
}
class Main{
    public static void main(String[] args) {
        Calculate c=new Calculate();
        System.out.println(c.add(10,15));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5,7.5));
    }
}