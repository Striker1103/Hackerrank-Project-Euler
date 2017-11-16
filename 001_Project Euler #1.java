import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(result(n));
        }
    }
    private static long result(long n)
    {
        long sum = 0;
        long a=0, b=0, d=0;
        a = (n - 1) / 3;
        b = (n - 1) / 5;
        d = (n - 1) / 15;
        sum = 3 * a * (a + 1)/2 + 5 * b * (b + 1)/2 - 15 * d * (d + 1)/2;
        return sum;
    }
}
