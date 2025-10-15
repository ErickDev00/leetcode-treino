public class P028_FindIndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {

        int tam = needle.length();

        if(tam == 0){
            return 0;
        };

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            boolean achou = true;
            for(int j = 0; j < needle.length(); j++){

                if(haystack.charAt(i + j) != needle.charAt(j)){
                    achou = false;
                    break;
                }
            };

            if(achou){
                return i;
            }

        };
        return -1;
    }
}
