package prelims;
import java.util.NoSuchElementException;
public class MyLinkedList<E> implements MyList<E> {
    /**
     Constructor that constructs an empty LinkedList
     */
    public Node head;
    private int size = 0; // Number of elements in the list
    /**
     Constructor that constructs an empty LinkedList
     */
    public MyLinkedList() {
// to do
    }
    public int getSize() {
// to do
        return 0;
    }
    public void insert(E data) throws ListOverflowException {
// to do
    }

    public E getElement(E data) throws NoSuchElementException {
// to do
        return null;
    }
    public boolean delete(E data) { // returns false if the data is not deleted in the list
// to do
        return false;
    }

    @Override
    public boolean search(E data) {
        return false;
    }

    @Override
    public void print() {

    }

    public void addAtTail(E item) {
// to do
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(item);
        }
        else{
            while(tail.getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(item));
        }
    }
    public void addAtHead(E item) {
// to do
        Node newHead = new Node(item);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead != null){
            this.head.setNext(currentHead);
        }
    }
    public String deleteFromHead(){
// to do
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        }
        this.head = removedHead.getNext();
        return removedHead.data.toString();
    }
    //    public void deleteFromTail(){
//// to do
//    }
    public void deleteFromTail() {
        if (this.head == null) return;
        if (this.head.getNext() == null) {
            deleteFromHead();
        }
        Node preLast = this.head;
        while (preLast.getNext().getNext() != null) {
            preLast = preLast.getNext();
        }
        preLast.setNext(null);
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
    public static void main(String []args) {
        // Write your code here:
        MyLinkedList seasons = new MyLinkedList();
        seasons.printList();
        seasons.addAtHead("summer");
        seasons.addAtHead("spring");
        seasons.printList();
        seasons.addAtTail("fall");
        seasons.addAtTail("winter");
        seasons.printList();
        seasons.deleteFromHead();
        seasons.printList();
        seasons.deleteFromTail();
        seasons.printList();
    }
}
