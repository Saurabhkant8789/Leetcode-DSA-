class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String oo = "";
        
     String min = strs[0];
        for(int i=0; i<strs.length;i++){
            if(strs[i].length()<min.length()){
                min =strs[i];
            }
        }
        
        for(int i=0; i<min.length();i++){
            char xy = min.charAt(i);
            
            for(int j=0; j<strs.length;j++){
                // if(i<strs[j].length()){
                if(xy != strs[j].charAt(i)){
                    
                 return oo;
             // }
                    
            }
            
            }  oo = oo+xy;
        }
        return oo;
        
    }
}