package com.company;
import java.util.Scanner;

public class greetwith_name {
    public static void main(String[] args) {
        System.out.println("what is ur name ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello "+name+" have a good day");
    }
}
