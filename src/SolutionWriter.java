import java.io.*;

/**
 * Created by Joeri on 8-2-2016.
 */
public class SolutionWriter {

    public SolutionWriter() {

    }

    public void writeSolution(Solution solution, String outputFileName) {
        try {
            // Create file
            FileWriter fstream = new FileWriter("output/" + outputFileName + ".out");
            BufferedWriter out = new BufferedWriter(fstream);

            String string = "";

            int nCommands = solution.getPaintSquares().size() + solution.getPaintLines().size() + solution.getEraseCells().size();
            string += nCommands + "\r\n";

            for (int[] square : solution.getPaintSquares()) {
                string += "PAINT_SQUARE " + square[0] + " " + square[1] + " " + square[2] + "\r\n";
            }

            for (int[] line : solution.getPaintLines()) {
                string += "PAINT_LINE " + line[0] + " " + line[1] + " " + line[2] + " " + line[3] + "\r\n";
            }

            for (int[] cell : solution.getEraseCells()) {
                string += "ERASE_CELL " + cell[0] + " " + cell[1] + "\r\n";
            }

            out.write(string);

            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error in writing file: " + e.getMessage());
        }
    }

    public void testPainting(Solution solution, String outputFileName, boolean[][] in) {
        try {
            // Create file
            FileWriter fstream = new FileWriter("output/" + outputFileName + ".test");
            BufferedWriter out = new BufferedWriter(fstream);

            boolean[][] painting = new boolean[in.length][in[0].length];

            for (int[] square : solution.getPaintSquares()) {
                for (int i = (square[0] - square[2]); i <= (square[0] + square[2]) ; i++) {
                    for (int j = (square[1] - square[2]); j <= (square[1] + square[2]); j++) {
                        painting[i][j] = true;
                    }
                }
            }

            for (int[] line : solution.getPaintLines()) {
                for (int i = line[0]; i <= line[2]; i++) {
                    for (int j = line[1]; j <= line[3]; j++) {
                        painting[i][j] = true;
                    }
                }
            }

            for (int[] cell : solution.getEraseCells()) {
                painting[cell[0]][cell[1]] = false;
            }

            String string = "";

            string += painting.length + " " + painting[0].length + "\r\n";

            for (int i = 0; i < painting.length; i++) {
                for (int j = 0; j < painting[0].length; j++) {
                    if (painting[i][j]) {
                        string += "#";
                    } else {
                        string += ".";
                    }
                }
                string += "\r\n";
            }

            out.write(string);

            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error in writing file: " + e.getMessage());
        }
    }
}
