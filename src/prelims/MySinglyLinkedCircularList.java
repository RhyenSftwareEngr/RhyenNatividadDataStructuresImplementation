package prelims;

import java.util.NoSuchElementException;

public class MySinglyLinkedCircularList<E> implements MyList<E> {
    private MySinglyLinkedList head;
    public MySinglyLinkedList tail;
    public MySinglyLinkedCircularList() {
    }
    @Override
    public int getSize() {
        int count = 0;
        MySinglyLinkedList current = head;
        if (head != null) {
            do
            {
                count++;
                current = current.getNext();
            } while (current != head);
        }
        return count;
    }
    @Override
    public void insert(E data) {
        MySinglyLinkedList newNode = new MySinglyLinkedList<E>(data);
        //Checks if the list is empty.
        if (head == null)
        {
            //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        }
        else
        {
            //tail will point to new node.
            tail.setNext(newNode);
            //New node will become new tail.
            tail = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.setNext(head);
        }
    }
    @Override
    public E getElement(E data) throws NoSuchElementException {
        E element = null;
        MySinglyLinkedList<E> current = head;

        if (head != null) {
            do
            {
                if (current.getData() == data) {
                    element = current.getData();
                }
                current = current.getNext();
            } while (current != head);
        }

        if (element == null)
            throw new NoSuchElementException("No element exists");
        return element;
    }
    @Override
    public boolean delete(E data) {
        // Store head node
        MySinglyLinkedList<E> currNode = head, prev = null;
        if (currNode != null && currNode.getData() == data)
        {
            head = currNode.getNext(); // Changed head
            return true;
        }
        while (currNode != null && currNode.getData() != data)
        {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.getNext();
        }
        // If the key was present, it should be at currNode therefore the currNode
        shall not be null
        if (currNode != null)
        {
            prev.setNext(currNode.getNext());
            return true;
        }
        // If key was not present in linked list
        // currNode should be null
        return false;
    }
    @Override
    public boolean search(E data) {
        boolean index = false;
        MySinglyLinkedList<E> current = head;

        if (head != null) {
            do
            {
                if (current.getData() == data) {
                    return index;
                }
                current = current.getNext();
            } while (current != head);
        }
        return false;
    }

    @Override
    public void print() {

    }

    public String toString() {
        String str = "";
        MySinglyLinkedList<E> current = head;
        if (head != null) {
            do
            {
                //Prints each node by incrementing pointer.
                if (!str.isEmpty())
                {
                    str += "-->";
                }
                str += current.getData();
                current = current.getNext();
            } while (current != head);
        }
        return str;
    }
}

