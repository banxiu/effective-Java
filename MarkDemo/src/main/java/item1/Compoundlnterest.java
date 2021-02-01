package item1;

/**
 * @program: effective-Java
 * @description: 利率
 * @author: Wangly
 * @create: 2021-01-29 17:29
 */
public class Compoundlnterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        // SET interest rares to 10 ... 15%
        double[] intereatRate = new double[NRATES];
        for (int i = 0; i < intereatRate.length; i++) {
            intereatRate[i] = (STARTRATE + i) / 100.0;
        }
        double[][] balances = new double[NYEARS][NRATES];
        // set initial balances to 10000
        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 10000;
        }
        // compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year ' s balances from previous row
                double oldBalance = balances[i - 1][j];
                // compute interest
                double interest = oldBalance * intereatRate[j];
                // compute this year' s balances
                balances[i][j] = oldBalance + interest;

            }
        }
        // print one row of interest rates
        for (int i = 0; i < intereatRate.length; i++) {
            System.out .printf("%9.0f%%", 100 * intereatRate[i]);
        }
        System.out.println();
        // print balance table
        for (double[] doubles : balances) {
            for (double aDouble : doubles) {
                System.out.printf("%10.2f",aDouble);
            }
            System.out.println();
        }
    }

}