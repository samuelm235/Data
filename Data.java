public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int rows, int columns)
    {
        grid = new int[row][columns];
    }

    /**
     * Fills all elements of grid with randomly generated
     * values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() {
        /* to be implemented in part (a) */
    }


    /**
     * Returns the number of columns in
     * grid that are in increasing order, as
     * described in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() {
        /* to be implemented in part (b) */
    }

    public String toString()
    {
        String s = "";
        for(int[] row : grid)
        {
            for(int col : row)
            {
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }
    // There may be instance variables, constructors
    //and methods that are not shown.
}
