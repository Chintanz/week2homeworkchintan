package javaprogramme;
/**Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG*/

import java.util.*;
public class LowerCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}










