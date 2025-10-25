public class P088_MergeSortedArray {
    public void merge(int[] nums1, int n1, int[] nums2, int n2) {

        if(n1 == 0 && n2 == 1){
            nums1[0] = nums2[0];
            return;
        };

        if(n1 == 1 && n2 == 0){
            return;
        };

        int p1 = n1 - 1;
        int p2 = n2 - 1;
        int i = n1 + n2 - 1;

        while(p2 >= 0){

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

    }
}
