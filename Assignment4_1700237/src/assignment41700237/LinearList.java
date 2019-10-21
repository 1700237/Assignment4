package assignment41700237;

public class LinearList
{
 private Node head;

public LinearList()
{
 head = null;
}

public boolean isEmpty ()
{
 if (head == null)
   {
     return true;
   }
  else
   {
     return false;
   }
}

public boolean isFull ()
{
 Node temp = new Node();
   if (temp == null)
      {
        return true;
      }
   else
      {
        return false;
      }
}


public boolean addToBack (Car car) 
{
  if(isFull()) 
     {
	System.out.println("List is full, unable to back");
	   return false;
     }
  else 
     {
        Node nextItem = new Node();
	   nextItem.setData(car);
  if(isEmpty()) 
     {
	head = nextItem;
     }
  else 
     {
	Node current = head;
	     while(current.getNext()!=null) 
          {
		      current = current.getNext();
		  }
		      current.setNext(nextItem);
     }
		     return true;
     } 
	  
} 

public Car deleteFromFront() 
{
      if(!isEmpty()) 
          {
	    Car data = head.getData();
	    Node itemToDelete = head;
	    head = head.getNext();

	    return head.getData();
	   }
	      return null;
}
   
   public void display() 
       {
	 if(isEmpty()) 
        {
	      System.out.println("List is empty, nothing to display");
	    }
         else 
            {
	       Node current = head;
	       while(current != null) 
          {
	            current.getData().display();
		    current = current.getNext();
		  }
	    }
	   
       }


}
