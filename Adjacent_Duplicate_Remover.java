class Solution {
    public String removeDuplicates(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(Character c : S.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else { stack.push(c); }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}