
public class LinkedListDoublyDriver {
	
	public static void main(String[]args) {
		LinkedListDoubly<String>list1 = new LinkedListDoubly<String>();
		
		list1.addLast("Dylan");
		list1.addLast("Sam");
		list1.addLast("Leslie");
		list1.addLast("Karen");
		//list.addFirst("Johnny");
		
		//list.addLast("Dennis");
		
		//System.out.println(list.removeFirst());
		//list.removeFirst();
		list1.addLast("Bob");
		//System.out.println(list.removeLast());
		//list.add(0, "Added String Success");
		//System.out.println(list.remove(4));
	//list.remove(4);
	
		list1.printFowards();
		System.out.println("Testing Remove:");
		System.out.println(list1.remove(4));
		
		System.out.println("Testing Print:");
		//list.printFowards();
		list1.printBackwards();
		
		System.out.println("*************************************************************");
		
		LinkedListDoubly<String>list=new LinkedListDoubly<String>();
		System.out.println("\n***Testing add (add or addLast are the same, you can change the driver to accomodate your code***");
		list.addLast("Long Branch");
		list.addLast("Asbury Park");
		list.addLast("Freehold");
		list.addLast("Seaside Heights");
		list.addLast("Point Pleasant");
		list.addLast("Belmar");
		list.addLast("Neptune");
		list.addLast("Manasquan");
		list.addLast("Atlantic HighLands");
		list.addLast("Belmar");
		list.printFowards();
	
		System.out.println("\n***Testing addFirst***");
		list.addFirst("Bayone");
		list.addFirst("Newark");
		list.addFirst("Manalapan");
		list.printFowards();
	
		System.out.println("\n***Testing removeFirst() (or deleteFirst)***");
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		list.printFowards();
	
		System.out.println("\n***Testing add(int i,Type obj) which is insert***");
		list.add(0,"Manalapan");
		list.add(4,"Newark");
		list.add(list.size(),"Bayonne");
		list.printFowards();
	
		System.out.println("\n***Testing remove(int i)***");
		System.out.println("removing: "+list.remove(0));
		System.out.println("removing: "+list.remove(4));
		System.out.println("removing: "+list.remove(list.size()-1));
		list.printFowards();
		
		System.out.println("\n***Testing removeLast (or deleteLast)***");
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		list.printFowards();
		
		
		/*
		//We are NOT testing remove(Type obj) at this time
		System.out.println("\nTesting remove(Type obj)");
		System.out.println("removing: "+list.remove("Asbury Park"));
		System.out.println("removing: "+list.remove("Newark"));
		System.out.println("removing: "+list.remove("Neptune"));
		list.printForwards();
		*/
	
		System.out.println("\n *** Testing printBackwards -- iteratively (non-recursive) ****");
		list.printBackwards();
		
		
	}

}
