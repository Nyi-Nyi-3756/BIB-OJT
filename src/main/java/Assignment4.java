package main.java;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

    // Split full name into words and store in ArrayList
    public static ArrayList<String> splitName(String fullName) {
        ArrayList<String> userName = new ArrayList<>();
        for (String word : fullName.split(" ")) {
            userName.add(word);
        }
        return userName;
    }

    // Print name in reverse
    public static void printReverse(ArrayList<String> userName) {
        System.out.print("Your reversed name is: ");
        for (int i = userName.size() - 1; i >= 0; i--) {
            System.out.print(userName.get(i) + " ");
        }
        System.out.println();
    }

    // Print original name
    public static void printOriginal(ArrayList<String> userName) {
        System.out.print("Your original name is: ");
        for (int i = 0; i < userName.size(); i++) {
            System.out.print(userName.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Please enter your name: ");
        String fullName = sc.nextLine();

        // Store in ArrayList
        ArrayList<String> userName = splitName(fullName);

        // Output
        printReverse(userName);
        printOriginal(userName);

        sc.close();
    }
}