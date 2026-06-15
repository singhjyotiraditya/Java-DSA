class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        for (String str: strs){
            if (str.length() < minLength) minLength = str.length();
        }

        for(int i = 0; i< minLength; i++){
            for (String str: strs){
             if(str.charAt(i) != strs[0].charAt(i)) return str.substring(0, i);
           }
        }

        return strs[0].substring(0, minLength);
    }
}