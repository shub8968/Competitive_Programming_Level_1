package leetcode;

public class LongestComPrefixLC14 {

    public String longestCommonPrefix(String[] strs) {


        String pref = strs[0];
        String pref1 = "";
        if (strs == null || strs.length == 0) return "";
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 1; i < strs.length; i++){

            String s1 = strs[i];
            int k = 0;
            if(pref.length() > s1.length()){
                k = s1.length();
            }else{
                k = pref.length();
            }
            int j = 0;

            while(j < k){

                if(pref.substring(0,j+1).equals(s1.substring(0,j+1))){
                    pref1 = s1.substring(0,j+1);
                }
                if(pref1.equals("")){
                    return "";
                }
                j++;
            }

            pref = pref1;
            pref1 = "";

            s1 = strs[i];
        }

        return pref;

    }
}
