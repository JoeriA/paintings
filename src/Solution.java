import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joeri on 8-2-2016.
 */
public class Solution {

    private List paintSquares = new ArrayList<>();
    private List paintLines = new ArrayList<>();
    private List eraseCells = new ArrayList<>();

    public void paintSquare(int R, int C, int S) {
        paintSquares.add(new int[] {R, C, S});
    }

    public void paintLine(int R1, int C1, int S2, int C2) {
        paintLines.add(new int[] {R1, C1, S2, C2});
    }

    public void eraseCell(int R, int C) {
        eraseCells.add(new int[] {R, C});
    }

    public List getPaintSquares() {
        return paintSquares;
    }

    public List getPaintLines() {
        return paintLines;
    }

    public List getEraseCells() {
        return eraseCells;
    }
}