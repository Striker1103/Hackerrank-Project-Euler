import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        for(int i =0 ;i <t;i++)
        {
            String str = sc.nextLine();
            list.add(str);
        }
        Collections.sort(list);
        int q = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<q;i++)
        {
            String str1 = sc.nextLine();
            System.out.println(cal(list.indexOf(str1),str1));
        }
    }
    private static int cal(int x,String str)
    {
        int sum = 0;
        for(int i =0; i<str.length();i++)
        {
            char character = str.charAt(i); 
            int ascii = (int) character; 
            sum = sum + ascii - 64;
        }
        return sum*(x+1);
    }
}