class Solution {
    public int pivotInteger(int n) {
        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];
        prefixSum[0] = 1;
        suffixSum[suffixSum.length-1] = n;

        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + (i+1);
        }
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1] + (i+1);
        }
        for(int i=0;i<prefixSum.length;i++){
            if(prefixSum[i]==suffixSum[i]){
                return i+1;
            }
        }
        return -1;
    }
}