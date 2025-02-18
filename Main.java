import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> getNames(ArrayList<String> names, int number) {
        ArrayList<String> namesList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count of names you want to enter: ");
        int nameCount = input.nextInt();
        for(String n : names) {
            if(names.size() == number) {
                names.add(n);
            }

        }
        return namesList;
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of names you want to enter: ");
        int nameCount = input.nextInt();
        ArrayList<String> n = new ArrayList<>();
        for(int i = 0; i < nameCount; i++) {
            System.out.println("Enter a name: ");
            String name = input.next();
            n.add(name);
        }
        System.out.println("Enter a number of character in the names you want: ");
        int number = input.nextInt();
        System.out.println(getNames(n, number));

    }
}