package mylinkedlist;

/**
 *
 * @author 235420
 */
public class singleNodeRunner 
{
    
    public static void main(String[] args)
    {
        
        singleNode<Integer> one = new singleNode<Integer>(5);
        singleNode<Integer> two = new singleNode<Integer>(8);
        singleNode<Integer> three = new singleNode<Integer>(7, two);
        two.setNext(one);
        while(three != null)
        {
            System.out.print(three.getValue() + " ");
            three = three.getNext();
        }
        System.out.println();
    }
        
}
