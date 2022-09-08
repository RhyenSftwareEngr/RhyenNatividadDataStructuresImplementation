package prelims;

public class Node <T>
{
    public T data;
    private Node<T> next;
    private Node<T> previous;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData()
    {
        return data;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    public void setPreviousNode(Node<T> node) {
        this.previous = node;
    }
    public Node getPreviousNode() {
        return this.previous;
    }


}

