package prelims;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;  // Import the Scanner class
public class MyFixedSizeArrayList<E> implements MyList<E>
{
    static Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    public Object[]  list;
    public int size = 0;
    static MyFixedSizeArrayList<Object> fixedList = new MyFixedSizeArrayList<>();

    // copy elements from object array to integer array

    public MyFixedSizeArrayList() {
        this.list = new Object[5];
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void insert(E data) throws ListOverflowException
    {
        if (this.size < list.length) {
            list[this.size] = data;
            size++;
        } else {
            throw new ListOverflowException("List is full! No more available slots");
        }
    }

    @Override
    public E getElement(E data) throws NoSuchElementException
    {
        Object element = null;
        for (Object ele: list) {
            if (data == ele) {
                element = ele;
            }
        }
        if (element == null)
            throw new NoSuchElementException("No element exists" + data);
        return (E) element;
    }

    public boolean delete(E data)
    {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i] == data) {
                index = i;
            }
        }
        if (index > -1) {
            final int newSize;
            if ((newSize = size - 1) > index) {
                // copying elements by excluding  element to be deleted
                System.arraycopy(list, index + 1, list, index, newSize - index);
            }
            list[size = newSize] = null;
            return true;
        }

        return false;
    }

    @Override
    public boolean search(E data)
    {
        boolean exists = false;
        for (Object entity : list) {
            if (entity == data) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    @Override
    public void print() {

    }

    //    public static void searchNode() {
//        int id, count=0; //getting the id
//        System.out.println("Enter the Id: ");
////        id = sc.nextInt();
//
////        Node curNode = head;
//        if (curNode == null) { //checking if list is empty
//            System.out.println("THE LINKED LIST IS EMPTY");
//        }else {
//            while(curNode!=null) {
//                count++; //incrementing the position
//                if(curNode.studentId == id) { //check if id matched
//                    break;
//                }
//                curNode = curNode.next; //next node
//            }
////printing the result
//            if(curNode == null) {
//                System.out.println("ID not found");
//            }else {
//                System.out.println("ID found at position " + count);
//                System.out.println("ID: " + curNode.studentId + "\tAge: " + curNode.age + "\tYear: " + curNode.yearOfGrad);
//            }
//        }
//    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            Object ele = list[i];
            if (ele != null) {
                str.append(ele.toString());

                if (i != size - 1) {
                    str.append(",");
                }
            }
        }
        str.append("]");
        return str.toString();
    }
//    public static void showList() {
//        System.out.println();
//        System.out.println("----------------------");
//        System.out.println("To-Do List");
//        System.out.println("----------------------");
//        int number = 1;
//        for (int i = 0; i <fixedList.size; i++)
//        {
////            System.out.println(number + " " + fixedList.);
//            System.out.println(fixedList.size);
//            number++;
//        }
//        System.out.println("----------------------");
//    }
//    public void addItem() throws ListOverflowException {
//        System.out.println("Add Item");
//        System.out.println("----------------------");
//        System.out.print("Enter an item: ");
//        Scanner scanner = new Scanner(System.in);
//        String item = scanner.nextLine();
//        fixedList.insert(item);
//        this.size++;
//        showList();
//    }
//    public static int menu() {
//        System.out.println();
//        System.out.println("----------------------");
//        System.out.println("Main Menu");
//        System.out.println("----------------------");
//        System.out.println("0. Exit the program");
//        System.out.println("1. Display to-do list");
//        System.out.println("2. Add item to list");
//        System.out.println("3. Remove item from list");
//        System.out.println();
//        System.out.print("Enter choice: ");
//        int choice = myObj.nextInt();
//        return choice;
//    }
//    public void run() throws ListOverflowException {
//        System.out.println("MyFixedSizeArrayList:");
//        int menuItem = -1;
//        while (menuItem != 0) {
//            menuItem = menu();
//            switch (menuItem) {
//                case 1:
//                    showList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
////                    removeItem();
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("Enter a valid option");
//            }
//        }
//        try {
////            fixedList.insert("Red");
////            fixedList.insert("Green");
////            fixedList.insert("Yellow");
////            fixedList.insert("Blue");
////            fixedList.insert("Orange");
////            System.out.println("Add Item");
////            System.out.println("----------------------");
////            System.out.print("Enter an item: ");
////            Scanner scanner = new Scanner(System.in);
////            String item = scanner.nextLine();
////            fixedList.insert(item);
////            showList();
////            System.out.println("The colors under the List are the ff: ");
////            System.out.println("List : " + fixedList);
////            System.out.println("Trying to Add a 6th element");
//
//            fixedList.insert(6);  // here it should throw exception
//        } catch (ListOverflowException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Numbers of colors : " + fixedList.getSize());
//    }
}
