class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class linkedlist{
    Node head;
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }
    void insertAtbeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    void removeAtBeginning(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void removeAtEnd(){
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
    }
    void print(){
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print(temp);
    }
}
public class ll {
    public static void main(String []args) {
        linkedlist lis = new linkedlist();
        lis.insertAtbeginning(10);
        lis.insertAtbeginning(20);
        lis.insertAtbeginning(30);
        lis.insertAtbeginning(40);
        lis.insertAtbeginning(50);
        lis.print();
        lis.removeAtBeginning();
        System.out.println();
        lis.print();
        lis.removeAtEnd();
        System.out.println();
        lis.print();
    }
}
