/**
 * Created by Joeri on 8-2-2016.
 */
public class Solver {
    
    private boolean[][] in;

    public Solver(boolean[][] in) {
        this.in = in;
    }

    public Solution onlyLinesHorizontal() {
        Solution solution = new Solution();
        int N = in.length;
        int M = in[0].length;
        for (int n = 0; n < N; n++) {
            boolean previous = false;
            int begin = 0;
            for (int m = 0; m < M; m++) {
                boolean current = in[n][m];
                if ((previous && !current) || current && (m == M - 1)) {
                    solution.paintLine(n, begin, n, (m - 1));
                    previous = false;
                } else if (!previous && current) {
                    begin = m;
                    previous = true;
                }
            }
        }
        return solution;
    }
}
