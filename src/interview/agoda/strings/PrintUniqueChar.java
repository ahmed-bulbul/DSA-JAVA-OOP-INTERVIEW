package interview.agoda.strings;

import java.util.Scanner;

public class PrintUniqueChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Unique character in \""+ input+"\" : ");
        printUniqueCharacter(input);
    }

    private static void printUniqueCharacter(String str) {
        boolean[] unique = new boolean[128];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        }

        // update planed.....
    }
}
