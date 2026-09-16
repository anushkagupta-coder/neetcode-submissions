class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer =new int[nums.length];
        int leftproduct=1;
        int rightproduct=1;
        for(int i=0;i<nums.length;i++){
            answer[i] = leftproduct;
            leftproduct*=nums[i];

        }
        for(int j=nums.length-1;j>=0;j--){
            answer[j] *= rightproduct;
            rightproduct*=nums[j];

        }
        return answer;
    }
}  
