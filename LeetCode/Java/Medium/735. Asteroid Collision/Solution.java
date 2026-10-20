class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        boolean destroyed = false;
        for(int i=0;i<asteroids.length;i++){
            destroyed = false;
            while(!s.isEmpty() && s.peek()>0 && asteroids[i]<0 ){
                if(-asteroids[i] > s.peek()){
                    s.pop();
                }
                else if(-asteroids[i]==s.peek()){
                    s.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                s.push(asteroids[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(0, s.pop());
        }
        int result[] = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}