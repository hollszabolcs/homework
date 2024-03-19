package LargestProduct;

public class LargestProduct {
    public int getLargestProduct(String value, int n) {
        int result = 0;
        int counter = 0;
        int tempResult = 0;
        if (!getEdgeCases(value, n)) {
            return result = -1;
        }
        if (n == 1) {
            return result = getBiggestNumber(value);
        } else {
            n -= 1;
        }
        for (int i = 0; i < value.length(); i++) {
            int number = getInt(value, i);
            tempResult = number;
            for (int j = i + 1; j < value.length(); j++) {
                int tempNumber = getInt(value, j);
                if (number != 0 && number <= tempNumber || tempNumber - number == -1) {
                    tempResult *= tempNumber;
                    counter++;
                } else {
                    counter = 0;
                    break;
                }
                if (counter == n) {
                    if (tempResult > result) {
                        result = tempResult;
                        tempResult = 1;
                        counter = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private int getInt(String value, int count) {
        return Integer.parseInt(String.valueOf(value.charAt(count)));
    }

    private int getBiggestNumber(String value) {
        int temp = 0;
        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            int number = Integer.parseInt(String.valueOf(value.charAt(i)));
            if (number > temp) {
                temp = number;
                result = number;
            }
        }
        return result;
    }

    private boolean getEdgeCases(String value, int n) {
        return value.length() >= n && n != 0 && value.length() != 0;
    }
}
