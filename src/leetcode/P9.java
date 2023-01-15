package leetcode;

import java.util.Arrays;

public class P9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));//121,-121,10
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }else {
            String string = String.valueOf(x);

            char[] array = new char[string.length()];
            char[] arrayTwo = new char[string.length()];

            for (int i = 0, j = arrayTwo.length-1; i < array.length && j >= 0 ; i++, j--) {
                array[i] = string.charAt(i);
                arrayTwo[j] = string.charAt(i);
            }
            return Arrays.equals(array, arrayTwo);
        }
    }
}
