import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger sum = new BigInteger("0");
        String current;
        int digit = in.nextInt(); 
        in.nextLine();    
        for(int i=0;i<digit;i++)
        {
           current = in.nextLine();
           BigInteger currInt = new BigInteger(current);      
           sum = sum.add(currInt);
        }
        String finalString =  String.valueOf(sum);
        System.out.println(finalString.substring(0,10));
    }
}