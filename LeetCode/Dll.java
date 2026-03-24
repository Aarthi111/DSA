class Node{
    String name;
    Node next;
    Node prev; 
    Node(String name){
        this.name = name;
        
    }
}
class DoublyLinkedList{
    Node head;
    Node tail;
    void insertAtBeginning(String name){
        Node newNode = new Node(name);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    void insertAtEnd(String name){
        Node newNode = new Node(name);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }
    
    void deleteAtFirst(){
        if(head==null || head.next==null){
            head = null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deleteAtLast(){
        if(tail==null || tail.prev==null){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    
    void printForward(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.name +"-->");
            temp=temp.next;
        }
        System.out.print(temp);
        System.out.println();

    }
    void printBackward(){
        if(tail == null){
            return;
        }
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.name +"-->");
            temp=temp.prev;
        }
        System.out.print(temp);
        System.out.println();

    }
    public static void main(String args[]){
        DoublyLinkedList list = new DoublyLinkedList();
        // list.insertAtBeginning("Ken");
        // list.insertAtBeginning("Bun");
        list.insertAtBeginning("Sun");
        list.insertAtEnd("Naruto");
        System.out.println("Original list");
        list.printForward();
        System.err.println("Delete at first list");
        list.deleteAtFirst();
        list.printForward();
        list.printBackward();
        System.err.println("Delete at Last list");
        list.deleteAtLast();
        list.printForward();
        list.printBackward();
    }
}