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

    public static void main(String[] args) {
        Node linkedlist = createLL(7);
        printLL(linkedlist);
        int len = printLength(linkedlist);
        System.out.println(len);
        linkedlist = insertAtFirst(linkedlist,20);
        printLL(linkedlist);
        printLL(insertAtPosition(linkedlist,3,300));
    }
}
