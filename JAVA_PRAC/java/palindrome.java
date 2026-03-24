import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no.:");
            int num = sc.nextInt();
            int originalNum = num;
            int reversedNum = 0;
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
            
    }
 }