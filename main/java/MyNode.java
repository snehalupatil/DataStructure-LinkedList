/*
 * created a sub class of Interface Inode.
 */

public class MyNode<k> implements INode<k>{

    private k key;
    private INode next;


    /*
     * Consider kay as a parameter in the constructor
     * it initiates the value and next value should be 0
     */
    public MyNode(k key){
        this.key = key;
        this.next = null;
    }

    @Override
    public k getKey() {
        return key;
    }

    @Override
    public void setKey(k key) {
        this.key = key;
    }

    public INode<k> getNext() {
        return next;
    }

    /**
     * it will set the next key value.
    */
    public void setNext(INode next) {
        this.next = next;
    }


}