import java.util.ArrayDeque;
import java.util.Deque;

public class P020_ValidParentheses {
    public boolean isValid(String s) {

        //verificar se é nula ou impar;
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> pilha = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                pilha.push(')');
            } else if (c == '{'){
                pilha.push('}');
            } else if (c == '['){
                pilha.push(']');
            } else if (pilha.isEmpty() || pilha.pop() != c){
                return false;
            }

        }
        return pilha.isEmpty();

    }
}
