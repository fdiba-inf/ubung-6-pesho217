package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number = input.nextInt();
        int number1 = number;
        int reverse = 0;
        int normal = number;
        
        do {
          number = number/10;
          counter++;

        } while (number != 0);
        int array[] = new int[counter];

        for (int i = 0; i < counter; i++) {
          array[i] = number1%10;
          number1 = number1/10;
        }
        for (int i = 0;i < counter; i++) {
          reverse = reverse*10;
          reverse = array[i] + reverse;
         
        }
        if (normal == reverse) {
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Palindrome: false");
        }
    }
}
