public class StringFun {
    public static void main(String[] args) {
        String s="learning java programming";
        for(char c:s.toCharArray()) {
            System.out.println(c);
        }
        s=s.replace("java","python");
        
        StringBuilder s3=new StringBuilder(s);
        char[] ch={'a','b','c'};
        System.out.println(new String(ch));

    }
}
