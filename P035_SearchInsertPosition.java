public class P035_SearchInsertPosition {

        public int searchInsert(int[] nums, int target) {

            if(nums.length == 0){
                return 0;
            }

            int at = 0;

            for(int i = 0; i < nums.length; i++){

                at = nums[i];

                if(at == target){
                    return i;
                } else if(at >= target) {
                    return i;
                }

            }
            return nums.length;

        }


}
