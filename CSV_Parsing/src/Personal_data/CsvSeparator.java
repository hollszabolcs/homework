package Personal_data;

public enum CsvSeparator {
    space, coma, semicolon, tab;

    public char getCsvSeparator() throws IllegalAccessException {
        switch (this) {
            case space -> {
                return ' ';
            }
            case coma -> {
                return ',';
            }
            case semicolon -> {
                return ';';
            }
            case tab -> {
                return '9';
            }
            default -> throw new IllegalAccessException("Unexpected value: " + this);
        }
    }
}
