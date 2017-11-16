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
            long n = in.nextInt();
            System.out.println(sum(n));
        }
    }
    private static long sum(long n)
    {
        long j=0,m=0;
        j=n*(n+1)*(2*n+1)/6;
        m=n*(n+1)/2;
        m=m*m;
        return Math.abs(m-j);
    }
  
}