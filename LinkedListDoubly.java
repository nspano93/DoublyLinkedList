
public class LinkedListDoubly <Type extends Comparable<Type>> {
	
	private ListNodeDoubly<Type>first;
	private ListNodeDoubly<Type>last;
	int size=0;
	
	public LinkedListDoubly() {
		first=null;
		last=null;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean addLast(Type obj) {
		ListNodeDoubly<Type>newNode = new ListNodeDoubly<Type>(obj);
		
		if (first==null) {
			first=newNode;
			last=newNode;
		}
		else {
			last.setNext(newNode);
			newNode.setPrevious(last);
			last=newNode;
		}
		size++;
		return true;
	}
	
	
	public void addFirst(Type obj) {
		ListNodeDoubly<Type>newNode = new ListNodeDoubly<Type>(obj);
		
		if(first==null) {
			first=newNode;
			last=newNode;
		}
		else {
			first.setPrevious(newNode);
			newNode.setNext(first);
			first=newNode;
		}size++;
		
	}
	
	
	public Type removeFirst() {
		//ListNodeDoubly<Type>current;
		
		Type temp= first.getValue();
		
	
		if(first==null) {
			return null;
		}
		
		
		if(first.getNext()==null) {
			first=null;
			last=null;
			size--;
			return temp;
		}
		else 
		{
		first=first.getNext();
		first.setPrevious(null);
		size--;
		}
		return temp;
		
		
	}
	
	public Type removeLast() {
		
		Type temp = last.getValue();
		
		if(first==null) {
			return null;
		}
		
		if (last.getPrevious()==null) {
			first=null;
			last=null;
			size--;
			return temp;
		}else {
			last=last.getPrevious();
			last.setNext(null);
			size--;
			return temp;
		}
		
	}
	
	public void add(int i, Type obj) {
		ListNodeDoubly<Type>current = first;
		ListNodeDoubly<Type>newNode = new ListNodeDoubly<Type>(obj);
		int counter = 0;
		if(i<0 || i >size) {
			throw new IndexOutOfBoundsException("Cannot have index out of bounds");
		}
		
		if(i==size) {
			addLast(obj);
		}else if(i==0) {
			addFirst(obj);
		}
		else {
			while(current!=null && counter !=i) {
				current=current.getNext();
				counter++;
			}
			current.getPrevious().setNext(newNode);
			
			newNode.setPrevious(current.getPrevious());
			newNode.setNext(current);
			current.setPrevious(newNode);
			
			size++;
	
		}
		
		
		
	}
	
	public Type remove(int i) {
		
		ListNodeDoubly<Type>current = first;
		int counter = 0;
		
		if(i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Cannot have index out of bounds");
		}
		
		if(i==(size-1)) {
			Type temp =last.getValue();
			last=last.getPrevious();
			last.setNext(null);
			size--;
			return temp;
		}
		else if (i==0) 
		{
			removeFirst();
		}
		else 
		{
			while(current != null && counter != i) 
			{
				current=current.getNext();
				counter++;
			}
			
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			size--;
		}
		
		
		return current.getValue();
	}
	
	
	
	
	public void printFowards() {
		//toString
		ListNodeDoubly<Type>current;
		current=first;
		while(current!=null) {
			System.out.println(current.getValue());
			current=current.getNext();
		}
		
		
	}
	
	public void printBackwards() {
		//toString
		ListNodeDoubly<Type>current;
		current=last;
		while(current!=null) {
			System.out.println(current.getValue());
			current=current.getPrevious();
		}
		
		
	}
	
	
	

}//class end
