/**
 * Created by Joeri on 8-2-2016.
 */
public class main {

    public static void main(String[] args) {

        String logoFileName = "logo";
        System.out.println("Reading file");
        DataReader dataReader = new DataReader();
        boolean[][] logoIn = dataReader.readFile(logoFileName);


        System.out.println("Done");
    }
}
