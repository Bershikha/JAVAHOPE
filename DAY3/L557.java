class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
        String snew="";
        for(int i=0;i<ar.length;i++){
            String str=ar[i];
            char arr[]=str.toCharArray();
            int l=0;
            int r=str.length()-1;
            while(l<=r){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
                l++;
            }
            ar[i]=new String(arr);
        }
        return String.join(" ",ar); 
    }
}
