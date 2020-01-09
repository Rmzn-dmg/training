package com.company.list_karsılastırması.vektor;

import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<cumle.length()/2;i++){
            stack.add(cumle.charAt(i));
        }
        if (isPolindrome(cumle,stack)){
            System.out.println("cumle polindrome");
        }
        else {
            System.out.println("cumle polindrome değil..");
        }
    }
    public static  boolean isPolindrome(String cumle, Stack<Character> stack){
        for (int i=(cumle.length()/2) +1; i < cumle.length();i++){
            if (cumle.charAt(i) != stack.pop()){
                return  false;
            }
        }
        return true;
    }
}
