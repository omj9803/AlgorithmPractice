package Stringg;

import java.util.Scanner;
public class SangSooAnswer {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int first = sc.nextInt();
             int second = sc.nextInt();
             first = reverse(first);
             second = reverse(second);
             System.out.println(first>second?first:second);
       }
       
       public static int reverse(int input)
       {
             String out = "";
             
             while(input != 0)
             {
                    out += (input%10);
                    input = input/10;
             }
             return Integer.parseInt(out);
       }
}