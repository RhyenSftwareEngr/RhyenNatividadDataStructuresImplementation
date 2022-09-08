package prelims;

import java.util.Scanner;

public class ListTest2 {
    public static Scanner sc = new Scanner(System.in); //scanner
    MyGrowingArrayList call2 = new MyGrowingArrayList();
    public static void main(String[] args) throws ListOverflowException {
        ListTest call = new ListTest();
        call.run();
    }
    public void run() throws ListOverflowException {
        String op = "Y";
        String choice = "";
        while (op.equals("Y") || op.equals("y")) { //checking whether to continue
            System.out.println("Enter the option");//showing the options
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            choice = sc.nextLine(); //getting choice and executing the method
            if (choice.equals("1") || choice.toLowerCase().equals("add")) {
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                call2.insert(x);
                System.out.println(call2.toString());
            } else if (choice.equals("2") || choice.toLowerCase().equals("delete")) {
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
//                invoke.getElement(x);
//                invoke.delete(x);
                call2.getElement(x);
                call2.delete(x);
            } else if (choice.equals("3") || choice.toLowerCase().equals("search")) {
//                LinkedList.searchNode();
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                System.out.println(call2.search(x));
            } else if (choice.equals("4") || choice.toLowerCase().equals("display")) {
                System.out.println(call2.toString());
            }
            System.out.println("PRESS Y or y to do another operation otherwise press any key to exit");
            sc = new Scanner(System.in);
            op = sc.nextLine();
        }
    }
}
