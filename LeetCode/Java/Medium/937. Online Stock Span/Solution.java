class StockSpanner {
    Stack<int[]> s;
    int index;

    public StockSpanner() {
        s = new Stack<>();
        index = -1;
    }

    public int next(int price) {
        index++;

        while (!s.isEmpty() && price >= s.peek()[0]) {
            s.pop();
        }

        int span;

        if (s.isEmpty()) {
            span = index + 1;
        } else {
            span = index - s.peek()[1];
        }

        s.push(new int[]{price, index});

        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */