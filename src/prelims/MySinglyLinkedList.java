package prelims;

import java.util.Scanner;

public class MySinglyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

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

//        MySinglyLinkedList sList = new MySinglyLinkedList();
//        sList.addNode(1);
//        sList.addNode(2);
//        sList.addNode(3);
//        sList.addNode(4);
//        sList.display();
    }
}
