package Home;

import java.util.Scanner;

public class Work
{
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = consoleInput.nextLine();

        System.out.println("Please enter your favorite hobby of the listed - sports or visiting museums: ");
        String hobby = consoleInput.nextLine();

        System.out.println("Please enter your age: ");
        int age = consoleInput.nextInt();

        if (age < 18) {
            System.out.println(name + " can't buy tickets");
        } else {
            System.out.println(name + " can buy tickets");
        }
    }
}
