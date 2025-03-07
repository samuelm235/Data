public class Main
{
    public static void main(String[] args)
    {
        Data d = new Data(5, 4);
        System.out.println(d.MAX);
        d.repopulate();
        System.out.println(d);
        int[][] g = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data d1 = new Data(g);
        System.out.println(d1.countIncreasingCols());
        int[][] g2 = {
            {10, 540, 440, 440},
            {220, 450, 440, 190},
        };
        Data d2 = new Data(g2);
        System.out.println(d2.countIncreasingCols());
    }
}