package com.practice.datastructure;

/**
 * @author enggc
 *
 */
public class SinglyLinkedList {

	/**
	 * LinkedList currentNode node instance
	 */
	Node head;

	/**
	 * Program initialization
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList linkedList_Src = new SinglyLinkedList();
		insertElements(linkedList_Src);
		linkedList_Src.print(); // print the data
		// linkedList_Src.search(1); // search the given element
		// linkedList_Src.remove(1000); // remove the given element
	}

	/**
	 * To print LinkedList data
	 */
	private void print() {
		Node currentNode = head;
		System.out.print("[");
		while (currentNode.ref != null) {
			System.out.print(currentNode.data + ", ");
			currentNode = currentNode.ref;
		}
		System.out.print(currentNode.data + "]\n");
	}

	/**
	 * To insert data into LinkedList
	 * 
	 * @param data
	 */
	private void insert(Integer data) {
		Node node = new Node(data);
		node.ref = null;
		if (head == null) {
			head = node;
		} else {
			Node last = head;
			while (last.ref != null) {
				last = last.ref;
			}
			last.ref = node;
		}
	}

	/**
	 * To search given element in the LinkedList
	 * 
	 * @param value
	 */
	private void search(int value) {
		Node currentNode = head;
		int index = 0;
		while (currentNode.data != value) {
			if (currentNode.data != value && currentNode.ref == null) {
				System.out.println("Element doesn't exists.. !!");
				return;
			}
			currentNode = currentNode.ref;
			index++;
		}
		System.out.println("Element found at index: " + index);
	}

	/**
	 * To remove the given element
	 * 
	 * @param value
	 */
	private void remove(int value) {
		Node currentNode = head;
		System.out.print("Original LinkedList: ");
		print();
		if (currentNode.data == value) {
			print();
			head = currentNode.ref;
			return;
		}
		while (currentNode.ref != null) {
			if (currentNode.ref.data == value) {
				System.out.print("LinkedList after removing the element " + value + " : ");
				currentNode.ref = currentNode.ref.ref;
				print();
				return;
			}
			currentNode = currentNode.ref;
		}

	}

	/**
	 * Utility method to fill insert the data
	 * 
	 * @param linkedList_Src
	 */
	private static void insertElements(SinglyLinkedList linkedList_Src) {
		linkedList_Src.insert(1);
		linkedList_Src.insert(2);
		linkedList_Src.insert(3);
		linkedList_Src.insert(4);
		linkedList_Src.insert(5);
		linkedList_Src.insert(6);
		linkedList_Src.insert(100);
		linkedList_Src.insert(150);
		linkedList_Src.insert(88);
		linkedList_Src.insert(195);
		linkedList_Src.insert(250);
		linkedList_Src.insert(1000);
	}
}
