import java.util.HashMap;
public class CountLetters {

    HashMap<Character, Integer> dictionary;
    public CountLetters() {
        dictionary = new HashMap<Character,Integer>();
    }
    public HashMap<Character,Integer> countLettersMethods(String sampleString) {
        for(Character c : sampleString.toCharArray()) {
            if(dictionary.containsKey(c)) {
                dictionary.put(c, dictionary.get(c)+1);
            } else {
                dictionary.put(c, 1);
            }
        }
        for(Character key : dictionary.keySet()) {
            System.out.print(key + dictionary.get(key));
        }
        return dictionary;
    }

    public static void main(String[] args) {
        CountLetters test = new CountLetters();
        test.countLettersMethods("howareyoudoing");
    }
}
