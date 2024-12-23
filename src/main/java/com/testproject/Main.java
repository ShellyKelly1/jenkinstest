package com.testproject;
public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("\\W", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println("Testing add function:");
        System.out.println("add(3, 5) = " + add(3, 5)); 


        System.out.println("\nTesting factorial function:");
        System.out.println("factorial(5) = " + factorial(5)); 

        System.out.println("\nTesting isPalindrome function:");
        System.out.println("isPalindrome('A man, a plan, a canal, Panama') = " +
                isPalindrome("A man, a plan, a canal, Panama")); 
        System.out.println("isPalindrome('Hello') = " + isPalindrome("Hello")); 
    }
}
