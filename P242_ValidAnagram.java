import java.util.HashMap;

public class P242_ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapOne = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();

        for(char l : s.toCharArray()){
            mapOne.put(l, mapOne.getOrDefault(l, 0) + 1);
        }

        for (char l : t.toCharArray()) {
            mapTwo.put(l, mapTwo.getOrDefault(l, 0) + 1);
        }

        return mapOne.equals(mapTwo);
    }

}
