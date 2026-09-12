class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        if(strs.length==1){
            return strs[0];
        }
        // for(int i=0;i<strs.length-1;i++){
        //     int idx =0;
        //     for(int j=0;j<strs[j].length();j++){
        //         if(strs[j].charAt(idx)!= strs[j+1].charAt(idx)){
        //             return sb.toString();
        //         } 
        //     }

        // }

        for(int i =0;i<strs[i].length();i++){
            int j=0;
            for(j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)!= strs[j+1].charAt(i)){
                    return sb.toString();
                } 
            }
            sb.append(strs[j].charAt(i));
        }

        return sb.toString();
    }
}