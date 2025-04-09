package collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		LinkedList<Object> MyList = new LinkedList<Object>();

		while (true) {
		System.out.println(
				" Hello \n please choose from below \n 1. Add element at last \n 2. Add element at first"
						+ "\n 3. Add element at given index \n 4. update element at given index"
						+ "\n 5. Delete first element 6. Delete last element\n 7. Delete given element"
						+ " \n 8. Delete element at given index \n 9. Display elements \n10. Exit");
		
		System.out.println("Enter your Choice");
		int ch = s.nextInt();
		s.nextLine(); // Consume leftover newline

		switch (ch) {
        case 1:
            addElementAtLast(s, MyList);
            break;
        case 2:
            addElementAtFirst(s, MyList);
            break;
        case 3:
            addElementAtIndex(s, MyList);
            break;
        case 4:
            updateElementAtIndex(s, MyList);
            break;
        case 5:
            deleteFirstElement(MyList);
            break;
        case 6:
            deleteLastElement(MyList);
            break;
        case 7:
            deleteGivenElement(s, MyList);
            break;
        case 8:
            deleteElementAtIndex(s, MyList);
            break;
        case 9:
            displayElements(MyList);
            break;
        case 10:
            System.out.println("Exit");
            s.close();
            return;
        default:
            System.out.println("Invalid choice. Please try again.");
		}
		}
	}

	private static void displayElements(LinkedList myList) {
        System.out.println("The list of elements : " + myList);
		
	}

	private static void deleteElementAtIndex(Scanner s, LinkedList myList) {
		System.out.println("Enter index to delete:");
        int index = s.nextInt();
        s.nextLine();
        myList.remove(index);

	}

	private static void deleteGivenElement(Scanner s, LinkedList myList) {
		 System.out.println("Enter element to delete:");
	        Object element = s.nextLine();	
	        
	        myList.remove(element);
	}

	private static void deleteLastElement(LinkedList myList) {
        myList.removeLast();
		
	}

	private static void deleteFirstElement(LinkedList myList) {
		myList.removeFirst();		
	}

	private static void updateElementAtIndex(Scanner s, LinkedList myList) {
		System.out.println("Enter index to update:");
        int index = s.nextInt();	
        s.nextLine();
        System.out.println("Enter new element:");
        Object newElement = s.nextLine();
        
        myList.set(index, newElement);

	}

	private static void addElementAtIndex(Scanner s, LinkedList myList) {
		System.out.println("Enter index to add:");
        int index = s.nextInt();
        s.nextLine();
        System.out.println("Enter element to add:");
        Object element = s.nextLine();
		
        myList.add(index, element);

	}

	private static void addElementAtFirst(Scanner s, LinkedList myList) {
		System.out.println("Enter element to add at the first:");
        Object element = s.nextLine();
        myList.addFirst(element);		
	}

	private static void addElementAtLast(Scanner s, LinkedList<Object> myList) {
		System.out.print("Enter the element to add at last: ");
        Object element = s.nextLine();
        myList.addLast(element);
	}
}
   