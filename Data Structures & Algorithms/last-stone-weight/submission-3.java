class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> {
            return y-x;
        });
        for(int i=0;i<stones.length;i++) pq.add(stones[i]);
        while(pq.size() != 1){
            int x = pq.remove();
            int y = pq.remove();
            if(x == y) pq.add(0);
            if(x<y) pq.add(y-x);
            if(x>y) pq.add(x-y);
        }
        if(pq.size() == 1) return pq.remove();
        else return 0;
    }
}
