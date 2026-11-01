
import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {

        // Sort  based on starting day
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        // Min Heap based on ending day
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int day = 1;
        int i = 0;
        int maxEvent = 0;

        while (i < events.length || !pq.isEmpty()) {
            // If no events are available, jump to next start day
            if (pq.isEmpty()) {
                day = Math.max(day, events[i][0]);
            }

            // Add all events that have started
            while (i < events.length && events[i][0] <= day) {
                pq.add(events[i][1]);
                i++;
            }


            // Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend event with earliest ending day
            if (!pq.isEmpty()) {
                pq.poll();
                maxEvent++;
                day++;
            }
        }



        return maxEvent;
    }
}
