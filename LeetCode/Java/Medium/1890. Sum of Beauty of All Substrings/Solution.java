class Solution {

    public int getMax(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public int getMin(int arr[]){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                min = Math.min(arr[i],min);
            }
        }
        return min;
    }
    public int beautySum(String s) {
        int n = s.length();
        
        int maxFreq = 0;
        int minFreq = s.length();
        // int beauty = -1;
        int sum = 0;

        for(int i=0;i<n;i++){
            int arr[] = new int[26];
            
            maxFreq = 0;
            minFreq = s.length();
            for(int j=i;j<n;j++){
                arr[s.charAt(j) -'a']++;
                maxFreq = getMax(arr);
                minFreq = getMin(arr);
                sum = sum + (maxFreq-minFreq);
            }
        }
        return sum;
    }
}