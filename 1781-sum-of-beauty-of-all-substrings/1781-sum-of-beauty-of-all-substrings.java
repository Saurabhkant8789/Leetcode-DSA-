class Solution {
    public int beautySum(String s) {
        
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int [] newarr = new int[28];
            
            for( int j=i; j<s.length(); j++){
                newarr [(int)s.charAt(j)-(int)'a']++; 
                sum = sum + beauty(newarr);
                
            }
        }
        return sum;
    }
        
    public static int beauty (int[] arr){
        int max = -1;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            max = Math.max(arr[i],max);
            if(arr[i]>0){     
            min = Math.min(arr[i],min);}
        }
        return max-min;
    }
}