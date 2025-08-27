package mylinkedlist;

/**
 *
 * @author 235420
 */
public class singleNode<T> 
{
    
    private T value;
    private singleNode nextNode;
    
    public singleNode(T var)
    {
        value = var;
        nextNode = null;
    }
    
    public singleNode(T var2, singleNode node)
    {
        value = var2;
        nextNode = node;
    }
    
    public T getValue()
    {
        return value;
    }
    
    public singleNode getNext()
    {
        return nextNode;
    }
    
    public void setNext(singleNode node)
    {
        nextNode = node;
    }
    
    public void setValue(T value)
    {
        this.value = value;
    }
            
}


