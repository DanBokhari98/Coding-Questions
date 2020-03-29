class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer c : arr){
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer c : map.keySet()){
            int temp = map.get(c);
            if(!set.contains(temp)) set.add(temp);
            else return false;
        }
        return true;
    }
}
