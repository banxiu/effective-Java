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
        for (int i = 0; i < balances.length; i++) {

        }
    }

}