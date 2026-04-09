class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows) return s;
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycle = 2 * (numRows - 1);
        
        for (int i = 0; i < numRows; i++) {
            
            for (int j = i; j < n; j += cycle) {
                
                // Vertical element
                result.append(s.charAt(j));
                
                // Diagonal element (for middle rows)
                int diagonal = j + cycle - 2 * i;
                
                if (i != 0 && i != numRows - 1 && diagonal < n) {
                    result.append(s.charAt(diagonal));
                }
            }
        }
        
        return result.toString();
    }
}
