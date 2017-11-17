import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {
    
    private static int getLCM(int n)
    {
        int lcm = 1;    
        for (int i = 1; i <= n; i++)
        lcm = (lcm * i)/(getGCD(lcm, i));
        return lcm;
    }
    
    private static int getGCD(long n1,long n2)
    {
        BigInteger x = BigInteger.valueOf(n1);
        BigInteger y = BigInteger.valueOf(n2);
        BigInteger gcd = x.gcd(y);
        return gcd.intValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getLCM(n));
        }
    }
}
