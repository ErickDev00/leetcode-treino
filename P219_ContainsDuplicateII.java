import java.util.HashSet;
import java.util.Set;

public class P219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> numSet = new HashSet<>();

        for(int i=0; i < nums.length; i++){

            if(numSet.contains(nums[i])){
                return true;
            }

            numSet.add(nums[i]);

            if(numSet.size() > k){
                numSet.remove(nums[i - k]);
            }

        }

        return false;

    }

}
