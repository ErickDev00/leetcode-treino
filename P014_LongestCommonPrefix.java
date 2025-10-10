public class P014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String prefixo = strs[0];


        for (String str : strs){
            //if (str.length() < numLetras) return "";

            while (!str.startsWith(prefixo)) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);

                if (prefixo.isEmpty()) return "";
            }

        }

        return prefixo;
    }
}
