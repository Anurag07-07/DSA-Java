package LinkedList;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL {
    public static Node createLL(int N) {
        Node head = new Node(1);
        Node tail = head;
        for (int i = 2;i<=N;i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static int printLength(Node head) {
        Node curr = head;
        int length = 0;
        while (curr!=null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    public static Node insertAtFirst(Node head,int data) {
        Node n1 = new Node(data);
        n1.next = head;
        return n1;
    }

    public static Node insertAtPosition(Node head,int pos,int data) {
        if (pos==0){
            return  insertAtFirst(head,data);
        }

        if (pos>printLength(head)){
            return head;
        }



        Node curr = head;
        for (int jump = 1; jump <=pos-1 ; jump++) {
            curr = curr.next;
        }
        Node n1 = new Node(data);
        n1.next = curr.next;
        curr.next = n1;
        return head;
    }

    public static int KthElement(Node head,int K) {
        if (K==0){
            return head.data;
        }
        if (K>printLength(head)){
            return -1;
        }
        Node curr = head;
        for (int i = 1; i <=K-1 ; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    static  Node  InsertSorted(Node head,int data){
        if ( head==null ||data<head.data){
            Node n = new Node(data);
            n.next = head;
            return n;
        }

        Node curr = head;
        while(curr.next!=null && curr.next.data<data){
                curr = curr.next;
        }
        Node n1= new Node(data);
        n1.next = curr.next;
        curr.next = n1;
        return head;
    }

    static  Node ReverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node ReverseTheGroups(Node head, int K) {
        // 1. Check if there are at least K nodes left to reverse
        Node check = head;
        for (int i = 0; i < K; i++) {
            if (check == null) return head;
            check = check.next;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // 2. Reverse the current group of K
        while (count < K && current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev forward
            current = next;      // Move current forward
            count++;
        }

        // 3. Recurse: 'head' is now the tail of this group.
        // Point its next to the result of the next group.
        if (next != null) {
            head.next = ReverseTheGroups(next, K);
        }

        // 4. 'prev' is the new head of this reversed segment
        return prev;
    }

    public static void main(String[] args) {
        Node linkedlist = createLL(7);
//        linkedlist = InsertSorted(linkedlist,5);
        printLL(linkedlist);

        linkedlist = ReverseTheGroups(linkedlist,3);
        printLL(linkedlist);

//        linkedlist = ReverseLinkedList(linkedlist);
//        printLL(linkedlist);
//
//        int len = printLength(linkedlist);
//        System.out.println(len);
//
//        linkedlist = insertAtFirst(linkedlist,20);
//        printLL(linkedlist);
//
//        printLL(insertAtPosition(linkedlist,3,300));
//
//        System.out.println(KthElement(linkedlist,3));
//        System.out.println(KthElement(linkedlist,0));
//        System.out.println(KthElement(linkedlist,20));
    }
}
