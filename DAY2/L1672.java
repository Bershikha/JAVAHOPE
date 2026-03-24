class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum=sum+accounts[i][j];
            }
            maxsum=Math.max(sum,maxsum);
            sum=0;
        }
        return maxsum;
    }
}
