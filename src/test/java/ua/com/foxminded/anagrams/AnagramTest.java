package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void reverseWords_shouldReturnReversedInputString_whenInputStringContainsOnlyLetters() {
        assertEquals("dlroWolleH", anagram.reverseWords("HelloWorld"));
    }

    @Test
    void reverseWords_shouldReturnReversedEachWords_whenInputStringContainsOnlyLettersAndSpaces() {
        assertEquals("olleH dlroW", anagram.reverseWords("Hello World"));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInEachWords_whenInputStringContainsOnlyLettersAndNumbers() {
        assertEquals("dlr1Wo0leH", anagram.reverseWords("Hel1oW0rld"));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInWords_whenInputStringContainsOnlyLettersNumbersAndSpaces() {
        assertEquals("ole1H d0lrW", anagram.reverseWords("Hel1o W0rld"));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInWords_whenInputStringContainsOnlyLettersAndUnusualSymbols() {
        assertEquals("$dlrWol@leH", anagram.reverseWords("$HelloW@rld"));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInWords_whenInputStringContainsOnlyLettersUnusualSymbolsAndSpaces() {
        assertEquals("$olleH d@lrW", anagram.reverseWords("$Hello W@rld"));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInWords_whenInputStringContainsOnlyLettersNumbersUnusualSymbolsAndSpaces() {
        assertEquals("o@l1H d0r|W", anagram.reverseWords("H@l1o W0r|d"));
    }

    @Test
    void reverseWords_shouldReturnUnmodifiedInputString_whenInputStringContainsOnlyNumbers() {
        assertEquals("123456789", anagram.reverseWords("123456789"));
    }

    @Test
    void reverseWords_shouldReturnUnmodifiedInputString_whenInputStringContainsOnlyNumbersAndSpaces() {
        assertEquals("1234 567 89", anagram.reverseWords("1234 567 89"));
    }

    @Test
    void reverseWords_shouldReturnUnmodifiedInputString_whenInputStringContainsOnlyNumbersUnusualSymbolsAndSpaces() {
        assertEquals("12$4 5#7 &9", anagram.reverseWords("12$4 5#7 &9"));
    }

    @Test
    void reverseWords_shouldReturnEmptyString_whenInputIsEmptyString() {
        assertEquals("", anagram.reverseWords(""));
    }

    @Test
    void reverseWords_shouldReturnUnmodifiedInputString_whenInputIsSpaces() {
        assertEquals("   ", anagram.reverseWords("   "));
    }

    @Test
    void reverseWords_shouldReturnReversedOnlyLettersInWords_whenWordsOfInputStringDividedByAnyWhitespaceSymbol() {
        assertEquals(" ole1H\nd0lrW\t\ffo\rtinUJ++   ", anagram.reverseWords(" Hel1o\nW0rld\t\fof\rJUnit++   "));
    }

    @Test
    void reverseWords_shouldThrowsNullPointerException_whenArgumentIsNull() throws NullPointerException {
        Throwable thrown = assertThrows(NullPointerException.class, () -> {
            anagram.reverseWords(null);
        });
        assertEquals(thrown.getClass(), NullPointerException.class);
    }

}
