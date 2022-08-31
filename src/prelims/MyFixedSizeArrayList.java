package prelims;

import java.util.NoSuchElementException;
import java.util.Scanner;  // Import the Scanner class
public class MyFixedSizeArrayList<E> implements MyList<E>
{
    static Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    public Object[]  list;
    public int size = 0;

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
            throw new NoSuchElementException("No element exists");
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

    public void run() {
        System.out.println("MyFixedSizeArrayList:");
        MyFixedSizeArrayList<Object> fixedList = new MyFixedSizeArrayList<>();
        try {
            fixedList.insert("Red");
            fixedList.insert("Green");
            fixedList.insert("Yellow");
            fixedList.insert("Blue");
            fixedList.insert("Orange");
            System.out.println("The colors under the List are the ff: ");
            System.out.println("List : " + fixedList);
            System.out.println("Trying to Add a 6th element");
            fixedList.insert(6);  // here it should throw exception

        } catch (ListOverflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Numbers of colors : " + fixedList.getSize());
    }
}
