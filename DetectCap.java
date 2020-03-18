class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        if(word.length() == 0) return true;
        if(Character.isUpperCase(word.charAt(0))){
            //check if all letters are uppercase
            for(int i = 1; i < word.length(); i++)
                if(Character.isUpperCase(word.charAt(i))) flag = false;
            if(!flag){
                for(int i = 1; i < word.length(); i++)
                if(!Character.isUpperCase(word.charAt(i))) return false;
            }
        }else{
            //If the first letter isnt upper case. the rest should be lowercase.
            for(int i = 1; i < word.length(); i++)
                if(Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
    
    //Test cases : All uppercase is valid
    //Test case: No capital letters at all
    //Test case: Only the first letter is capital
}