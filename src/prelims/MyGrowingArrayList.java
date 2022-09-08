package prelims;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyGrowingArrayList<E> implements MyList<E>
{
    int studentId, age, yearOfGrad; //data
    public static MyGrowingArrayList head=null; //head of the list
    MyGrowingArrayList next;
    public static Object[]  list;
    public int size = 0;
    static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
//    MyGrowingArrayList call = new MyGrowingArrayList();

    public MyGrowingArrayList() {
        this.list = new Object[5];
    }
    MyGrowingArrayList(int id, int age, int year){ //constructor
        this.studentId = id;
        this.age = age;
        this.yearOfGrad = year;
        this.next = null;
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void insert(E data)
    {

        if (size == list.length) {
            int newSize = list.length * 2;
            Object[] newList = new Object[newSize];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        list[size] = data;
        size++;
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
            throw new NoSuchElementException("No such element exists: "+ data);
        return (E) element;
    }

    @Override
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


    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("");
        for (int i = 0; i < size; i++) {
            Object ele = list[i];
            if (ele != null) {
                str.append(ele.toString());

                if (i != size - 1) {
                    str.append(",");
                }
            }
        }
        str.append("");
        return str.toString();
    }
        //Below are additional methods for implementation of the additional task application
        //To be invoked in a tester class
//    public void run() {
//        String op = "Y";
//        String choice = "";
//        while (op.equals("Y") || op.equals("y")) { //checking whether to continue
//            System.out.println("Enter the option");//showing the options
//            System.out.println("1. Add");
//            System.out.println("2. Delete");
//            System.out.println("3. Search");
//            System.out.println("4. Display");
//            choice = sc.nextLine(); //getting choice and executing the method
//            if (choice.equals("1") || choice.toLowerCase().equals("add")) {
//                System.out.print("Enter a number: ");
//                int x;
//                x=sc.nextInt();
//                call.insert(x);
//                System.out.println(call.toString());
//            } else if (choice.equals("2") || choice.toLowerCase().equals("delete")) {
//                System.out.print("Enter a number: ");
//                int x;
//                x=sc.nextInt();
//                call.getElement(x);
//                call.delete(x);
//            } else if (choice.equals("3") || choice.toLowerCase().equals("search")) {
////                LinkedList.searchNode();
//                System.out.print("Enter a number: ");
//                int x;
//                x=sc.nextInt();
//                System.out.println(call.search(x));
//            } else if (choice.equals("4") || choice.toLowerCase().equals("display")) {
//                System.out.println(call.toString());
//            }
//            System.out.println("PRESS Y or y to do another operation otherwise press any key to exit");
//            sc = new Scanner(System.in);
//            op = sc.nextLine();
//        }
//    }
    }

