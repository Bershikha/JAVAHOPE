class Solution {
    public String countAndSay(int n) {
        String s = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder res = new StringBuilder();
            
            int j = 0;
            while (j < s.length()) {
                int k = j;
                
                while (k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }
                
                res.append(k - j).append(s.charAt(j));
                j = k;
            }
            
            s = res.toString();
        }
        
        return s;
    }
}
