public class P067_AddBinary {
    public String addBinary(String a, String b) {

        int vaiUm = 0;
        String res = "";

        int ia = a.length() -1;
        int ib = b.length() -1;

        while(ia >= 0 || ib >= 0 || vaiUm > 0){

            int bitA = (ia >= 0) ? a.charAt(ia) - '0' : 0;
            int bitB = (ib >= 0) ? b.charAt(ib) - '0' : 0;

            int soma = bitA + bitB + vaiUm;

            if(soma == 0){
                res = "0" + res;
                vaiUm = 0;
            } else if (soma == 1) {
                res = "1" + res;
                vaiUm = 0;
            } else if (soma == 2) {
                res = "0" + res;
                vaiUm = 1;
            } else { // soma == 3
                res = "1" + res;
                vaiUm = 1;
            };

            ia--;
            ib--;
        }

        return res;
    }
}
