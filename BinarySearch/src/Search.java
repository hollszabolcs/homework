public class Search {
    public static int binarySearch(int[] array, int number) {
        return binarySearch(array, number, 0);
    }

    private static int binarySearch(int[] array, int number, int offset) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int middle = leftIndex + (rightIndex - leftIndex) / 2;
            int middleElement = array[middle];
            if (number == middleElement) {
                return offset + middle;
            } else if (number < middleElement) {
                rightIndex = middle - 1;
            } else {
                leftIndex = middle + 1;
            }

        }
        return -1;
    }
}
