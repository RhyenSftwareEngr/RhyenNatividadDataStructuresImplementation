package prelims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestToDoList {

    private static List<String> currentList = new ArrayList<String>();
    static MyGrowingArrayList<String> list = new MyGrowingArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ListOverflowException {
        MyGrowingArrayList call = new MyGrowingArrayList();
//        call.run();
        MyFixedSizeArrayList call2 = new MyFixedSizeArrayList();
//        call2.run();

    }

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit the program");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println();
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        return choice;
    }
}