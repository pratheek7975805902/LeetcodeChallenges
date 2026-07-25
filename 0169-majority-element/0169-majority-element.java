class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int maxcount=0;
        for(int x: nums){
            if(h.containsKey(x)){
               h.put(x,h.get(x)+1);
            }
            else{
                h.put(x,1);
            }
            if(h.get(x)>nums.length/2){
                  return x;  
                }
        }
        return -1;
    }
}