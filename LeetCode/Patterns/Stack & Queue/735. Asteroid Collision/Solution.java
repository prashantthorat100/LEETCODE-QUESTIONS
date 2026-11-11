class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {

            boolean destroyed = false;

            while(!s.isEmpty() && asteroids[i] < 0 && s.peek() > 0) {

                if(s.peek() < -asteroids[i]) {
                    s.pop();
                }
                else if(s.peek() == -asteroids[i]) {
                    s.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if(!destroyed) {
                s.push(asteroids[i]);
            }
        }

        int ans[] = new int[s.size()];

        for(int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }
}