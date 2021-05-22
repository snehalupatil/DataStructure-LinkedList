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

    public void pop(INode myNode) {
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
}