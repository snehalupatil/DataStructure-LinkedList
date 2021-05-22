import org.junit.jupiter.api.Test;

/**
 * test class will check the sorted linkedlist.
 */
public class SortedLinkedListTest {
    @Test
    public void sortTest() {
        SortedLinkedList list=new SortedLinkedList();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
    }
}