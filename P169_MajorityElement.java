public class P169_MajorityElement {

    public int majorityElement(int[] nums) {

        int tam = nums.length;
        int met = tam/2;

        for(int i = 0; i < tam; i++){
            int cont = 0;

            for(int p=0; p < tam; p++){

                if(nums[i] == nums[p]){
                    cont++;
                }
            }

            if(cont > met){
                return nums[i];
            }
        }

        return -1;

    }

}
