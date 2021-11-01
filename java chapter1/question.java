package com.company;
import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        float a= 7/4.0f*9/2.0f;
        System.out.println(a);


        //question2=java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        char grade='B';
        grade=(char)(grade+8);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //question3=Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);
        System.out.println(7*49/7+35/7);
    }
}
