
public class ListNodeDoubly<Type> {
	
	private Type value;
	private ListNodeDoubly<Type>next;
	private ListNodeDoubly<Type>previous;
	
	
	public ListNodeDoubly(Type initObj) {
		next=null;
		previous=null;
		value= initObj;
	}
	
	public ListNodeDoubly(Type initValue, ListNodeDoubly<Type>initPrevious, ListNodeDoubly<Type>initNext) {
		previous=initPrevious;
		next=initNext;
		value=initValue;
	}
	
	public Type getValue() {
		return value;
	}
	
	public ListNodeDoubly<Type>getPrevious(){
		return previous;
	}
	
	public ListNodeDoubly<Type>getNext(){
		return next;
	}
	
	public void setPrevious(ListNodeDoubly<Type> newPrevious) {
		previous=newPrevious;
	}
	
	public void setNext(ListNodeDoubly<Type> newNext) {
		next=newNext;
	}
	
	public void setValue(Type newValue) {
		value = newValue;
	}
	
	

}
