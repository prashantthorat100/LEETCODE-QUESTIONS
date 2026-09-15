class Solution {
    public int getBit(int num , int i){
        int bit = 0;
        bit = ((num)&(1<<i))==0?  0:  1;
        return bit;
    }
    
    public int reverseBits(int n) {
        int bit = 0;
        int ans = 0;

        for(int i = 0; i < 32; i++) {
            bit = getBit(n, i);

            if(bit == 1) {
            ans = ans | (1 << (31 - i));
        }
}

        return ans;
    }
}