public class P704_BinarySearch {

    public int search(int[] nums, int target) {

        int l=0;
        int r=nums.length - 1;

        while(l <= r){

            int met = l+(r-l)/2;

            if(nums[met] == target){
                return met;
            } else if(nums[met] < target){
                l = met+1;
            } else {
                r = met-1;
            }

        }

        return -1;


    }

}
