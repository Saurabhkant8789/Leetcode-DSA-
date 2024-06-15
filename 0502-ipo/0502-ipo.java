class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        PriorityQueue<int[]> minc=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<profits.length;i++) 
        {
            minc.add(new int[]{capital[i],profits[i]});
        }
        
        PriorityQueue<Integer> maxp=new PriorityQueue<>((a,b)->b-a);
        while(k-->0)
        {
            while(!minc.isEmpty() && minc.peek()[0]<=w)
            {
                maxp.add(minc.poll()[1]);
            }

            if(maxp.isEmpty())
            {
                break;
            }
            w+=maxp.poll();
        }
        return w;
    }
}