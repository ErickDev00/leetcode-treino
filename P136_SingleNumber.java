public class P136_SingleNumber {
    public int singleNumber(int[] nums) {

        for(int i=0; i < nums.length; i++){

            boolean repete = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    repete = true;
                    break;
                }
            }

            if (!repete) {
                return nums[i];
            }

        }


        return -1;
    }

}
