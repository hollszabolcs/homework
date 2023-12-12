package Personal_data;

public enum CsvSeparator {
    SPACE, COMA, SEMICOLON, TAB;

    public char getCsvSeparator() throws IllegalAccessException {
        switch (this) {
            case SPACE -> {
                return ' ';
            }
            case COMA -> {
                return ',';
            }
            case SEMICOLON -> {
                return ';';
            }
            case TAB -> {
                return '9';
            }
            default -> throw new IllegalAccessException("Unexpected value: " + this);
        }
    }
}
