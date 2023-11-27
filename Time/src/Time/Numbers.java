package Time;

public enum Numbers {
    ZERO(""), ONE("one"), TWO("two"), THREE("three"), FOUR("four"), FIVE("five"), SIX("six"), SEVEN("seven"),
    EIGHT("eight"), NINE("nine"), TEN("ten"), ELEVEN("eleven"), TWELVE("twelve"), THIRTEEN("thirteen"),
    FOURTEEN("fourteen"), FIFTEEN("quarter"), SIXTEEN("sixteen"), SEVENTEEN("seventeen"), EIGHTEEN("eighteen"),
    NINETEEN("nineteen"), TWENTY("twenty"), TWENTY_ONE("twenty-one"), TWENTY_TWO("twenty-two"), TWENTY_THREE("twenty-three"),
    TWENTY_FOUR("twenty-four"), TWENTY_FIVE("twenty-five"), TWENTY_SIX("twenty-six"), TWENTY_SEVEN("twenty-seven"),
    TWENTY_EIGHT("twenty-eight"), TWENTY_NINE("twenty-nine"), HALF("half");
    final String text;

    Numbers(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
