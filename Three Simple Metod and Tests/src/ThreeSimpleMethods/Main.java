package ThreeSimpleMethods;

public class Main {
    public static void main(String[] args) {
        UniqueCharacters exercise = new UniqueCharacters();
        WordCount wordCount = new WordCount();
        PrimeCheck primeCheck = new PrimeCheck();
        System.out.println(exercise.isUnique("wasdfghjkl"));
        System.out.println(wordCount.cutSentence("Meddig vemhes egy teve?"));
        System.out.println(primeCheck.isPrime(11));
    }
}
