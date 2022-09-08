package prelims;

import java.util.Scanner;

public class MyDoublyLinkedList {

    public static void main(String[] args) {
//        // Create your subway line here:
//        MyDoublyLinkedList subway = new MyDoublyLinkedList();
//        subway.addToHead("Times Square");
//        subway.addToHead("Grand Central");
//        subway.addToHead("Central Park");
//        subway.printList();
//        subway.addToTail("Penn Station");
//        subway.addToTail("Wall Street");
//        subway.addToTail("Brooklyn Bridge");
//        subway.printList();
//        subway.removeHead();
//        subway.removeTail();
//        subway.printList();
//        subway.removeByData("Times Square");
//        subway.printList();
        MyLinkedList list=new MyLinkedList();
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("1-Add new node at the end of LL");
            System.out.println("2-Add new node at the beginning of LL");
            System.out.println("3-Delete a node from the end of LL");
            System.out.println("4-Delete a node from the beginning of LL");
            System.out.println("5-Print all data in the LL");
            System.out.println("6-Exit");

            System.out.print("Enter what you want to do: ");
            int n;
            n=in.nextInt();

            switch(n){

                case 1:
                    System.out.print("Enter a number: ");
                    int x;
                    x=in.nextInt();
                    list.addAtTail(x);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int y;
                    y=in.nextInt();
                    list.addAtHead(y);
                    break;
                case 3:
                    list.deleteFromTail();
                    break;
                case 4:
                    list.deleteFromHead();
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }

    public Node head;
    public Node tail;

    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(Object data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNext(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNext(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Node removedHead = this.head;

        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNext();

        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
        return removedHead.data.toString();
    }

    public String removeTail() {
        Node removedTail = this.tail;

        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if (this.tail != null) {
            this.tail.setNext(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data.toString();
    }

    public Node removeByData(String data) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNext();
        }

        if (nodeToRemove == null) {
            return null;
        }
        if (nodeToRemove == this.head) {
            this.removeHead();
        } else if (nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            Node nextNode = nodeToRemove.getNext();
            Node previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNext(nextNode);
        }
        return nodeToRemove;
    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

}
