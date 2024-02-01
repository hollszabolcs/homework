package ThreeSimpleMethods;

import org.junit.Assert;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MethodsTest {
    UniqueCharacters uniqueCharacters = new UniqueCharacters();

    @ParameterizedTest
    @ValueSource(strings = {"wasd", "tha"})
    void uniqueOne(String string) {
        Assert.assertTrue(uniqueCharacters.isUnique(string));

    }

    @ParameterizedTest
    @ValueSource(strings = {"hh", "wasdfw"})
    void uniqueTwo(String string) {
        Assert.assertFalse(uniqueCharacters.isUnique(string));
    }

    PrimeCheck primeCheck = new PrimeCheck();

    @ParameterizedTest
    @ValueSource(ints = {11, 3})
    void primeOne(int number) {
        Assert.assertTrue(primeCheck.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20})
    void primeTwo(int number) {
        Assert.assertFalse(primeCheck.isPrime(number));
    }

    WordCount wordCount = new WordCount();

    @ParameterizedTest
    @ValueSource(strings = {"Meddig vemhes egy teve?"})
    void wordCounter(String string) {
        Assert.assertEquals("{1=Meddig, 2=vemhes, 3=egy, 4=teve?}", String.valueOf(wordCount.cutSentence(string)));
    }

}
