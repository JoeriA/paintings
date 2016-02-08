/**
 * Created by Joeri on 8-2-2016.
 */
public class main {

    public static void main(String[] args) {

        String logoFileName = "logo";
        System.out.println("Reading file");
        DataReader dataReader = new DataReader();
        boolean[][] logoIn = dataReader.readFile(logoFileName);

        Solution solution = new Solution();
        solution.paintSquare(1,2,3);
        solution.paintLine(1,2,3,4);
        solution.eraseCell(1,2);

        System.out.println("Done");
    }
}
