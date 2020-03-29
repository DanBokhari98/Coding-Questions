class Solution {
    public int[] diStringMatch(String S) {
        if(S.length() == 0){
            int arr[] = new int[]{0};
            return arr;
        }
        char[] arr = S.toCharArray();
        int[] ans = new int[S.length()+1];
        int i_count = 0;
        int d_count = 0;

        for(int i = 0; i < S.length(); i++){
            if(arr[i] == 'D') d_count++;
            else i_count++;
        }
        d_count += i_count;
        int c_up = 0;
        for(int i = 1; i <= S.length(); i++){
            if(i == S.length() && arr[i - 1] == 'I'){
                ans[i - 1] = c_up++;
                ans[i] = c_up++;
                break;
            }
            else if(i == S.length() && arr[i - 1] == 'D') {
                 ans[i - 1] = d_count--;
                 ans[i] = d_count--;
                break;
            }
            else if(arr[i - 1] == 'I') ans[i - 1] = c_up++;
            else if(arr[i - 1] == 'D') ans[i - 1] = d_count--;
        }
        return ans;
    }
}
