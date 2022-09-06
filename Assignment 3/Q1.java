import java.util.*;

class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }

    public char getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    
    MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void add(char data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }
    
    public Node getHead() {
        return this.head;
    }
    
    public Node getTail() {
        return this.tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void printList() {
        Node current = this.head;
        while (current!=null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print("->");
            }
            current = current.getNext();
        }
        System.out.println("");
    }
}

class ReverseMain {
    public static Node reverseList(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
}

public class Q1 {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        MyLinkedList myRevList = new MyLinkedList();
        Node revHead;
        Scanner scanner = new Scanner(System.in);
        int numNodes;
        char currChar;
        ReverseMain revMain = new ReverseMain();

        System.out.print("Enter the number of nodes: ");
        numNodes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter the data in Node1:"); // According to the question, it is always printed as Node1 and doesn't print Node 2 and all
            currChar = scanner.nextLine().trim().charAt(0);
            myList.add(currChar);
        }

        revHead = revMain.reverseList(myList.getHead());
        myRevList.setHead(revHead);
        myRevList.printList();
    }
}
