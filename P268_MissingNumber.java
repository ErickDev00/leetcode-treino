public class P268_MissingNumber {

    public int missingNumber(int[] nums) {


        int t = nums.length + 1;
        int[] copia = new int[t];

        for(int i=0; i < t; i++){
            copia[i] = i;
        }

        for (int i = 0; i < t; i++) {
            boolean encontrado = false;
            for (int num : nums) {
                if (num == copia[i]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) return copia[i];
        }


        return -1;
    }

}
