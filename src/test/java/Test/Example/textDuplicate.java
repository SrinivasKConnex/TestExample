package Test.Example;
public class textDuplicate {
    public static void main(String[] args) {
        String text = "aabccdee";
        StringBuilder result = new StringBuilder();
        
        // Loop through the string to count occurrences
        for (int i = 0; i < text.length(); i++) {
            // Check if this character has already been counted
            if (i > 0 && text.charAt(i) == text.charAt(i - 1)) {
                continue;
            }

            // Count occurrences of the current character
            char currentChar = text.charAt(i);
            int count = 0;
            for (int j = i; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            // Append the character and its count to the result
            result.append(currentChar).append(count);
        }
        
        // Print the result
        System.out.println(result.toString());
    }
}
