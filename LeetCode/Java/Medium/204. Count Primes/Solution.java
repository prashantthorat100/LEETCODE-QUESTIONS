class Solution {

    public int returnPrime(int range){
        int arr[] = new int[range];
        boolean isPrime = true;
        int n = 2;
        int idx = 0;
        int count =0;
        for(n = 2; n< range;n++){
            isPrime = true;
            for(int i =2;i<=Math.pow(n,0.5);i++){
                if(n%i==0){
                    isPrime =false;
                }
            }
            if(isPrime == true){
                arr[idx] = n; 
                idx++;
                count++;
            }
        }
        

        
        return count;
        
    }
    public int countPrimes(int n) {
        
        if(n ==0 || n ==1 || n==2){
            return 0;
        }

        // returnPrime(n);
        else{
            int count = returnPrime(n);
            return count;
        }


    }
}