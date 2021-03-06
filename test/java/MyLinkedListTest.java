import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3Numbers_WhenToLinkedList_ShouldAddedTOTOP(){
        MyNode<Integer>  myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.add(myFirstNode);
        myLinkdList.add(mySecondNode);
        myLinkdList.add(myThirdNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(myThirdNode) &&
                         myLinkdList.head.getNext().equals(mySecondNode) &&
                         myLinkdList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldAppendTOTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(myThirdNode) &&
                         myLinkdList.head.getNext().equals(mySecondNode) &&
                         myLinkdList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldInsertInBetween() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.add(myFirstNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.insert(myFirstNode,mySecondNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(myFirstNode) &&
                         myLinkdList.head.getNext().equals(mySecondNode) &&
                         myLinkdList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldDeleteFirstNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        myLinkdList.popFirst(myFirstNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(mySecondNode) &&
                         myLinkdList.head.getNext().equals(myThirdNode) &&
                         myLinkdList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldDeleteLastNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        myLinkdList.popLast(myFirstNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(myFirstNode) &&
                         myLinkdList.head.getNext().equals(mySecondNode) &&
                         myLinkdList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldSearchNumber() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        INode foundNode = myLinkdList.searchNode(mySecondNode);

        boolean result = foundNode.equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenToLinkedList_ShouldAddAfter30() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        myLinkdList.addAfter(myFourthNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(myFirstNode) &&
                         myLinkdList.head.getNext().equals(mySecondNode) &&
                         myLinkdList.head.getNext().getNext().equals(myFourthNode) &&
                         myLinkdList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenToLinkedListShouldDelete40() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myFourthNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        myLinkdList.delete_40(myFourthNode);
        myLinkdList.printMyNodes();
        myLinkdList.sizeOfList();
        System.out.println("Size of list is: "+myLinkdList.sizeOfList());


        boolean result = myLinkdList.head.equals(myFirstNode) &&
                myLinkdList.head.getNext().equals(mySecondNode) &&
                myLinkdList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }
}