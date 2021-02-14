/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int flag = 0;
        for(int i = 0, j = A.length() - 1; i<=j; i++, j--)
        {
            if(Character.toLowerCase(A.charAt(i)) != Character.toLowerCase(A.charAt(j)))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("No");
        else
            System .out.println("Yes");
    }
}
