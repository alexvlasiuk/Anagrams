package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    ByteArrayOutputStream consoleOut = new ByteArrayOutputStream();
    PrintStream printStreamCatcher = new PrintStream(consoleOut);
    Anagram anagramMock = Mockito.mock(Anagram.class);

    @Test
    void main_shouldCorrectlyPrintResultInConsole_whenArgumentIsNotNull() {
        String[] args = new String[] { "Hello World" };
        Main.setAnagram(anagramMock);
        when(anagramMock.reverseWords("Hello World")).thenReturn("olleH dlroW");
        Main.setSystemOut(printStreamCatcher);
        Main.main(args);
        assertEquals("\"Hello World\" => \"olleH dlroW\"\r\n", consoleOut.toString());
    }

    @Test
    void main_shouldCorrectlyPrintResultInConsole_whenArgumentIsEmptyStrings() {
        String[] args = new String[] { "", "" };
        Main.setAnagram(anagramMock);
        when(anagramMock.reverseWords("")).thenReturn("");
        Main.setSystemOut(printStreamCatcher);
        Main.main(args);
        assertEquals("\"\" => \"\"\r\n\"\" => \"\"\r\n", consoleOut.toString());
    }
}
