package day_02;
class Node{
    int data;
    Node next;
}
public class SinglyLinkedList {
    Node head;
    void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=head;
        
        head=newNode;//Shifting of head to newNode
    }
    void addLast(int val){
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
            head=newNode;
        else{
            Node lastNode=head;
            while(lastNode.next != null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
    }
    void deleteNode(int val){
        if(head.data==val){
            head=head.next;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.data==val){
                    temp.next=temp.next.next;
                    break;
                }
                 temp=temp.next;   
            }
        }
    }
    
    boolean searchNode(int val){
        Node temp=head;
        while(temp !=null){
            if(temp.data==val)
                return true;
            temp=temp.next;
        }
        return false;
    }
    void printList(){
         Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.addFirst(10);
        sll.addFirst(20);
        sll.addFirst(30);
//        sll.addFirst(40);
//        sll.addFirst(50);
        
        sll.addLast(100);
        sll.addLast(200);
        sll.addLast(300);
        
        sll.printList();
        
        System.out.println(sll.searchNode(3000));
//        sll.deleteNode(300);
//        
//        sll.printList();
    }
}
