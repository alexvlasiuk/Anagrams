package ua.com.foxminded.anagrams;

public class Anagram {
    public String reverseWords(String text) {
        String[] words = text.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(reverseLetters(word));
        }
        char[] textChars = text.toCharArray();
        char[] reversedChars = stringBuilder.toString().toCharArray();
        int letterPosition = 0;
        for (int i = 0; i < textChars.length; i++) {
            if (Character.isLetter(textChars[i])) {
                textChars[i] = reversedChars[letterPosition];
                letterPosition++;
            }
        }
        return new String(textChars);
    }

    private String reverseLetters(String word) {
        char[] wordChars = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char symbol : wordChars) {
            if (Character.isLetter(symbol)) {
                stringBuilder.append(symbol);
            }
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}