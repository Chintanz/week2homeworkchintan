package javaprogramme;
/**write a java program to convert the upper case to lower case*/

import java.util.Scanner;
public class UpperLowerCase {
    private static Scanner sc;
    public static void main(String[] args) {
        String uprStr;

        sc= new Scanner(System.in);

        System.out.print("\nPlease Enter Uppercase String =  ");
        uprStr = sc.nextLine();

        String uprStr2 = uprStr.toLowerCase();
        System.out.println("\nThe Lowercase String  =  " + uprStr2);
    }
}
