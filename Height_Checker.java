class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length == 0) return 0;
        int temp[] = heights.clone();
        Arrays.sort(temp);
        int incorrect = 0;
        for(int i = 0; i < heights.length; i++){
            if(temp[i] != heights[i]) incorrect++;
        }
        return incorrect;
    }
}
