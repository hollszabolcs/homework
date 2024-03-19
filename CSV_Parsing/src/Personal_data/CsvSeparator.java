package Personal_data;

public enum CsvSeparator {
    SPACE, COMMA, SEMICOLON, TAB;

    public char getCsvSeparator() throws IllegalAccessException {
        switch (this) {
            case SPACE -> {
                return ' ';
            }
            case COMMA -> {
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
