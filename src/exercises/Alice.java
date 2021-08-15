package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Hello, life is beautiful with java";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String searchTerm = input.nextLine();
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index "+ index + " and your term is  "+ length + " characters long.");
    }
}
