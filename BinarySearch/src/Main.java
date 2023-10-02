public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 22, 23, 25, 27};
          Search search = new Search();

        int indexOf21BinarySearch = search.binarySearch(array, 21);
        int indexOf22BinarySearch = search.binarySearch(array, 22);

        System.out.println(indexOf21BinarySearch);
        System.out.println(indexOf22BinarySearch);
    }
}