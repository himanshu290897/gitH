package circular_linklist;

public class CircularLL {
	Node head;
	
	public CircularLL() {
		head = null;
	}
	
	public void insert(int value)
	{
		Node tmp = new Node(value);
		
		if(head == null)
		{
			head = tmp;	
			head.setNext(head);
		}
		else
		{
			Node it = head;
			
			while(it.getNext() != head)
			{
				it = it.getNext();
			}
			it.setNext(tmp);
			tmp.setNext(head);
			head = tmp;
		}
	}
	
	public void append(int value) {
		Node tmp = new Node(value);
		if(head == null)
		{
			head = tmp;
			head.setNext(head);
		}
		else
		{
			Node it = head;
			
			while(it.getNext() != head)
			{
				it = it.getNext();
			}
			it.setNext(tmp);
			tmp.setNext(head);
		 }
	}
   
	public void deleteFirst()
	{
	   
		if(head == null)
		{
			System.out.println("Cll is empty");
		}
		else
		{
			if(head.getNext()==head)
			{
				head.setNext(null);
				head = null;
			}
			else
			{
				int x = head.getData();
				head.setData(head.getNext().getData());
				head.getNext().setData(x);
				
				Node tmp = head.getNext();
				head.setNext(tmp.getNext());
				tmp.setNext(null);
			}
		}
	}
	
	public void reverse() {
		Node itp = head;
		Node it = head.getNext();
		Node itn = head.getNext();
		
		while(it!=head)
		{
			itn = itn.getNext();
			it.setNext(itp);
			itp = it;
			it = itn;
		}
		head.setNext(itp);
		head = itp;
	}
	


	public String toString() {
		
		String str = "";
		Node it = head;
		
		do
		{
			str += "" +it + "-->";
			it = it.getNext();
		}while(it != head);
		return str;
	}


}
