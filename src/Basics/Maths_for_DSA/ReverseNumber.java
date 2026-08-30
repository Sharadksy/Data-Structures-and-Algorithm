package Basics.Maths_for_DSA;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reversed number is: " + getReverseInt(num));

    }

    static int getReverseInt(int num){
        int reverse = 0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        return reverse;
    }}
