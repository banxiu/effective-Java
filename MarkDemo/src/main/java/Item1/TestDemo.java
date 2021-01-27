package Item1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * @program: effective-Java
 * @description: 核心技术测试代码
 * @author: Wangly
 * @create: 2021-01-26 14:19
 */
public class TestDemo {
    public static strictfp void main(String[] args) {
        double x = 1.23d;
        double y = 2.46d;
        double z = 1.23d;
        String greeting = "Hello";
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);
        String str = "nipples";
        int[] codePoints = str.codePoints().toArray();
        String st = new String(codePoints, 0, codePoints.length);
        char c = st.charAt(0);
        System.out.println(c);
        System.out.println(LocalDate.now().minusDays(366));
        // practive
        Scanner r = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
         int k = r.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = r.nextInt();


       /* compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)*/
        int lotteryOdds = 1;
        for (int i = 0; i < k; i++) {
            lotteryOdds = lotteryOdds * (n - i - 1);
        }
        System.out.println("Your odds are 1 in " + lotteryOdds +". Good luck!");
    }
}

