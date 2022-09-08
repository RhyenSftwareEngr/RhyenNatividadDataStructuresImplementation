package prelims;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListTest
{
    public static Scanner sc = new Scanner(System.in); //scanner
    MyFixedSizeArrayList invoke = new MyFixedSizeArrayList();

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
                invoke.insert(x);
                System.out.println(invoke.toString());
            } else if (choice.equals("2") || choice.toLowerCase().equals("delete")) {
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                invoke.getElement(x);
                invoke.delete(x);
            } else if (choice.equals("3") || choice.toLowerCase().equals("search")) {
//                LinkedList.searchNode();
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                System.out.println(invoke.search(x));
            } else if (choice.equals("4") || choice.toLowerCase().equals("display")) {
                System.out.println(invoke.toString());
            }
            System.out.println("PRESS Y or y to do another operation otherwise press any key to exit");
            sc = new Scanner(System.in);
            op = sc.nextLine();
        }
    }
    public void run2() throws ListOverflowException {
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
                invoke.insert(x);
                System.out.println(invoke.toString());
            } else if (choice.equals("2") || choice.toLowerCase().equals("delete")) {
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                invoke.getElement(x);
                invoke.delete(x);
            } else if (choice.equals("3") || choice.toLowerCase().equals("search")) {
//                LinkedList.searchNode();
                System.out.print("Enter a number: ");
                int x;
                x=sc.nextInt();
                System.out.println(invoke.search(x));
            } else if (choice.equals("4") || choice.toLowerCase().equals("display")) {
                System.out.println(invoke.toString());
            }
            System.out.println("PRESS Y or y to do another operation otherwise press any key to exit");
            sc = new Scanner(System.in);
            op = sc.nextLine();
        }
    }

    public static void main(String[] args) throws ListOverflowException {
        ListTest display = new ListTest();
        display.run();

//        System.out.println("MyFixedSizeArrayList:");
//        MyFixedSizeArrayList<Integer> fixedList = new MyFixedSizeArrayList<Integer>();
//        try
//        {
//
////            fixedList.insert(1);
////            fixedList.insert(2);
////            fixedList.insert(3);
////            fixedList.insert(4);
////            fixedList.insert(5);
//            System.out.println("List : " + fixedList.toString());
//            System.out.println("Adding 6th element");
//            fixedList.insert(6);  // here it should throw exception
//
//            fixedList.insert(7);
//        }
//        catch (ListOverflowException e)
//        {
//            System.out.println(e.getMessage());
//        }

//        System.out.println("size of list : "+ fixedList.getSize());
//
//
//        System.out.println();
//        System.out.println("MyGrowingArrayList:");
//
//        MyGrowingArrayList<Integer> growingList = new MyGrowingArrayList<Integer>();
//        growingList.insert(1);
//        growingList.insert(2);
//        growingList.insert(3);
//        growingList.insert(4);
//        growingList.insert(5);
//        System.out.println("List : " + growingList.toString());
//        System.out.println("Adding 6th element");
//        growingList.insert(6);  // here it should add without exception
//        System.out.println("Adding 7th element");
//
//        growingList.insert(7);
//        System.out.println("List : " + growingList.toString());
//        System.out.println("size : "+ growingList.getSize());
//
//        growingList.delete(4);
//        System.out.println("After removing 4: "+ growingList.toString());
//
//        System.out.println("Search element 4: "+ growingList.search(4));
//        System.out.println("Search element 5: "+ growingList.search(5));
//
//        try {
//            System.out.println("get element 5: "+ growingList.getElement(5));
//            System.out.println("get element 10" + growingList.getElement(10));
//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
