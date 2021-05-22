/*
 * Added INode interface objects for head and tail in the MyLinkedList class
 */

public class MyLinkdList {

    public INode head;
    public INode tail;

    public MyLinkdList(){
        this.head = head ;
        this.tail = tail;
    }

    /*
     * this method will add nodes.
    */

    public void add(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /*
     * append values in the linked list.
     */
    public void append(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    /*
     *  Insert  value in the linkedlist.
     */
    public void insert(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /*
     *  delete the first value of the linkedlist.
     */

    public void popFirst(INode myNode) {
        INode tempNode = myNode;
        this.head = tempNode.getNext();
    }

    /*
     *  delete the last value of the linkedlist.
     */

    public INode popLast(INode myNode) {
        INode tempNode = myNode;
        while(tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail = tempNode.getNext();
        tempNode.getNext().setNext(null);
        return tempNode;
    }

    /*
     *  serach the given node from the linkedlist.
     */
    public INode searchNode(INode myNode) {
        INode tempNode = this.head;
        while(tempNode !=null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(myNode.getKey())){
                System.out.println("The Found value: "+tempNode.getKey());
                break;
            }
            else
                tempNode = tempNode.getNext();
        }

        return tempNode;
    }

    /*
     *  Add value after particular element in the linkedlist.
     */

    public void addAfter(INode myNode) {
        INode tempNode = this.head;
        while(tempNode !=null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(30)) {
                myNode.setNext(tempNode.getNext());
                tempNode.setNext(myNode);
                break;
            } else
                tempNode = tempNode.getNext();
        }
    }

    /*
     *  Delete particular element from the linkedlist.
     */
    public void delete_40(INode myNode) {

        INode tempNode = this.head;
        INode previousNode = this.head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(40)) {
                previousNode.setNext(tempNode.getNext());
                this.tail = tempNode.getNext();
                break;
            } else {
                previousNode = tempNode;
                tempNode = tempNode.getNext();
            }
        }
    }

    /*
     * this method will count and give the size of the linked list.
     */
    public Integer sizeOfList() {
        Integer count = 0;
        INode tempNode = this.head;
        if(tempNode != null){
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
    }

    /**
     * this method will print the node.
     */
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head ;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}