import java.util.HashMap;
import java.util.Map;

public class BracingFunction {
    
    /**
     *  Create Bracing function
     *  Input: String
     *  Output: String
     *
     *  The function should check if bracers are in the correct order.
     *  Rules:
     *  - string should contain only braces ( ) { } [ ]
     *  - should start with an opening brace
     *  - after opening brace can be only appropriate closing brace OR any other opening brace
     *  - count of opened braces of each type should be equal to count of closed braces of the same type
     *
     *  Return values:
     *  - true - if string match Rules
     *  - 'Wrong order' - if the order of braces is mismatched
     *  - 'Wrong char' - if the string contains not allowed char
     *
     *  Examples:
     *  1. ()[]{} -> true
     *  2. {()[]{}} -> true
     *  3. {()[[]]{}} -> true
     *  4. (({{[[]]}})) -> true
     *  5. (() -> 'Wrong order'
     *  6. )( -> 'Wrong order' 
     *  7. {] -> 'Wrong order'
     *  8. ()] -> 'Wrong order'
     *  9.   -> 'Wrong char'
     */
    public static void main() {

        System.out.println(run("()[]{}"));
        System.out.println(run("{()[]{}}"));
        System.out.println(run("{()[[]]{}}"));
        System.out.println(run("(({{[[]]}}))"));
        System.out.println(run("(()"));
        System.out.println(run(")("));
        System.out.println(run("{]"));
        System.out.println(run("()]"));
        System.out.println(run(""));
    }

    public static String run(String str) {
        
        if (str.length() % 2 != 0) {
            return "Wrong order";
        }

        if (!str.matches("[({\\[)}\\]]+")) {
            return "Wrong char";
        }

        if (!(str.startsWith("(") || str.startsWith("{") || str.startsWith("["))) {
            return "Wrong order";
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        int length = str.length();
	int half = length/2;
        
        for (int i = 0; i < half; i++) {

            char next = str.charAt(i + 1);
            char inverse = map.get(str.charAt(i));

            // TODO implement other rules
            if (next != inverse) {
                return "Wrong order";
            }
        }

        return "true";
    }

}
