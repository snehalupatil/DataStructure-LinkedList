/*
  * Created a generic interface
  * Added two methods get value and set value
 */
public interface INode<k>
{
    k getKey();
    void setKey(k key);

    INode getNext();
    void setNext(INode next);
}