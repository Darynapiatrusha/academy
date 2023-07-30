package by.academy.homework5.Task7;

import java.io.IOException;
import java.util.Scanner;

public class Task7 {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}

		@Override
		public String toString() {
			return "DoublyLinkedListNode [data=" + data + "]";
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}
			this.tail = node;
		}

		public DoublyLinkedListNode getHead() {
			return head;
		}

		public void setHead(DoublyLinkedListNode head) {
			this.head = head;
		}

		public DoublyLinkedListNode getTail() {
			return tail;
		}

		public void setTail(DoublyLinkedListNode tail) {
			this.tail = tail;
		}

		@Override
		public String toString() {
			return "DoublyLinkedList [head=" + head + ", tail=" + tail + "]";
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			System.out.print(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	public static DoublyLinkedListNode reverse(DoublyLinkedListNode listHead) {
		if (listHead == null || listHead.next == null) {
			return listHead;
		}
		DoublyLinkedListNode prev = null;
		DoublyLinkedListNode node = listHead;
		DoublyLinkedListNode next = null;
		while (node != null) {
			next = node.next;
			node.next = prev;
			node.prev = next;
			prev = node;
			node = next;
		}
		return prev;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		DoublyLinkedList llist = new DoublyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			llist.insertNode(llistItem);
		}
		DoublyLinkedListNode llist1 = reverse(llist.head);

		printDoublyLinkedList(llist1, " ");
		scanner.close();
	}
}
