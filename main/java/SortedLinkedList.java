/*
 * this is a generic class having type T.
 * inner class Node which will initiallize the data and next.
 */
public class SortedLinkedList<T extends Comparable> {
    public class Node<T extends Comparable<T>>
    {
        public T data;
        public Node<T> next;

        public Node( T i) {
            data = i;
            next = null;

        }
    }

    /**
     * created two values head and temp.
     */
    public Node head;
    public Node temp;

    protected SortedLinkedList() {
        head = null;
        temp = null;
    }

    /**
     * add values in the linked list.
     */
    public void add(T data) {

        Node newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        }
        else{
            Node curr = head.next;
            Node prev = head;
            while (curr != null) {
                if (data.compareTo(curr.data) < 0) {
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    /**
     * display the linkedlist.
     */
    public void display()
    {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}