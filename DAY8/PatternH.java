class PatternH{
    public static void main(String args[]){
        String str="HELLO";
        int l=str.length()-1;
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            System.out.print(x);
            for(int j=0;j<str.length()/2;i++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(l));
            l--;
            System.out.println();
        }
    }
}