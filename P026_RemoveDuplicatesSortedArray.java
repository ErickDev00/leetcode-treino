public class P026_RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int ini = 0;

        if(nums != null){

            for(int i = 1; i < nums.length; i++){

                if(nums[i] != nums[ini]){
                    ini++;
                    nums[ini] = nums[i];
                }
            }
        }
        return ini + 1;
    }
}
