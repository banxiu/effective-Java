package item1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @program: effective-Java
 * @description: java核心技术第一卷-BiglntegerTest
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * @author: Wangly
 * @create: 2021-01-27 16:09
 * • Biglnteger add(Biglnteger other)  和
 * • Biglnteger subtract(Biglnteger other) 差
 * • Biglnteger multipiy(Biginteger other) 积
 * • Biglnteger divide(Biglnteger other) 商
 * • Biglnteger mod(Biglnteger other) 余
 * 返冋这个大整数和另一个大整数 other•的和、 差、 积、 商以及余数。
 * compareTo: 正常其它数据类型规则是
 * CompareTo(xx x,xx y)
 * x<y : -1
 * x=y : 0
 * x>y : 1
 * BigInteger :
 *
 *
 * public int compareTo(BigInteger val) {
 *         if (this.signum == val.signum) {
 *             switch(this.signum) {
 *             case -1:
 *                 return val.compareMagnitude(this);
 *             case 1:
 *                 return this.compareMagnitude(val);
 *             default:
 *                 return 0;
 *             }
 *         } else {
 *             return this.signum > val.signum ? 1 : -1;
 *         }
 *     }
 *
 *
 */
public class BiglntegerTest {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
        *//* compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)*//*
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i < k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 in " + lotteryOdds +". Good luck!");*/
        System.out.println((long)16 & 4);
        //十进制转二进制 控制台显示
        System.out.println(Integer.toBinaryString(4));

    }
}