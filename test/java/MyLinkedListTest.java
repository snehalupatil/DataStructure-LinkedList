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
    public void given3NumbersWhenToLinkedListShouldPopedoutNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        myLinkdList.pop(myFirstNode);
        myLinkdList.printMyNodes();

        boolean result = myLinkdList.head.equals(mySecondNode) &&
                         myLinkdList.head.getNext().equals(myThirdNode) &&
                         myLinkdList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}