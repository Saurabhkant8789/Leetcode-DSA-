class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < dict.size(); j++){
                String st = dict.get(j);
                if(arr[i].startsWith(st)){
                    if(st.length() < arr[i].length()){
                        arr[i] = st;
                    }
                }
            }
        }
        return String.join(" ", arr);
    }
}