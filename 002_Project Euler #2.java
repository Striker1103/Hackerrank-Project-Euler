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
            System.out.println(fibonacci(n));
        }
    }
    private static long fibonacci(long num)
    {
        long first = 1;
        long second = 2;
        long third = 0;
        long sum = 2;
        while(first+second<=num)
        {
                third = first+second;
                if(third%2==0)
                    sum = sum + third;
                first = second;
                second = third;
         
        }
        return sum;
    }
}
