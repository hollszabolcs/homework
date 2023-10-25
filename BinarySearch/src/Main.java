public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 22, 23, 25, 27};
        Search search = new Search();

        int indexOf21BinarySearch = search.getClass(array, 21);
        int indexOf22BinarySearch = search.getClass(array, 22);
        System.out.println(indexOf21BinarySearch);
        System.out.println(indexOf22BinarySearch);
    }
}