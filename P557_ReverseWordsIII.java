public class P557_ReverseWordsIII {
    public String reverseWords(String s) {

        String res = "";
        int l = 0;
        int r = 0;

        while(r < s.length()){

            if(s.charAt(r) != ' '){
                r++;
            } else {
                for(int i = r-1; i >= l; i--){
                    res += s.charAt(i);
                }

                res += " ";
                r++;
                l = r;
            }

        }

        for (int i = r - 1; i >= l; i--) {
            res += s.charAt(i);
        }

        return res;

    }

}
