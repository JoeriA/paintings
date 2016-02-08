import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by Joeri on 8-2-2016.
 */
public class DataReader {
    /**
     * Create datareader
     */
    public DataReader() {

    }

    /**
     * Create dataset from file defined in filename
     *
     * @param fileName string with file location and name
     * @return dataset from file
     */
    public boolean[][] readFile(String fileName) {

        BufferedReader reader = null;
        boolean[][] in = null;

        try {
            reader = new BufferedReader(new FileReader("input/" + fileName + ".in"));

            // Read number of customers
            String line = reader.readLine();
            String[] split = line.split(" ");
            int N = Integer.parseInt(split[0]);
            int M = Integer.parseInt(split[1]);

            in = new boolean[N][M];

            for (int n = 0; n < N; n++) {
                line = reader.readLine();
                for (int m = 0; m < M; m++) {
                    String s = line.substring(m, m+1);
                    in[n][m] = (Objects.equals(s, "#"));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the reader");
            }
        }

        return in;
    }
}
