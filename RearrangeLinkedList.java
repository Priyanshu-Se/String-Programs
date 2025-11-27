package com.org.java;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class RearrangeLinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void rearrange() {
        if (head == null || head.next == null) return;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RearrangeLinkedList list = new RearrangeLinkedList();
        for (int i = 1; i <= 7; i++) list.add(i);

        System.out.print("Original: ");
        list.printList();

        list.rearrange();
        System.out.print("Rearranged: ");
        list.printList();
    }
}