class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count =numBottles;
        int rem =0;
        int fill = 0;
        int emp = numBottles;
        while(numBottles >= numExchange){
            fill = numBottles/numExchange;
            rem = numBottles%numExchange;
            count = count + fill;
            emp =  fill+rem;
            numBottles = emp;
        }
        return count;
    }
}