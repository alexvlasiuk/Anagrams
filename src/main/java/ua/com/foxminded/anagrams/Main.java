package ua.com.foxminded.anagrams;

import java.io.PrintStream;

public class Main {

    private static Anagram anagram = new Anagram();

    public static void setAnagram(Anagram anagram) {
        Main.anagram = anagram;
    }
    
    public static void setSystemOut(PrintStream printStream) {
        System.setOut(printStream);
    }

    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("\"" + str + "\" => \"" + anagram.reverseWords(str) + "\"");
        }
    }
}
