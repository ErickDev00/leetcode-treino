public class P058_LengthOfLastWord {

        public int lengthOfLastWord(String st) {

            char spa = ' ';
            char at;

            int count = 0;

            for(int i = st.length() - 1; i >= 0 ; i--){

                at = st.charAt(i);

                if(at == spa && count != 0){
                    break;
                }else if(at == spa){
                    continue;

                } else{
                    count++;
                }

            }

            return count;

        }
    }


