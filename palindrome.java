import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int s=0;int n=N;
        while(n>0)
        {
          s=n%10+s*10;
          n=n/10;
        }
        if(s==N)
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
        scanner.close();
    }
}
