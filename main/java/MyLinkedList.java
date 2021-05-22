public class MyLinkdList {
    public INode head;
    public INode tail;

    public MyLinkdList(){
        this.head = head ;
        this.tail = tail;
    }

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

    public void insert(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void popFirst(INode myNode) {
        INode tempNode = myNode;
        this.head = tempNode.getNext();
    }


    public INode popLast(INode myNode) {
        INode tempNode = myNode;
        while(tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail = tempNode.getNext();
        tempNode.getNext().setNext(null);
        return tempNode;
    }

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

    public Integer sizeOfList() {
        Integer count = 0;
        INode tempNode = this.head;
        if(tempNode != null){
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
    }
}