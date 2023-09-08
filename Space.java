public class Space {
    private final char RANK; // colum letter
    private final byte FILE; // row number
    private final String COLOR;
    private Piece piece = null;

    public Space(file, rank, color) {
    FILE = file;
    RANK = rank;
    COLOR = color;
    }
}
