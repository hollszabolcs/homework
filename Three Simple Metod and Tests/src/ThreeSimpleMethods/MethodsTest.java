package ThreeSimpleMethods;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.jar.JarEntry;

public class MethodsTest {
    UniqueCharacters uniqueCharacters = new UniqueCharacters();

    @ParameterizedTest
    @ValueSource(strings = {"wasd", "tha"})
    void uniqueOne(String string) {
        Assertions.assertTrue(uniqueCharacters.isUnique(string));

    }

    @ParameterizedTest
    @ValueSource(strings = {"hh", "wasdfw"})
    void uniqueTwo(String string) {
        Assertions.assertFalse(uniqueCharacters.isUnique(string));
    }

    PrimeCheck primeCheck = new PrimeCheck();

    @ParameterizedTest
    @ValueSource(ints = {11, 3})
    void primeOne(int number) {
        Assertions.assertTrue(primeCheck.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20})
    void primeTwo(int number) {
        Assertions.assertFalse(primeCheck.isPrime(number));
    }

    WordCount wordCount = new WordCount();

    @ParameterizedTest
    @ValueSource(strings = {"Alma szép piros alma"})
    void wordCounter(String string) {
        Assertions.assertEquals("{alma=2, piros=1, szép=1}", String.valueOf(wordCount.cutSentence(string)));
    }

    JarEntry

}
