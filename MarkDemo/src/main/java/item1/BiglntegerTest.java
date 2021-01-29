package item1;

import java.math.BigInteger;
import java.util.Arrays;
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
 * • BigDecimal add(BigDecimal other)
 * • BigDecimal subtract(BigDecimal other)
 * • BigDecimal multipiy(BigDecimal other)
 * • BigDecimal divide(BigDecimal other, RoundingMode mode) 5.0
 * 返回这个大实数与另一个大实数 other 的和、 差、 积、 商。要想计算商，
 * 必须给出舍入方式 （ rounding mode。) RoundingMode.HALF_UP 是在学校中学习的四舍五入方式
 * , 数值 0 到 4 舍去， 数值 5 到 9 进位）。它适用于常规的计算。有关其他的舍入方式请参看 Api文档。
 * • int compareTo(BigDecimal other)
 * 如果这个大实数与另一个大实数相等， 返回 0 ; 如果这个大实数小于另一个大实数，
 * 返回负数；否则，返回正数。
 * • static BigDecimal valueOf(long x) • static BigDecimal valueOf(1 ong x ,int scale)
 * 返回值为 X 或 x / 10scale 的一个大实数
 *
 * 一旦创建了数组， 就不能再改变它的大小（尽管可以改变每一个数组元素）0 如果经常需
 * 要在运行过程中扩展数组的大小， 就应该使用另一种数据结构—数组列表（ arraylist) 。
 *
 * 也就是说 数组没办法合并 如果元素个数相同的数组可以，
 * 长度不相同的两个数组 没办法合并
 *
 * 增强for
 * for (variable : collection) statement
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

        // 抽小球
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);
            // pick the element at the random location
            result[i] = numbers[r];
            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }
        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r);
        }
    }
}