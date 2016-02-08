import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joeri on 8-2-2016.
 */
public class Solution {

    private ArrayList<int[]> paintSquares = new ArrayList<>();
    private ArrayList<int[]> paintLines = new ArrayList<int[]>();
    private ArrayList<int[]> eraseCells = new ArrayList<int[]>();

    public Solution() {

    }

    public void paintSquare(int R, int C, int S) {
        paintSquares.add(new int[] {R, C, S});
    }

    public void paintLine(int R1, int C1, int S2, int C2) {
        paintLines.add(new int[] {R1, C1, S2, C2});
    }

    public void eraseCell(int R, int C) {
        eraseCells.add(new int[] {R, C});
    }

    public ArrayList<int[]> getPaintSquares() {
        return paintSquares;
    }

    public ArrayList<int[]> getPaintLines() {
        return paintLines;
    }

    public ArrayList<int[]> getEraseCells() {
        return eraseCells;
    }
}